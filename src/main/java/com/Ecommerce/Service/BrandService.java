package com.Ecommerce.Service;

import com.Ecommerce.Model.Brand;
import com.Ecommerce.Repository.BrandRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandService {

    @Autowired
   private BrandRepo brandrepo;
    
    
    public List<Brand> getBrand() {
        return brandrepo.findAll();
    }

    public Brand addBrand(Brand brand) {
        return brandrepo.save(brand);
    }

    public void deleteBrand(int brandid) {
        brandrepo.deleteById(brandid);
    }
}
