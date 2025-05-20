package com.bridgelabz.EmployeePayroll.repository;

import com.bridgelabz.EmployeePayroll.model.EmployeePayroll;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeePayrollRepository extends JpaRepository<EmployeePayroll, Integer> {
}
