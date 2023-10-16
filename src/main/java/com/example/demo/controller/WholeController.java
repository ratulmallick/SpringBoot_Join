package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.repository.DepartmentRepository;
import com.example.demo.repository.EmployeeRepository;

@RestController
public class WholeController {

	@Autowired
	private EmployeeRepository erepo;
	
	@Autowired
	private DepartmentRepository drepo;
	
	@GetMapping("/emp/get/all")
	public ResponseEntity<?> getEmp(){
		
		return new ResponseEntity<List<Employee>>(erepo.getAllEmp(),HttpStatus.OK);
	}
	
	
	@GetMapping("/dep/get/all")
	public ResponseEntity<?> getDep(){
		
		return new ResponseEntity<List<Employee>>(drepo.getAllDep(),HttpStatus.OK);
	}
	
	@GetMapping("/emp/name/{name}/{empSalary}")
	public ResponseEntity<?> getEmpNameByDepName(@PathVariable String name, @PathVariable double empSalary){
		
		return new ResponseEntity<List<Object[]>>(erepo.getEmpNameByDepName(name, empSalary), HttpStatus.OK);
	}
	
	@GetMapping("/emp/groupby/dep")
	public ResponseEntity<?> getGroupBy(){
		
		return new ResponseEntity<List<Object[]>>(erepo.getGroupBy(),HttpStatus.OK);
	}
}
