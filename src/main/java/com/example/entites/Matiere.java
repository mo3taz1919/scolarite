package com.example.entites;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Matiere {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
 private Long IdMatiere;
 private String description;
 
 
public Matiere() {
	super();
}


public Matiere(Long idMatiere, String description) {
	super();
	IdMatiere = idMatiere;
	this.description = description;
}


public Long getIdMatiere() {
	return IdMatiere;
}


public void setIdMatiere(Long idMatiere) {
	IdMatiere = idMatiere;
}


public String getDescription() {
	return description;
}


public void setDescription(String description) {
	this.description = description;
}
 
}
