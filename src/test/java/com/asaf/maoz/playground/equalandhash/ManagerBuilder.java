package com.asaf.maoz.playground.equalandhash;

import java.util.Set;

public class ManagerBuilder {

    private int id;
    private String name;
    private Set<Employee> employees;

    public Manager build(){
        Manager manager = new Manager();
        manager.setId(this.id);
        manager.setName(this.name);
        manager.setEmployees(this.getEmployees());
        return manager;
    }

    public int getId() {
        return id;
    }

    public ManagerBuilder withId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public ManagerBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public Set<Employee> getEmployees() {
        return employees;
    }

    public ManagerBuilder withEmployees(Set<Employee> employees) {
        this.employees = employees;
        return this;
    }

}
