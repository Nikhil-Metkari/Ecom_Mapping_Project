package com.Ecommerce.Repository;

import com.Ecommerce.Model.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandRepo extends JpaRepository<Brand,Integer> {
}
