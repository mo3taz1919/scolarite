package com.example.entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Salle {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long IdSalle;
	private String NumSalle;
	private int Capacite;
	private String type;
	
	public Salle() {
		super();
	}

	public Salle(Long idSalle, String numSalle, int capacite, String type) {
		super();
		IdSalle = idSalle;
		NumSalle = numSalle;
		Capacite = capacite;
		this.type = type;
	}

	public Long getIdSalle() {
		return IdSalle;
	}

	public void setIdSalle(Long idSalle) {
		IdSalle = idSalle;
	}

	public String getNumSalle() {
		return NumSalle;
	}

	public void setNumSalle(String numSalle) {
		NumSalle = numSalle;
	}

	public int getCapacite() {
		return Capacite;
	}

	public void setCapacite(int capacite) {
		Capacite = capacite;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}


}
