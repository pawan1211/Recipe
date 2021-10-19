package com.spring.hackerearth.service;

import com.spring.hackerearth.dto.Recipedto;

public interface Recipeservice {

	public Recipedto createRecipe(Recipedto recipedto);
	public Recipedto getRecipeById(int Id);
}
