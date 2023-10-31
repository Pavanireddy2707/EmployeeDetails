package com.vehicle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vehicle.entity.Vehicle;
import com.vehicle.service.ServiceLayer;

@RestController
public class ControlLayer {
	
	public ServiceLayer getServiceLayer() {
		return serviceLayer;
	}
	public void setServiceLayer(ServiceLayer serviceLayer) {
		this.serviceLayer = serviceLayer;
	}
	@Autowired
	private ServiceLayer serviceLayer;
	@GetMapping("/searching")
	public List<Vehicle>GetAll(){
		return serviceLayer.GettingAlltheDetails();
	}
	@PostMapping("/post")
	public Vehicle Detail(@RequestBody Vehicle vehi)
	{
	return serviceLayer.Details(vehi);
	}
	@PutMapping("/put")
	public Vehicle conditio(@RequestBody Vehicle conditi) {
		return serviceLayer.Condition(conditi);
	}
	@DeleteMapping("/delete/{id}")
	public String Runn(@PathVariable("id") Integer id) {
		serviceLayer.Running(id);
		return "sucessfully deleted";
	}

}
