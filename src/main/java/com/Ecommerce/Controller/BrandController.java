package com.Ecommerce.Controller;

import com.Ecommerce.Model.Brand;
import com.Ecommerce.Service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BrandController {

    @Autowired
    private BrandService brandservice;


    @GetMapping("/Ecommerce/Brands/all")
    public List<Brand> getBrand()
    {
        return brandservice.getBrand();
    }

    @PostMapping("/Ecommerce/Brands/add")
    public Brand addBrand(@RequestBody Brand brand)
    {
        return brandservice.addBrand(brand);
    }
    @DeleteMapping("/Ecommerce/Brands/delete/")
    public String deleteBrand(@RequestBody Brand brand)
    {
        brandservice.deleteBrand(brand.getBrand_id());
        return "Deleted";
    }
}


