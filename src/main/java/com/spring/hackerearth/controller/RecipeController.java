package com.spring.hackerearth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.hackerearth.dto.Recipedto;
import com.spring.hackerearth.service.RecipeserviceImpl;

@RestController

public class RecipeController {
	
	
	@Autowired
	RecipeserviceImpl recipeserviceImpl;
	
	@PostMapping("/")
	
	public Recipedto createrecipe(@RequestBody Recipedto recipedto)
	{
		Recipedto recipsdto1=recipeserviceImpl.createRecipe(recipedto);
		return recipsdto1;
	}
	
	@GetMapping("/{id}")
	public Recipedto getrecipebyid(@PathVariable("id") int id)
	{
		Recipedto recipsdto1=recipeserviceImpl.getRecipeById(id);
		return recipsdto1;
	}
	@GetMapping("/{id}/show")
	public String getrecipebyidshow(@PathVariable("id") int id)
	{
		Recipedto recipsdto1=recipeserviceImpl.getRecipeById(id);
		return recipsdto1.getImage();
	}
	
	

}
