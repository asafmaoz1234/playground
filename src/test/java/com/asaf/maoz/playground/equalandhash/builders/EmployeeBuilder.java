package com.asaf.maoz.playground.equalandhash.builders;

import com.asaf.maoz.playground.equalandhash.Employee;

public class EmployeeBuilder {

    private int id;
    private String name;

    public Employee build(){
        Employee employee = new Employee();
        employee.setId(this.getId());
        employee.setName(this.getName());
        return employee;
    }

    public int getId() {
        return id;
    }

    public EmployeeBuilder withId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public EmployeeBuilder withName(String name) {
        this.name = name;
        return this;
    }


}
