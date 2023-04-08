package com.fatma.fruit.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fatma.fruit.entities.Fruit;

public interface FruitRepository extends JpaRepository<Fruit, Long> {

}
