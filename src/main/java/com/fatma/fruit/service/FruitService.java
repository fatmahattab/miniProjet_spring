package com.fatma.fruit.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.fatma.fruit.entities.Fruit;


public interface FruitService {
	Fruit saveFruit(Fruit f);
	Fruit updateFruit(Fruit f);
	void deleteFruit(Fruit f);
	 void deleteFruitById(Long id);
	Fruit getFruit(Long id);
	List<Fruit> getAllFruits();
	Page<Fruit> getAllFruitsParPage(int page, int size);


}
