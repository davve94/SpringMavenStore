package io.products;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
	
	// database columns // 
	
	@Id
	private String id;  // primary key  
	private String name;
	private String description;
	private String price;
	
	public Product() {
		
	}
	public Product(String id, String name, String description, String price) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
}
