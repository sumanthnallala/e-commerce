package com.ecommerce.service;

import com.ecommerce.model.Product;
import com.ecommerce.repository.ProductRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

  @Autowired
  private ProductRepository productRepository;

  public List<Product> getAllProducts() {
    return productRepository.findAll();
  }

  public Product getProductById(String id) {
    return productRepository.findById(id).orElse(null);
  }

  public Product addProduct(Product product) {
    return productRepository.save(product);
  }

  public void deleteProduct(String id) {
    productRepository.deleteById(id);
  }

}
