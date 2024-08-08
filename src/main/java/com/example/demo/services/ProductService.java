package com.example.demo.services;
import com.example.demo.entity.Product;
import com.example.demo.repository.CategoryRepo;
import com.example.demo.repository.ProductRepo;
import com.example.demo.response.ProductResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {
    @Autowired
    private ProductRepo productRepo;
    @Autowired
    private CategoryRepo categoryRepo;

    public List<ProductResponse> getAllProducts() {
        List<Product> list = productRepo.findAll();
        return list.stream().map(product -> {
            ProductResponse response = new ProductResponse();
            response.setId(product.getId());
            response.setName(product.getName());
            response.setPrice(product.getPrice());
            response.setExplanation(product.getExplanation());
            response.setCategory_id(product.getCategory().getId());
            return response;
        }).collect(Collectors.toList());
    }

}
