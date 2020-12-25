package com.example.entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Enseignant {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Idens;
	private String NomEns;
	private String PrenomEns;
	private String sexe;
	private int Cin ;
	private int Tel ;
	private String Mail;
	
	private String Adresse;

	public Enseignant() {
		super();
	}

	public Enseignant(Long idens, String nomEns, String prenomEns, String sexe, int cin, int tel, String mail,
			String adresse) {
		super();
		Idens = idens;
		NomEns = nomEns;
		PrenomEns = prenomEns;
		this.sexe = sexe;
		Cin = cin;
		Tel = tel;
		Mail = mail;
		Adresse = adresse;
	}

	public Long getIdens() {
		return Idens;
	}

	public void setIdens(Long idens) {
		Idens = idens;
	}

	public String getNomEns() {
		return NomEns;
	}

	public void setNomEns(String nomEns) {
		NomEns = nomEns;
	}

	public String getPrenomEns() {
		return PrenomEns;
	}

	public void setPrenomEns(String prenomEns) {
		PrenomEns = prenomEns;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public int getCin() {
		return Cin;
	}

	public void setCin(int cin) {
		Cin = cin;
	}

	public int getTel() {
		return Tel;
	}

	public void setTel(int tel) {
		Tel = tel;
	}

	public String getMail() {
		return Mail;
	}

	public void setMail(String mail) {
		Mail = mail;
	}

	public String getAdresse() {
		return Adresse;
	}

	public void setAdresse(String adresse) {
		Adresse = adresse;
	}



}
