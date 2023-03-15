package com.oauth.keycloak.dto;

import java.io.Serializable;


public class Product implements Serializable{

	private int id;
	private String productName;
	private int productQuantity;
	
	public Product() {
		super();
	}
	public Product(int id, String productName, int productQuantity) {
		super();
		this.id = id;
		this.productName = productName;
		this.productQuantity = productQuantity;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductQuantity() {
		return productQuantity;
	}
	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}
	
}
