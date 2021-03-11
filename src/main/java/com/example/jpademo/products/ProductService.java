package com.example.jpademo.products;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;	
	
	public boolean addProduct(ProductBean product) {
		try {			
			productRepository.save(product);
			return true;	
		}catch(Exception e) {
			
		}
		return false;
	}
	
	public ProductBean getProduct(int id) {
		try {			
			java.util.Optional<ProductBean> optional = productRepository.findById(id);
			if(optional.isPresent()) {
				return optional.get();
			}
			
		}catch(Exception e) {
			
		}
		return null;
	}
	
	public List<ProductBean> getAllProduct() {
		try {
			ArrayList<ProductBean> list = new ArrayList<ProductBean>();
			productRepository.findAll().forEach((v) -> {list.add(v);});			
			return list;
		}catch(Exception e) {
			
		}
		return null;
	}
	
	public boolean deleteProduct(ProductBean product) {
		try {			
			productRepository.delete(product);
			return true;	
		}catch(Exception e) {
			
		}
		return false;
	}
	
	public boolean updateProduct(ProductBean product) {
		try {			
			productRepository.save(product);
			return true;	
		}catch(Exception e) {
			
		}
		return false;
	}
	
	
}
