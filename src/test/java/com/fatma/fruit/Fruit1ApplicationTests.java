package com.fatma.fruit;

import java.util.Date;


import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;

import com.fatma.fruit.entities.Fruit;
import com.fatma.fruit.repos.FruitRepository;
import com.fatma.fruit.service.FruitService;


@SpringBootTest
class FruitApplicationTests {

	
	@Autowired
	private FruitRepository fruitRepository;
	@Autowired
	private FruitService fruitService;
	@Test
	public void testCreateFruit() {
	Fruit frui = new Fruit("pomme",3200.500,new Date());
	fruitRepository.save(frui);
	}
	
	@Test
	public void testFindFruit()
	{
	Fruit f = fruitRepository.findById(1L).get(); 
	System.out.println(f);
	}
	@Test
	public void testUpdateFruit()
	{
	Fruit f = fruitRepository.findById(1L).get();
	f.setPrixFruit(1000.0);
	fruitRepository.save(f);
	}
	

	@Test
	public void testDeleteFruit()
	{
		fruitRepository.deleteById(1L);;
	}
	 
	@Test
	public void testListerTousProduits()
	{
	List<Fruit> fruits = fruitRepository.findAll();
	for (Fruit f : fruits)
	{
	System.out.println(f);
	}
	

	}
	
	@Test
	 public void testFindByNomFruitContains()
	 {
	 Page<Fruit> prods = fruitService.getAllFruitsParPage(0,2);
	 System.out.println(prods.getSize());
	 System.out.println(prods.getTotalElements());
	
	 System.out.println(prods.getTotalPages());
	 prods.getContent().forEach(p -> {System.out.println(p.toString());
	  });
	 /*ou bien
	 for (Produit p : prods)
	 {
	 System.out.println(p);
	 } */
	 }
}
