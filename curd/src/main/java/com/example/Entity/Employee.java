package com.example.Entity;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	private String companyname;
	private String salary;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public Employee(long id, String name, String companyname, String salary) {
		super();
		this.id = id;
		this.name = name;
		this.companyname = companyname;
		this.salary = salary;
	}
	public Employee() {
		super();
		
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", companyname=" + companyname + ", salary=" + salary + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
