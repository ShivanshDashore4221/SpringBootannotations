package com.example.springbootAnno.springbootannotations.controller;

import com.example.springbootAnno.springbootannotations.model.Employee;
import com.example.springbootAnno.springbootannotations.service.EmployeeService;
import com.example.springbootAnno.springbootannotations.service.Subject;
import com.example.springbootAnno.springbootannotations.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//@Controller
//@ResponseBody // class level pe kardiya to all methods pe annotation is applied
@RestController
@RequestMapping("/xadmin") // Base endpoint to run this controller CLASS LEVEL KE SAATH USE
                            //so now the url will be lhost:8080/xadmin/getEmployeeDetail
public class EmployeeController {

    @Autowired
    public EmployeeService employeeService;

//    @GetMapping("/getEmployeeDetail")
//    @ResponseBody // IS USED TO CONVERT THE RESPONSE INTO A JSON FORMAT
//    @RequestMapping("/getEmployeeDetail") // METHOD USAGE ...by Default, get() method used
@RequestMapping (value = {"/getEmployeeDetail","getDetail", "getEmployee"},method = RequestMethod.GET)
//produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Employee getEmployeeDetail(){
        return employeeService.getEmployee();
    }

//    @RequestMapping(value = "/create/employee", method = RequestMethod.POST)
//    @PostMapping("/create/employee")
//    public Employee createEmployee(@RequestBody Employee employee){ // parameter is basically payload
//       employeeService.createEmployee(employee);
//        return employee;
//    }
    @PostMapping("/create/employee")
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee){ // parameter is basically payload
       Employee employee1 = employeeService.createEmployee(employee);
        return new ResponseEntity<>(employee1 , HttpStatus.CREATED); // "CREATED" USED FOR "201 Created"
    }
}