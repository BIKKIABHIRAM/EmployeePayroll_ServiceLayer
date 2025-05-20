package com.bridgelabz.EmployeePayroll.controller;

import com.bridgelabz.EmployeePayroll.model.EmployeePayroll;
import com.bridgelabz.EmployeePayroll.service.EmployeePayrollService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employeepayrollservice")
public class EmployeePayrollController {

    @Autowired
    private EmployeePayrollService service;

    @GetMapping("/")
    public List<EmployeePayroll> getAllEmployees() {
        return service.getAllEmployees();
    }

    @GetMapping("/get/{id}")
    public EmployeePayroll getEmployeeById(@PathVariable int id) {
        return service.getEmployeeById(id);
    }

    @PostMapping("/create")
    public EmployeePayroll createEmployee(@Valid @RequestBody EmployeePayroll employee) {
        return service.createEmployee(employee);
    }

    @PutMapping("/update")
    public EmployeePayroll updateEmployee(@Valid @RequestBody EmployeePayroll employee) {
        return service.updateEmployee(employee);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable int id) {
        service.deleteEmployee(id);
        return "Employee with ID " + id + " deleted!";
    }
}

