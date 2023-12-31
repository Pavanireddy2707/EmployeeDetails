package com.vehicle.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Vehicle {
	@Id
	private Integer id;
	private String name;
	private String model;
	private Double price;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", name=" + name + ", model=" + model + ", price=" + price + "]";
	}
	
	

}
