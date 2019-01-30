package io.products;

import java.util.Optional;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	public List<Product> getAllProducts() {   // returns all products from the database
		List<Product> products = new ArrayList<>();
		productRepository.findAll().forEach(products::add); // method reference 
		return products;
	}
	public Optional<Product> getProduct(String id) { // get product by id
		return productRepository.findById(id);
	}
	public void addProduct(Product product) { // add new product into database 
		productRepository.save(product);
	}
	public void updateProduct(Product product) { // updates a product in the database 
		productRepository.save(product); 
	}
	public void deleteProduct(String id) { // removes a product from the database 
		productRepository.deleteById(id);
	}

}
