package com.example.springbootAnno.springbootannotations.model;

public class Employee {
    private String employeeId;
    private String employeeName;
    private String employeeAddress;

    public Employee(String employeeId, String employeeName, String employeeAddress) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeAddress = employeeAddress;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }
 }