package com.fillswim.spring.springboot.my_springboot_springdatajpa.DAO;


import com.fillswim.spring.springboot.my_springboot_springdatajpa.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
