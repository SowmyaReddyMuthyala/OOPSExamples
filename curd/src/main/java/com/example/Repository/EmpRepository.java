package com.example.Repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.Entity.Employee;

@Repository
public interface EmpRepository extends JpaRepository<Employee, Long> {
	
	
public Optional<Employee> findByName(String name);


}
