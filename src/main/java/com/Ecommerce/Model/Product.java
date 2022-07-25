package com.Ecommerce.Model;

import javax.persistence.*;
import java.util.List;
@Entity
public class Product {

    @Id
    private int product_id;
    private String name;
    private String image;
    private String details;
    private double price;
    private int brand_id;


    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name="brand_id",insertable = false,updatable = false)
    private Brand product_brand;

    public Product() {
    }


public Product(int product_id, String name, String image, String details, double price, int brand_id) {
	super();
	this.product_id = product_id;
	this.name = name;
	this.image = image;
	this.details = details;
	this.price = price;
	this.brand_id=brand_id;
}


public int getProduct_id() {
	return product_id;
}


public void setProduct_id(int product_id) {
	this.product_id = product_id;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public String getImage() {
	return image;
}


public void setImage(String image) {
	this.image = image;
}


public String getDetails() {
	return details;
}


public void setDetails(String details) {
	this.details = details;
}


public double getPrice() {
	return price;
}


public void setPrice(double price) {
	this.price = price;
}




public int getBrand_id() {
	return brand_id;
}


public void setBrand_id(int brand_id) {
	this.brand_id = brand_id;
}


@Override
public String toString() {
	return "Product [product_id=" + product_id + ", name=" + name + ", image=" + image + ", details=" + details
			+ ", price=" + price + ", brand_id=" + brand_id + "]";
}










 

}
