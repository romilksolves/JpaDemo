package com.example.jpademo.products;

import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<ProductBean, Integer> {	

}
