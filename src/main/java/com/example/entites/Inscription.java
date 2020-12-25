package com.example.entites;

import java.sql.Date;
import java.util.Collection;


import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Inscription {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long IdInscri;
	private Date DateInscription;
	private Double FraisInscription;
	
	
	public Inscription() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Inscription(Long idInscri, Date dateInscription, Double fraisInscription) {
		super();
		IdInscri = idInscri;
		DateInscription = dateInscription;
		FraisInscription = fraisInscription;
	}


	public Long getIdInscri() {
		return IdInscri;
	}


	public void setIdInscri(Long idInscri) {
		IdInscri = idInscri;
	}


	public Date getDateInscription() {
		return DateInscription;
	}


	public void setDateInscription(Date dateInscription) {
		DateInscription = dateInscription;
	}


	public Double getFraisInscription() {
		return FraisInscription;
	}


	public void setFraisInscription(Double fraisInscription) {
		FraisInscription = fraisInscription;
	}

	
	
	
}
