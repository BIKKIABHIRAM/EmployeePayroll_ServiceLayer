package com.bridgelabz.EmployeePayroll.service;

import com.bridgelabz.EmployeePayroll.dto.EmployeePayrollDTO;
import com.bridgelabz.EmployeePayroll.model.EmployeePayrollData;
import java.util.List;

public interface IEmployeePayrollService {
    List<EmployeePayrollData> getEmployeePayrollData();
    EmployeePayrollData getEmployeePayrollDataById(int empId);
    EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO empPayrollDTO);
    EmployeePayrollData updateEmployeePayrollData(int empId, EmployeePayrollDTO empPayrollDTO);
    void deleteEmployeePayrollData(int empId);
}