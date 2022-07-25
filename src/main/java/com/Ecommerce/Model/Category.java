package com.Ecommerce.Model;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Category {

    @Id
    private int category_id;
    private String category_name;
    private boolean category_enabled;

    @OneToMany(targetEntity = Brand.class,cascade = CascadeType.ALL)
    @JoinColumn(name="category_id") 
    private List<Brand> brand;

    
    public Category() {
    }


	public Category(int category_id, String category_name, boolean category_enabled, List<Brand> brand) {
		super();
		this.category_id = category_id;
		this.category_name = category_name;
		this.category_enabled = category_enabled;
		this.brand = brand;
	}


	public int getCategory_id() {
		return category_id;
	}


	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}


	public String getCategory_name() {
		return category_name;
	}


	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}


	public boolean isCategory_enabled() {
		return category_enabled;
	}


	public void setCategory_enabled(boolean category_enabled) {
		this.category_enabled = category_enabled;
	}


	public List<Brand> getBrand() {
		return brand;
	}


	public void setBrand(List<Brand> brand) {
		this.brand = brand;
	}


	@Override
	public String toString() {
		return "Category [category_id=" + category_id + ", category_name=" + category_name + ", category_enabled="
				+ category_enabled + ", brand=" + brand + "]";
	}






  
}
