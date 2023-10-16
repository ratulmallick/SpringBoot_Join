package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Department;
import com.example.demo.entity.Employee;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer>{

	@Query("SELECT d FROM Department d")
	public List<Employee> getAllDep();
}
