package com.mohannad.springsecurityall.service;

import com.mohannad.springsecurityall.model.Todo;

import java.util.List;
import java.util.Optional;

/**
 * @author Mohannad Elmagharby
 * on 4/22/2020
 */
public interface TodoService {
    Todo addTodo(Todo todo);
    Optional<Todo> getTodo(Long id);
    List<Todo> getTodos();
}
