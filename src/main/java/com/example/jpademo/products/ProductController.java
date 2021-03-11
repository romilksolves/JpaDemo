package com.example.jpademo.products;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

	@Autowired
	ProductService productService;
	
	@RequestMapping(method = RequestMethod.POST, value = "/product")
	public boolean addProduct(@RequestBody ProductBean product) {
		return productService.addProduct(product);	
	}
	
	@RequestMapping("/product/{id}")
	public ProductBean getProduct(@PathVariable("id") int productId) {		
		return productService.getProduct(productId);
	}
	
	@RequestMapping("/product")
	public List<ProductBean> getAllProducts() {
		return productService.getAllProduct();
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/product")
	public boolean deleteProduct(@RequestBody ProductBean product) {
		return productService.deleteProduct(product);	
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/product")
	public boolean updateProduct(@RequestBody ProductBean product) {
		return productService.addProduct(product);	
	}
	
}
