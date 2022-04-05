package com.tectoro.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import com.tectoro.entity.Employee;

@Repository
public interface EmployeeRepoInt extends JpaRepository<Employee, Integer> {
	
}
