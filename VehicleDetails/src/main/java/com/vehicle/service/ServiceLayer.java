package com.vehicle.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehicle.entity.Vehicle;
import com.vehicle.repository.VehicleRepository;
@Service
public class ServiceLayer {
public VehicleRepository getVehicleRepository() {
		return vehicleRepository;
	}
	public void setVehicleRepository(VehicleRepository vehicleRepository) {
		this.vehicleRepository = vehicleRepository;
	}
@Autowired
private VehicleRepository vehicleRepository; 
public List<Vehicle> GettingAlltheDetails(){
	return vehicleRepository.findAll();
}
public Vehicle Details(Vehicle vehi) {
	return vehicleRepository.save(vehi);
}
public Vehicle Condition(Vehicle conditi ) {
	return vehicleRepository.save(conditi);
}
public void Running(Integer Run) {
	Vehicle v=vehicleRepository.findById(Run).get();
	System.out.print(v);
	 vehicleRepository.delete(v);
	 
}
}