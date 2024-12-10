package com.example.thigiuaki.service;

import com.example.thigiuaki.model.Employee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeServiceImpl implements EmployeeService{
    private static Map<Integer, Employee> employees;
    static {
        employees = new HashMap<>();
    }
    @Override
    public List<Employee> employeeList() {
        return new ArrayList<>(employees.values());
    }

    @Override
    public void addEmployee(Employee employee) {
        employees.put(employee.getId(), employee);
    }

    @Override
    public void deleteEmployee(int id) {
        employees.remove(id);
    }

    @Override
    public void updateEmployee(int id, Employee employee) {
        employees.put(id, employee);
    }

    @Override
    public List<Employee> searchEmployeeByName(String name) {
        List<Employee> searchList = new ArrayList<>();
        for (Employee employee : employees.values()) {
            if (employee.getName().contains(name)) {
                searchList.add(employee);
            }
        }
        return searchList;
    }

    @Override
    public Employee searchEmployeeById(int id) {
        Employee resultEmployee = employees.get(id);
        for (Employee employee : employees.values()) {
            if (employee.getId() == id) {
                return resultEmployee;
            }
        }
        return null;
    }
    @Override
    public Employee viewEmployee(int id) {
        return employees.get(id);
    }
}