package com.example.entites;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity

public class Absence {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long IdAbs;
	private String Hdebut;
	private String Hfin;
	private Date DateD;
	private Date DateF;
	
	

	
	public Absence() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Absence(Long idAbs, String hdebut, String hfin, Date dateD, Date dateF) {
		super();
		IdAbs = idAbs;
		Hdebut = hdebut;
		Hfin = hfin;
		DateD = dateD;
		DateF = dateF;
	}
	public Long getIdAbs() {
		return IdAbs;
	}
	public void setIdAbs(Long idAbs) {
		IdAbs = idAbs;
	}
	public String getHdebut() {
		return Hdebut;
	}
	public void setHdebut(String hdebut) {
		Hdebut = hdebut;
	}
	public String getHfin() {
		return Hfin;
	}
	public void setHfin(String hfin) {
		Hfin = hfin;
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
