package com.cgrdev.springbootrestcrudapispringdatarest.dao;

import com.cgrdev.springbootrestcrudapispringdatarest.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    // no method definition required
}
