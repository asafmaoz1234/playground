package com.asaf.maoz.playground.equalandhash;

import lombok.Data;

import java.util.Set;

@Data
public class Manager {
    private int id;
    private String name;
    private Set<Employee> employees;
}
