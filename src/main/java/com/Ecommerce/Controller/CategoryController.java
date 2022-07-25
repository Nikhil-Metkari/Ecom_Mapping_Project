package com.Ecommerce.Controller;

import com.Ecommerce.Model.Category;
import com.Ecommerce.Service.CategoryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class CategoryController {

	@Autowired
    private CategoryService categoryService;

    @GetMapping("/Ecommerce/Category/all")
    public List<Category> getallCategory()
    {
        return categoryService.getallcategory();
    }

    @PostMapping("/Ecommerce/Category/add")
    public Category addCategory(@RequestBody Category category)
    {
        return categoryService.getCategory(category);
    }

    @PostMapping("/Ecommerce/Category/byid/{id}")
    public Optional<Category> getCategoryById(@PathVariable int id) throws Exception{
    	Optional<Category> cp= categoryService.getCategoryById(id);
    if(cp.isEmpty())
    {
    	throw new Exception("Wrong Entity");
    }
    		return Optional.empty();

    }





}
