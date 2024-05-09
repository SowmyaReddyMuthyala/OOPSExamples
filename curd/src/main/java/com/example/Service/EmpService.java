package com.example.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Entity.Employee;
import com.example.Repository.EmpRepository;

@Service
public class EmpService {
	
@Autowired	
private EmpRepository empRepository;
	
	
public Employee saveEmp(Employee employee) {
	Employee saveEmpDetails=empRepository.save(employee);
	return saveEmpDetails;
	}

public List<Employee> getEmp() {
	return empRepository.findAll();
}

public Optional<Employee> getEmpId(long id) {
	Optional<Employee> emp=	empRepository.findById(id);
	System.out.println(emp+"hhhhhhhhhhhh");
	return emp;
}


public Optional<Employee> getByNames(String name){
	Optional<Employee>  emp= empRepository.findByName(name);
	System.out.println(emp+"uuuuuuuuuuuuu");
	return emp;
	}


public Employee updateEmpDetails(Employee employee){
//Optional<Employee>  emp=empRepository.findById(employee.getId());

	return empRepository.save(employee);
	
}


public String deleteEmpDetails(long id){
	Optional<Employee>  emp=empRepository.findById(id);
	if(emp.isPresent()) {
		empRepository.delete(emp.get());
}
	return "deiete emp"+id;
	
}









}


















	
	
	
	


