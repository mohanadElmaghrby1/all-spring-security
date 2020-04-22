package com.mohannad.springsecurityall.repositories;

import com.mohannad.springsecurityall.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Mohannad Elmagharby
 * on 4/22/2020
 */
public interface TodoRepository extends JpaRepository<Todo , Long> {
}
