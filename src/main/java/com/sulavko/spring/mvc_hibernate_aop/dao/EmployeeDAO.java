package com.sulavko.spring.mvc_hibernate_aop.dao;

import com.sulavko.spring.mvc_hibernate_aop.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public Employee getEployee(int id);

    public void deleteEmplotee(int id);
}
