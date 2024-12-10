package com.example.thigiuaki.model;

public class Employee {
    int id;
    String name;
    int age;
    String jobPosition;
    String department;
    double salary;

    public Employee(int id, String name, int age, String jobPosition, String department, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.jobPosition = jobPosition;
        this.department = department;
        this.salary = salary;
    }

    public Employee() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJobPosition() {
        return jobPosition;
    }

    public void setJobPosition(String jobPosition) {
        this.jobPosition = jobPosition;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name='" + name + '\'' + ", age=" + age + ", jobPosition='" + jobPosition + '\'' + ", department='" + department + '\'' + ", salary=" + salary + '}';
    }
}

