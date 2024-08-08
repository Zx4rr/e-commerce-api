package com.example.demo.response;
import lombok.Data;

@Data
public class ProductResponse {
    private Long id;
    private String name;
    private Double price;
    private String explanation;
    private Long category_id;
}
