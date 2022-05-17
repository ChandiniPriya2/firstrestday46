package com.jobiak.rest.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Mobile {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Long mid;
public Long getMid() {
		return mid;
	}
	public void setMid(long mid) {
		this.mid = mid;
	}
private String  brand;
private String model;
private double  price;
public Mobile() {
	// TODO Auto-generated constructor stub
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
@Override
public String toString() {
	return "Mobile [brand=" + brand + ", model=" + model + ", price=" + price + "]";
}

}
