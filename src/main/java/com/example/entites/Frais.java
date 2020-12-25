package com.example.entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Frais {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long IdFrai;
	private int Mois;
	public Frais(Long idFrai, int mois) {
		super();
		IdFrai = idFrai;
		Mois = mois;
	}
	public Long getIdFrai() {
		return IdFrai;
	}
	public void setIdFrai(Long idFrai) {
		IdFrai = idFrai;
	}
	public int getMois() {
		return Mois;
	}
	public void setMois(int mois) {
		Mois = mois;
	}
	
	
}
