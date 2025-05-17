package com.bridgelabz.employeepayrollapp.service;


import com.bridgelabz.employeepayrollapp.model.EmployeePayroll;
import java.util.List;

public interface EmployeeService {
    List<EmployeePayroll> getAll();
    EmployeePayroll getById(int id);
    EmployeePayroll create(EmployeePayroll emp);
    EmployeePayroll update(EmployeePayroll emp);
    void delete(int id);
}
