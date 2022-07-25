package com.Ecommerce.Controller;

import com.Ecommerce.Model.Product;
import com.Ecommerce.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
   private ProductService productservice;

    @GetMapping("/Ecommerce/Products/all")
    public List<Product> getProduct()
    {
        return productservice.getProduct();
    }

    @PostMapping("/Ecommerce/Products/add")
    public Product addProduct(@RequestBody Product product)
    {
        return productservice.addProduct(product);
    }


}
