package com.Ecommerce.Service;

import com.Ecommerce.Model.Category;
import com.Ecommerce.Repository.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepo categoryRepo;

    public List<Category> getallcategory() {
        return categoryRepo.findAll();
    }

    public Category getCategory(Category category) {
        return categoryRepo.save(category);
    }

	public Optional<Category> getCategoryById(int id) {
		Optional<Category> op = categoryRepo.findById(id);
		return op;
	}
}
