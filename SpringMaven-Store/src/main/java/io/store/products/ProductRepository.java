package io.store.products;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository <Product, String> {
	
	// data service 
	//public List<Product> findByProductId(String id); // JPA will know by method name what the implementation is

}
