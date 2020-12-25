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
public class Examen {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long IdExm;
	private String Type;
	private String Hdebut;
	private String Hfin;
	private Date DateDev;

	
	public Examen(Long idExm, String type, String hdebut, String hfin, Date dateDev) {
		super();
		IdExm = idExm;
		Type = type;
		Hdebut = hdebut;
		Hfin = hfin;
		DateDev = dateDev;
	}
	public Long getIdExm() {
		return IdExm;
	}
	public void setIdExm(Long idExm) {
		IdExm = idExm;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
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
	public Date getDateDev() {
		return DateDev;
	}
	public void setDateDev(Date dateDev) {
		DateDev = dateDev;
	}
	

}
