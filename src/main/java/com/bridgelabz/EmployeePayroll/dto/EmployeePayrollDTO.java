package com.bridgelabz.EmployeePayroll.dto;

public class EmployeePayrollDTO {
    public String name;
    public long salary;

    public EmployeePayrollDTO() {}

    public EmployeePayrollDTO(String name, long salary) {
        this.name = name;
        this.salary = salary;
    }
}