package com.Ecommerce.Model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Brand {

    @Id
    private int brand_id;
    private String brand_name;
    private String brand_logo;
    private int category_id;


   @OneToMany(targetEntity = Product.class,cascade = CascadeType.ALL)
   @JoinColumn(name="brand_id" )
   private List<Product> product;

    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name="category_id",insertable = false,updatable = false)
    private Category category;


    public Brand() {
    }

public Brand(int brand_id, String brand_name, String brand_logo, int category_id, List<Product> product) {
	super();
	this.brand_id = brand_id;
	this.brand_name = brand_name;
	this.brand_logo = brand_logo;
	this.category_id = category_id;
	this.product = product;
}

public int getBrand_id() {
	return brand_id;
}

public void setBrand_id(int brand_id) {
	this.brand_id = brand_id;
}

public String getBrand_name() {
	return brand_name;
}

public void setBrand_name(String brand_name) {
	this.brand_name = brand_name;
}

public String getBrand_logo() {
	return brand_logo;
}

public void setBrand_logo(String brand_logo) {
	this.brand_logo = brand_logo;
}

public int getCategory_id() {
	return category_id;
}

public void setCategory_id(int category_id) {
	this.category_id = category_id;
}

public List<Product> getProduct() {
	return product;
}

public void setProduct(List<Product> product) {
	this.product = product;
}

@Override
public String toString() {
	return "Brand [brand_id=" + brand_id + ", brand_name=" + brand_name + ", brand_logo=" + brand_logo
			+ ", category_id=" + category_id + ", product=" + product + "]";
}


















}
