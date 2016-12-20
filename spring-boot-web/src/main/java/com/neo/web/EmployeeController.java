package com.neo.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.neo.domain.Employee;
import com.neo.domain.EmployeeRepository;

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeRepository employeeRepository;

	@RequestMapping("/getEmployee")
	public List<Employee> getEmployee() {
		return employeeRepository.findAll();
	}

}
