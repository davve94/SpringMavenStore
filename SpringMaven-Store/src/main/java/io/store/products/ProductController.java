package io.store.products;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService productService; // need to tell spring to inject it by autowired
	   									  // which means that it needs dependency injection.
	
	@RequestMapping("/products")
	public List<Product> getAllProducts(){       // returns a JSON of all products
		return productService.getAllProducts();
	}
	@RequestMapping("/products/{id}")
	public Optional<Product> getProduct(@PathVariable String id){ // link id to path variable
		return productService.getProduct(id);
	}
	@RequestMapping(method=RequestMethod.POST, value="/products") // JSON representation
	public void addProduct(@RequestBody Product product) {
		productService.addProduct(product);
	}
	@RequestMapping(method=RequestMethod.PUT, value="/products/{id}")
	public void updateProduct(@RequestBody Product product) {
		productService.updateProduct(product);
	}
	@RequestMapping(method=RequestMethod.DELETE, value="/products/{id}")
	public void deleteProduct(@PathVariable String id) {                 // link id to path variable
		productService.deleteProduct(id); 
	}
	

}
