package com.spring.hackerearth.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.hackerearth.dto.Recipedto;
import com.spring.hackerearth.entity.Recipeentity;
import com.spring.hackerearth.exception.InvalidRecipeId;
import com.spring.hackerearth.repo.Reciperepo;

//import net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional;

@Service
public class RecipeserviceImpl implements Recipeservice{

	@Autowired
	Reciperepo reciperepo;
	@Override
	public Recipedto createRecipe(Recipedto recipedto) {
		// TODO Auto-generated method stub
		Recipeentity recipeentity =new Recipeentity(recipedto.getName(),recipedto.getImage(),
				recipedto.getCategory(),recipedto.getLabel(),recipedto.getPrice(),recipedto.getDescription());
		recipeentity=reciperepo.save(recipeentity);
		recipedto=new Recipedto(recipeentity.getId(),recipeentity.getName(),
				recipeentity.getImage(),recipeentity.getCategory(),
				recipeentity.getLabel(),recipeentity.getPrice(),recipeentity.getDescription());
		
		
		
		return recipedto;
	}

	@Override
	public Recipedto getRecipeById( int Id) {
		// TODO Auto-generated method stub
		Optional<Recipeentity>recipe=reciperepo.findById(Id);
		if(recipe.isPresent())
		{
		Recipeentity recipeentity=recipe.get();
		Recipedto recipedto=new Recipedto(recipeentity.getId(),recipeentity.getName(),
				recipeentity.getImage(),recipeentity.getCategory(),
				recipeentity.getLabel(),recipeentity.getPrice(),recipeentity.getDescription());
		return recipedto;
		}
		throw new InvalidRecipeId("invalid recipe id");
	}

}
