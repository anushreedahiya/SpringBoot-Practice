package com.example.DataValidation.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;


public class ProductDTO {
	@NotBlank(message = "Name cannot be blank")
	private String name;
	
	@Email(message = "Email should be valid")
	private String email;
	
	@Min(value = 100, message = "Price should not be less than 100")
	private double price;
	
	@NotBlank(message = "Description cannot be blank")
	private String description;
	
	@Max(value = 10, message = "Quantity should not be more than 10")
	private int quantity;
	
	//getter and setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	
}
