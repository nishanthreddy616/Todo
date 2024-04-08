package com.nishanth.Todo.Repository;

import com.nishanth.Todo.model.Todo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepository extends MongoRepository<Todo,String> {
    List<Todo> findByTitle(String title);

    List<Todo> findByCompleted(Boolean completed);
}
