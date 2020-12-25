package com.example.entites;



import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import com.sun.istack.NotNull;
@Entity
public class Eleve {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long IdEleve;
	private String NomEleve;
	private String PrenomEleve;
	private String Sexe;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@NotNull
	private Date DateNaiss;
	private String lieuNaissaince;
	
	
	public Eleve() {
		super();
	}


	public Eleve(Long idEleve, String nomEleve, String prenomEleve, String sexe, Date dateNaiss,
			String lieuNaissaince) {
		super();
		IdEleve = idEleve;
		NomEleve = nomEleve;
		PrenomEleve = prenomEleve;
		Sexe = sexe;
		DateNaiss = dateNaiss;
		this.lieuNaissaince = lieuNaissaince;
	}


	public Long getIdEleve() {
		return IdEleve;
	}


	public void setIdEleve(Long idEleve) {
		IdEleve = idEleve;
	}


	public String getNomEleve() {
		return NomEleve;
	}


	public void setNomEleve(String nomEleve) {
		NomEleve = nomEleve;
	}


	public String getPrenomEleve() {
		return PrenomEleve;
	}


	public void setPrenomEleve(String prenomEleve) {
		PrenomEleve = prenomEleve;
	}


	public String getSexe() {
		return Sexe;
	}


	public void setSexe(String sexe) {
		Sexe = sexe;
	}


	public Date getDateNaiss() {
		return DateNaiss;
	}


	public void setDateNaiss(Date dateNaiss) {
		DateNaiss = dateNaiss;
	}


	public String getLieuNaissaince() {
		return lieuNaissaince;
	}


	public void setLieuNaissaince(String lieuNaissaince) {
		this.lieuNaissaince = lieuNaissaince;
	}
	
	
	
	
	

}
