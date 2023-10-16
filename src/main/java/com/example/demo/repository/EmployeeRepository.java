package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	
	@Query("SELECT e FROM Employee e")
	public List<Employee> getAllEmp();
	
	@Query("SELECT e.empName FROM Employee e INNER JOIN e.department d WHERE d.depName =:depName and e.empSalary >=:empSalary")
	public List<Object[]> getEmpNameByDepName(String depName, double empSalary);
	
	@Query("SELECT d.depName, COUNT(e) FROM Employee e INNER JOIN e.department d GROUP BY d.depName")
	public List<Object[]> getGroupBy();
	
	
}
