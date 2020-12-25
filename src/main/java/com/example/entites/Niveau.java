package com.example.entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Niveau {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
 private Long IdNiveau;
 private String libelle;
public Niveau() {
	super();
}
public Niveau(Long idNiveau, String libelle) {
	super();
	IdNiveau = idNiveau;
	this.libelle = libelle;
}
public Long getIdNiveau() {
	return IdNiveau;
}
public void setIdNiveau(Long idNiveau) {
	IdNiveau = idNiveau;
}
public String getLibelle() {
	return libelle;
}
public void setLibelle(String libelle) {
	this.libelle = libelle;
}
 
 
}
