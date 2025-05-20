package com.bridgelabz.EmployeePayroll.service;

import com.bridgelabz.EmployeePayroll.dto.EmployeePayrollDTO;
import com.bridgelabz.EmployeePayroll.model.EmployeePayrollData;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class EmployeePayrollService implements IEmployeePayrollService {

    private List<EmployeePayrollData> empPayrollList = new ArrayList<>();
    private int empIdCounter = 1;

    @Override
    public List<EmployeePayrollData> getEmployeePayrollData() {
        return empPayrollList;
    }

    @Override
    public EmployeePayrollData getEmployeePayrollDataById(int empId) {
        return empPayrollList.stream()
                .filter(emp -> emp.getId() == empId)
                .findFirst()
                .orElse(null);
    }

    @Override
    public EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO empPayrollDTO) {
        EmployeePayrollData empData = new EmployeePayrollData(empIdCounter++, empPayrollDTO.name, empPayrollDTO.salary);
        empPayrollList.add(empData);
        return empData;
    }

    @Override
    public EmployeePayrollData updateEmployeePayrollData(int empId, EmployeePayrollDTO empPayrollDTO) {
        EmployeePayrollData empData = this.getEmployeePayrollDataById(empId);
        if (empData != null) {
            empData.setName(empPayrollDTO.name);
            empData.setSalary(empPayrollDTO.salary);
        }
        return empData;
    }

    @Override
    public void deleteEmployeePayrollData(int empId) {
        empPayrollList.removeIf(emp -> emp.getId() == empId);
    }
}

