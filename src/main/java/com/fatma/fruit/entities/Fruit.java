package com.fatma.fruit.entities;

import java.util.Date;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Fruit {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Long idFruit;
	private String nomFruit;
	private Double prixFruit;
	private Date dateDebSaison;
	public Fruit() {
	super();
	}
	public Fruit(String nomFruit, Double prixFruit, Date dateDebSaison) {
	super();
	this.nomFruit = nomFruit;
	this.prixFruit = prixFruit;
	this.dateDebSaison = dateDebSaison;
	}
	public Long getIdFruit() {
	return idFruit;
	}
	public void setIdFruit(Long idFruit) {
	this.idFruit = idFruit;
	}
	public String getNomFruit() {
	return nomFruit;
	}
	public void setNomFruit(String nomFruit) {
	this.nomFruit = nomFruit;
	}
	public Double getPrixFruit() {
	return prixFruit;
	}
	public void setPrixFruit(Double prixFruit) {
	this.prixFruit = prixFruit;
	}
	public Date getDateDebSaison() {
	return dateDebSaison;
	}
	public void setDateDebSaison(Date dateDebSaison) {
	this.dateDebSaison = dateDebSaison;
	}
	@Override
	public String toString() {
	return "Fruit [idFruit=" + idFruit + ", nomProduit=" +
	nomFruit + ", prixFruit=" + prixFruit
	+ ", dateCreation=" + dateDebSaison + "]";
	}
	}




