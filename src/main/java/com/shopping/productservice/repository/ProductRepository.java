package com.shopping.productservice.repository;



import java.util.List;
import java.util.Optional;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.shopping.productservice.model.Products;





@Repository
public interface ProductRepository extends MongoRepository<Products, Integer>{

	List<Products> findByProductCategory(String productCategory);

	List<Products> findByProductType(String productType);

	Optional<Products> findByProductName(String productName);

	Optional<Products> findById(String id);

	List<Products> findProductByCategory(String category);

	void deleteById(String id);

	//List<Products> findProductByCategory(String category);

	 
	

}


