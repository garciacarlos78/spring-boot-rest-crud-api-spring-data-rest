package com.cgrdev.springbootrestcrudapispringdatarest.service;

import com.cgrdev.springbootrestcrudapispringdatarest.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAll();

    Employee getOne(int id);

    Employee create(Employee employee);

    Employee update(Employee employee);

    void delete(int id);
}
