package com.example.demo.response;
import com.example.demo.entity.Category;
import lombok.Data;

import java.util.List;

@Data
public class CategoryResponse {
    private long id;
    private String name;
    private List<Category> categories;
}
