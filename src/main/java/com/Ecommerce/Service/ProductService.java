package com.Ecommerce.Service;

import com.Ecommerce.Model.Product;
import com.Ecommerce.Repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepo productrepo;

    public List<Product> getProduct() {
        return productrepo.findAll();

    }

    public Product addProduct(Product product) {

        return productrepo.save(product);
    }
}
