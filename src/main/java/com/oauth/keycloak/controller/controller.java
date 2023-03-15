package com.oauth.keycloak.controller;

import java.util.List;

import javax.annotation.security.RolesAllowed;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oauth.keycloak.dto.Product;
import com.oauth.keycloak.service.ProductService;


@RestController
@RequestMapping("/products")
public class controller {

	@Autowired
	private ProductService productService;
	
	 //this method can be accessed by user whose role is user
    @GetMapping("/{productId}")
    @RolesAllowed("user")
    public ResponseEntity<Product> getProduct(@PathVariable int productId) {
        return ResponseEntity.ok(productService.getProduct(productId));
    }

    //this method can be accessed by user whose role is admin
    @GetMapping
    @RolesAllowed("admin")
    public ResponseEntity<List<Product>> findALlProducts() {
       
    	return ResponseEntity.ok(productService.getAllProducts());
    }
	
	
	
}
