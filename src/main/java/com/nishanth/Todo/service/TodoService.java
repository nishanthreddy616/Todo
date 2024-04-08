package com.nishanth.Todo.service;

import com.nishanth.Todo.Repository.TodoRepository;
import com.nishanth.Todo.model.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class TodoService {
    @Autowired
    private TodoRepository todoRepository;

    public Todo addTodo(Todo todo){
        todo.setTodoId(UUID.randomUUID().toString().split("-")[0]);
       return todoRepository.save(todo);
    }

    public Todo findTodo(String todoId)
    {
        return todoRepository.findById(todoId).get();
    }

    public List<Todo> findAll()
    {
        return todoRepository.findAll();
    }

    public List<Todo> findbyTitle(String title){
      return todoRepository.findByTitle(title);
    }

    public List<Todo> findbyCompleted(Boolean completed)
    {
        return todoRepository.findByCompleted(completed);
    }

    public String deleteTodo(String todoId)
    {
        todoRepository.deleteById(todoId);
        return todoId+"Deleted successfully";

    }
}
