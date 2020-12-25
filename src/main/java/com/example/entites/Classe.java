package com.example.entites;

import java.util.Collection;


import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Classe {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long IdClasse;
	private int Niveau;
	private String Libelle;
	private String Description;

	
	
	
	public Classe() {
		super();
	}



	public Classe(Long idClasse, int niveau, String libelle, String description) {
		super();
		IdClasse = idClasse;
		Niveau = niveau;
		Libelle = libelle;
		Description = description;
	}



	public Long getIdClasse() {
		return IdClasse;
	}



	public void setIdClasse(Long idClasse) {
		IdClasse = idClasse;
	}



	public int getNiveau() {
		return Niveau;
	}



	public void setNiveau(int niveau) {
		Niveau = niveau;
	}



	public String getLibelle() {
		return Libelle;
	}



	public void setLibelle(String libelle) {
		Libelle = libelle;
	}



	public String getDescription() {
		return Description;
	}



	public void setDescription(String description) {
		Description = description;
	}






}
