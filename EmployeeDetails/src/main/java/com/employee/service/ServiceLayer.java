package com.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.entity.Employee;
import com.employee.repository.EmployeeRepository;



@Service
public class ServiceLayer {
	
	public EmployeeRepository getEmployeeRepository() {
		return employeeRepository;
	}
	public void setEmployeeRepository(EmployeeRepository employeeRepository) {
		this.employeeRepository=employeeRepository;
		
		
	}
	@Autowired
	private EmployeeRepository employeeRepository; 
	public List<Employee> GettingAlltheDetails(){
		return employeeRepository.findAll();
		
       
}
	
	public Employee Details(Employee emp) {
		return employeeRepository.save(emp);
}
	public Employee about(Employee empl ) {
		return employeeRepository.save(empl);
	}
	public void job(Integer job) {
		Employee e=employeeRepository.findById(job).get();
		System.out.print(e);
		 employeeRepository.delete(e);
}
}
