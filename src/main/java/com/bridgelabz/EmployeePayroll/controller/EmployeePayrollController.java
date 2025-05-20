package com.bridgelabz.EmployeePayroll.controller;

import com.bridgelabz.EmployeePayroll.dto.EmployeePayrollDTO;
import com.bridgelabz.EmployeePayroll.model.EmployeePayrollData;
import com.bridgelabz.EmployeePayroll.service.IEmployeePayrollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employeepayrollservice")
public class EmployeePayrollController {

    @Autowired
    private IEmployeePayrollService employeePayrollService;

    @GetMapping("/")
    public List<EmployeePayrollData> getAllEmployees() {
        return employeePayrollService.getEmployeePayrollData();
    }

    @GetMapping("/get/{id}")
    public EmployeePayrollData getEmployeeById(@PathVariable("id") int empId) {
        return employeePayrollService.getEmployeePayrollDataById(empId);
    }

    @PostMapping("/create")
    public EmployeePayrollData createEmployee(@RequestBody EmployeePayrollDTO empPayrollDTO) {
        return employeePayrollService.createEmployeePayrollData(empPayrollDTO);
    }

    @PutMapping("/update/{id}")
    public EmployeePayrollData updateEmployee(@PathVariable("id") int empId,
                                              @RequestBody EmployeePayrollDTO empPayrollDTO) {
        return employeePayrollService.updateEmployeePayrollData(empId, empPayrollDTO);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteEmployee(@PathVariable("id") int empId) {
        employeePayrollService.deleteEmployeePayrollData(empId);
    }
}


