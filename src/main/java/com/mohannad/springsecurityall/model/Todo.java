package com.mohannad.springsecurityall.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author Mohannad Elmagharby
 * on 4/22/2020
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Todo {
    @Id
    private Long id;
    private String content;
}
