package com.stockmanagement.stock_management.service;

import com.stockmanagement.stock_management.entity.Product;
import com.stockmanagement.stock_management.repository.ProductRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductService {

    private final ProductRepository repo;

    public ProductService(ProductRepository repo) {
        this.repo = repo;
    }

    public Product addProduct(Product product) {
        return repo.save(product);
    }

    public Product updateProduct(int id, Product updated) {
        Product p = repo.findById(id).orElseThrow();
        p.setName(updated.getName());
        p.setCategory(updated.getCategory());
        p.setCompany(updated.getCompany());
        p.setQuantity(updated.getQuantity());
        p.setPrice(updated.getPrice());
        return repo.save(p);
    }

    public List<Product> searchByName(String name) {
        return repo.findByNameContaining(name);
    }

    public List<Product> searchByCategory(String category) {
        return repo.findByCategory(category);
    }

    public List<Product> searchByCompany(String company) {
        return repo.findByCompany(company);
    }
}