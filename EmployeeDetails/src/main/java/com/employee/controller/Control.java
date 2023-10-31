package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.entity.Employee;
import com.employee.service.ServiceLayer;   

@RestController
public class Control {
	
	public ServiceLayer getServiceLayer() {
		return serviceLayer;

}
	public void setServiceLayer(ServiceLayer serviceLayer) {
		this.serviceLayer = serviceLayer;
}
	@Autowired
	private ServiceLayer serviceLayer;
	@GetMapping("/searching")
	public List<Employee>GetAll(){
		return serviceLayer.GettingAlltheDetails();
	}
	@PostMapping
	public Employee Detail(@RequestBody Employee emp) {
		return serviceLayer.Details(emp);
	}
	@PutMapping
	public Employee about(@RequestBody Employee empl) {
		return serviceLayer.about(empl);
		
	}
	
	public String job(@PathVariable("id") Integer id) {
		serviceLayer.job(id);
		return "sucessfully deleted";
}
}