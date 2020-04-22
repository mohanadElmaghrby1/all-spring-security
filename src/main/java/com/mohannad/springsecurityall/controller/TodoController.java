package com.mohannad.springsecurityall.controller;

import com.mohannad.springsecurityall.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Mohannad Elmagharby
 * on 4/22/2020
 */
@RestController
@RequestMapping("/api/v0/")
public class TodoController {

    @Autowired
    private TodoService todoService;

    @GetMapping("todos")
    public ResponseEntity<?> getTodos(){
        return ResponseEntity.ok(todoService.getTodos());
    }
}
