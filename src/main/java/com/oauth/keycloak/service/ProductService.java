package com.oauth.keycloak.service;

import org.springframework.stereotype.Service;

import com.oauth.keycloak.dto.Product;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;


@Service
public class ProductService {

	
	List<Product> productsList=new ArrayList<>();
	
    @PostConstruct
    public void initializeProductMap() {
    	Product product_1=new Product(1, "RAM", 4);
    	Product product_2=new Product(2, "Mother_Board", 10);
    	Product product_3=new Product(3, "Key_Board", 20);
    	Product product_4=new Product(4, "Monitor", 12);
    	productsList.add(product_1);
    	productsList.add(product_2);
    	productsList.add(product_3);
    	productsList.add(product_4);
    }

    public Product getProduct(int productId) {
    	return productsList.stream().filter(p->p.getId() == productId).findFirst().orElse(new Product());
    }

    public List<Product> getAllProducts() {
        return productsList;
    }
}
