package com.fillswim.spring.springboot.my_springboot_springdatajpa.Service;


import com.fillswim.spring.springboot.my_springboot_springdatajpa.Entity.Employee;

import java.util.List;

public interface EmployeeService {

    public void saveEmployee(Employee employee);

    public Employee getEmployee(int id);

    public List<Employee> getAllEmployees();

    public void deleteEmployee(int id);
}
