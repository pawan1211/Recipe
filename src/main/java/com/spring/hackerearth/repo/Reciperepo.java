package com.spring.hackerearth.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.hackerearth.entity.Recipeentity;

@Repository
public interface Reciperepo extends JpaRepository<Recipeentity,Integer>{

}
