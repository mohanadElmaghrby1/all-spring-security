package com.mohannad.springsecurityall.service;

import com.mohannad.springsecurityall.model.Todo;
import com.mohannad.springsecurityall.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author Mohannad Elmagharby
 * on 4/22/2020
 */
@Service
public class TodoServiceImpl implements TodoService {
    @Autowired
    private TodoRepository todoRepository;


    @Override
    public Todo addTodo(Todo todo) {
        return todoRepository.save(todo);
    }

    @Override
    public Optional<Todo> getTodo(Long id) {
        return todoRepository.findById(id);
    }

    @Override
    public List<Todo> getTodos() {
        return todoRepository.findAll();
    }
}
