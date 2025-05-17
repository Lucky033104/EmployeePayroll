package com.bridgelabz.employeepayrollapp.service;

import com.bridgelabz.employeepayrollapp.model.EmployeePayroll;
import com.bridgelabz.employeepayrollapp.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    public List<EmployeePayroll> getAll() {
        return repository.findAll();
    }

    public EmployeePayroll getById(int id) {
        return repository.findById(id).orElse(null);
    }

    public EmployeePayroll create(EmployeePayroll emp) {
        return repository.save(emp);
    }

    public EmployeePayroll update(EmployeePayroll emp) {
        return repository.save(emp);
    }

    public void delete(int id) {
        repository.deleteById(id);
    }
}

