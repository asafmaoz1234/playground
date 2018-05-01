package com.asaf.maoz.playground.equalandhash;

import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class EqualAndHashTest {

    private Employee employee;
    private Manager manager;
    private final int DEF_EMPLOYEE_ID = 2;
    private final String DEF_EMPLOYEE_NAME = "empName";
    private final int DEF_MANAGER_ID = 1;
    private final String DEF_MANAGER_NAME = "manName";
    private Set<Employee> employeeSet;

    @Before
    public void setUp() throws Exception {
        this.employee = new EmployeeBuilder()
                .withId(DEF_EMPLOYEE_ID)
                .withName(DEF_EMPLOYEE_NAME)
                .build();

        this.employeeSet = new HashSet<>();
        this.employeeSet.add(this.employee);

        this.manager = new ManagerBuilder()
                .withId(DEF_MANAGER_ID)
                .withName(DEF_MANAGER_NAME)
                .withEmployees(this.employeeSet)
                .build();
    }

    /**
     * Both instances changed, still marked equals!
     */
    @Test
    public void instancesChanged_Equals(){
        Manager sampleManager = this.manager;
        sampleManager.setId(3);

        this.manager.setId(5);

        assertTrue(this.manager.equals(sampleManager));
        assertTrue(this.manager.hashCode() == sampleManager.hashCode());
    }

    /**
     * the copy instance changed value
     * but its still marked equal!
     */
    @Test
    public void copyInstanceChangeId_Equals(){
        Manager sampleManager = this.manager;
        sampleManager.setId(3);
        sampleManager.setName("changedName");

        assertTrue(this.manager.equals(sampleManager));
        assertTrue(this.manager.hashCode() == sampleManager.hashCode());
    }

    @Test
    public void diffInstancesChangedValues_notEquals(){
        Manager sampleManager = new ManagerBuilder()
                .withId(DEF_MANAGER_ID)
                .withName(DEF_MANAGER_NAME)
                .withEmployees(this.employeeSet)
                .build();

        sampleManager.setId(3);

        assertFalse(this.manager.equals(sampleManager));
        assertFalse(this.manager.hashCode() == sampleManager.hashCode());
    }

    @Test
    public void diffInstancesSameValues_equals() {
        Manager sampleManager = new ManagerBuilder()
                .withId(DEF_MANAGER_ID)
                .withName(DEF_MANAGER_NAME)
                .withEmployees(this.employeeSet)
                .build();

        assertTrue(this.manager.equals(sampleManager));
        assertTrue(this.manager.hashCode() == sampleManager.hashCode());
    }
}
