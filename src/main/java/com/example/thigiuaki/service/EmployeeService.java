package com.example.thigiuaki.service;

import com.example.thigiuaki.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> employeeList();

    void addEmployee(Employee employee);

    void deleteEmployee(int id);

    void updateEmployee(int id, Employee employee);

    List<Employee> searchEmployeeByName(String name);

    Employee viewEmployee(int id);

    Employee searchEmployeeById(int id);
}
