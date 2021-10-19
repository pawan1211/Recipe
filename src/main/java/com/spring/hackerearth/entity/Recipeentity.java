package com.spring.hackerearth.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Recipeentity")
public class Recipeentity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	


	private String name;
	private String image;
	private String category;
	private String label;
	private String price;
	private String description;
	public Recipeentity()
	{
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public Recipeentity( String name, String image, String category, String label, String price,
			String description) {
		super();
		this.name = name;
		this.image = image;
		this.category = category;
		this.label = label;
		this.price = price;
		this.description = description;
	}
	public String toString() {
		return "Recipeentity [id=" + id + ", name=" + name + ", image=" + image + ", category=" + category + ", label="
				+ label + ", price=" + price + ", description=" + description + "]";
	}

}
