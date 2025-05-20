package com.bridgelabz.EmployeePayroll.service;

import com.bridgelabz.EmployeePayroll.model.EmployeePayroll;
import com.bridgelabz.EmployeePayroll.repository.EmployeePayrollRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeePayrollService {

    @Autowired
    private EmployeePayrollRepository repository;

    public List<EmployeePayroll> getAllEmployees() {
        return repository.findAll();
    }

    public EmployeePayroll getEmployeeById(int id) {
        return repository.findById(id).orElse(null);
    }

    public EmployeePayroll createEmployee(EmployeePayroll employee) {
        return repository.save(employee);
    }

    public EmployeePayroll updateEmployee(EmployeePayroll employee) {
        return repository.save(employee);
    }

    public void deleteEmployee(int id) {
        repository.deleteById(id);
    }
}
