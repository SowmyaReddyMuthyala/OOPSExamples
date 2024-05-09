package com.example.Controller;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Entity.Employee;
import com.example.Service.EmpService;

@RestController
public class EmpController {
	
@Autowired
private  EmpService empService;
	
@PostMapping("/addEmp")
public Employee createEmp( @RequestBody Employee employee) {
Employee addNewEmp=empService.saveEmp(employee);
return addNewEmp;
}

@GetMapping("/getEmp")
public List<Employee> getEmp() {
	return empService.getEmp();
}

@GetMapping("/getEmpById{id}")
public Optional<Employee> getEmpDetailsId(@PathVariable("id") long id) {
	return empService.getEmpId(id);
}
 

@GetMapping("/getEmpByName{name}")
public void getEmpDetailsNames(@PathVariable("name") String name) {
Optional<Employee> emp=empService.getByNames(name);
Optional<String> s=Optional.ofNullable(emp.get().getName());
s.ifPresentOrElse(n->System.out.println("name is"+n.toUpperCase()) ,()->System.out.println("no such element"));
	}

@PutMapping("/updateEmp/{id}")
public Employee updateEmp(@PathVariable("id") long id,@RequestBody Employee employee) {
	employee.setId(id);
	return empService.updateEmpDetails(employee);
	}

@DeleteMapping("/deleteEmp/{id}")
public void deleteEmp(@PathVariable("id") long id) {
	
	 empService.deleteEmpDetails(id); ;
	
}











}











	
	
	
	
	
	


