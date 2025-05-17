package com.bridgelabz.employeepayrollapp.controller;

import com.bridgelabz.employeepayrollapp.model.EmployeePayroll;
import com.bridgelabz.employeepayrollapp.service.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employeepayrollservice")
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @GetMapping("/")
    public List<EmployeePayroll> getAll() {
        return service.getAll();
    }

    @GetMapping("/get/{id}")
    public EmployeePayroll getById(@PathVariable int id) {
        return service.getById(id);
    }

    @PostMapping("/create")
    public EmployeePayroll create(@Valid @RequestBody EmployeePayroll employee) {
        return service.create(employee);
    }

    @PutMapping("/update")
    public EmployeePayroll update(@Valid @RequestBody EmployeePayroll employee) {
        return service.update(employee);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable int id) {
        service.delete(id);
    }
}

