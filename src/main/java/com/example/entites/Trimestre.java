package com.example.entites;
import java.sql.Date;
import java.util.Collection;


import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Trimestre {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long IdTri;
	private String Libelle;
	private Date DateDebut;
	private Date DateFin;

	public Long getIdTri() {
		return IdTri;
	}

	public void setIdTri(Long idTri) {
		IdTri = idTri;
	}

	public String getLibelle() {
		return Libelle;
	}

	public void setLibelle(String libelle) {
		Libelle = libelle;
	}

	public Date getDateDebut() {
		return DateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		DateDebut = dateDebut;
	}

	public Date getDateFin() {
		return DateFin;
	}

	public void setDateFin(Date dateFin) {
		DateFin = dateFin;
	}

	public Trimestre(Long idTri, String libelle, Date dateDebut, Date dateFin) {
		super();
		IdTri = idTri;
		Libelle = libelle;
		DateDebut = dateDebut;
		DateFin = dateFin;
	}

	
}
