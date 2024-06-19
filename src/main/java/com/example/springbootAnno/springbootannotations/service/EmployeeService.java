package com.example.springbootAnno.springbootannotations.service;

import com.example.springbootAnno.springbootannotations.model.Employee;
import com.example.springbootAnno.springbootannotations.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    public EmployeeRepository employeeRepository;
    public Employee getEmployee(){
        //this is the place for business Logic

        // this layer interacts with the repository layer.
//        return "Employee from Service Layer";
//        return employeeRepository.getEmployeeData();

        Employee employee = new Employee("61","Shivansh", "Sapna Sangeeta");
        return employee;
    }

    public Employee createEmployee(Employee employee) {
        return employee; // generally yahaa par repository ko call karte and uska object returned
    }
}