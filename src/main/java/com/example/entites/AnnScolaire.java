
package com.example.entites;

import java.sql.Date;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


@Entity
public class AnnScolaire {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long IdAnnsc;
	private String Libelle;
	private Date DateDebut;
	private Date DateFin;
	

	
	public Long getIdAnnsc() {
		return IdAnnsc;
	}
	public void setIdAnnsc(Long idAnnsc) {
		IdAnnsc = idAnnsc;
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
	public AnnScolaire(Long idAnnsc, String libelle, Date dateDebut, Date dateFin) {
		super();
		IdAnnsc = idAnnsc;
		Libelle = libelle;
		DateDebut = dateDebut;
		DateFin = dateFin;
	}

}
