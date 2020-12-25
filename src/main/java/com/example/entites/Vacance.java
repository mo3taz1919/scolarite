package com.example.entites;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity

public class Vacance {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long IdVac;
	private String Libelle;
	private Date DateD;
	private Date DateF;
	
	public Vacance() {
		super();
	}
	public Vacance(Long idVac, String libelle, Date dateD, Date dateF) {
		super();
		IdVac = idVac;
		Libelle = libelle;
		DateD = dateD;
		DateF = dateF;
	}
	public Long getIdVac() {
		return IdVac;
	}
	public void setIdVac(Long idVac) {
		IdVac = idVac;
	}
	public String getLibelle() {
		return Libelle;
	}
	public void setLibelle(String libelle) {
		Libelle = libelle;
	}
	public Date getDateD() {
		return DateD;
	}
	public void setDateD(Date dateD) {
		DateD = dateD;
	}
	public Date getDateF() {
		return DateF;
	}
	public void setDateF(Date dateF) {
		DateF = dateF;
	}
	
}
