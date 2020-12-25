package com.example.entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Moyenne {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
 private Long IdMoyenne;
 private String description;
public Moyenne() {
	super();
}
public Moyenne(Long idMoyenne, String description) {
	super();
	IdMoyenne = idMoyenne;
	this.description = description;
}
public Long getIdMoyenne() {
	return IdMoyenne;
}
public void setIdMoyenne(Long idMoyenne) {
	IdMoyenne = idMoyenne;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
 
}
