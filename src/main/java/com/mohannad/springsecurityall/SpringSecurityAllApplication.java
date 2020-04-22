package com.mohannad.springsecurityall;

import com.mohannad.springsecurityall.model.Todo;
import com.mohannad.springsecurityall.service.TodoService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringSecurityAllApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityAllApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(TodoService todoService){
        return args -> {
            todoService.addTodo(new Todo(1l ,"stydu udacity course"));
            todoService.addTodo(new Todo(2l ,"solve codeforces problems"));
            todoService.addTodo(new Todo(3l ,"play hard"));
            todoService.addTodo(new Todo(4l ,"sleep well"));
        };
    }

}
