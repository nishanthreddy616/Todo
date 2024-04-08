package com.nishanth.Todo.controller;

import com.nishanth.Todo.model.Todo;
import com.nishanth.Todo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoController {

private final TodoService todoService;

    @Autowired
    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Todo createTodo(@RequestBody Todo todo)
    {
      return todoService.addTodo(todo);
    }

    @GetMapping
    public List<Todo> getAllTodos()
    {
        return todoService.findAll();
    }

    @GetMapping("/{todoId}")
    public Todo getTodoById(@PathVariable String todoId)
    {
        return todoService.findTodo(todoId);
    }

    @GetMapping("/title/{title}")
    public List<Todo> getTodoByTitle( @PathVariable String title){
        return todoService.findbyTitle(title);
    }

    @GetMapping("/completed/{completed}")
    public List<Todo> getByCompleted(@PathVariable Boolean completed)
    {
        return todoService.findbyCompleted(completed);
    }

    @DeleteMapping("/{todoId}")
    public String deleteTodo(@PathVariable String todoId)
    {
        return todoService.deleteTodo(todoId);
    }
}
