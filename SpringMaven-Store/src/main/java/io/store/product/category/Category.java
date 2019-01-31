package io.store.product.category;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import io.store.products.Product;

@Entity
public class Category {
	
	@Id
	private String id;
	private String name;
	private String brand;
	
	@ManyToOne   // many to one relationship - a category can have many products 
	private Product product;
	
	public Category() {
		
	}
	public Category(String id, String name) {
		super();
		this.id = id;
		this.name = name;
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
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
}
