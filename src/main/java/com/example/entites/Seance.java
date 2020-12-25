package com.example.entites;

import java.util.Collection;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
@Entity
public class Seance {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long IdSeance;
	private String libelle;
	 private int HDebut;
	 private int Hfin;
	 
	 @OneToOne
	 @JoinColumn(name="IdMatiere")
	 private Matiere matiere;
		
		@OneToOne
		@JoinColumn(name="IdSalle")
		private Salle salle;
		@ManyToOne
		@JoinColumn(name="IdClasse")
		private Classe classe;
		
		
		public Seance() {
			super();
		}


		public Seance(long idSeance, String libelle, int hDebut, int hfin, Matiere matiere, Salle salle, Classe classe) {
			super();
			IdSeance = idSeance;
			this.libelle = libelle;
			HDebut = hDebut;
			Hfin = hfin;
			this.matiere = matiere;
			this.salle = salle;
			this.classe = classe;
		}


		public long getIdSeance() {
			return IdSeance;
		}


		public void setIdCours(long idSeance) {
			IdSeance = idSeance;
		}


		public String getLibelle() {
			return libelle;
		}


		public void setLibelle(String libelle) {
			this.libelle = libelle;
		}


		public int getHDebut() {
			return HDebut;
		}


		public void setHDebut(int hDebut) {
			HDebut = hDebut;
		}


		public int getHfin() {
			return Hfin;
		}


		public void setHfin(int hfin) {
			Hfin = hfin;
		}


		public Matiere getMatiere() {
			return matiere;
		}


		public void setMatiere(Matiere matiere) {
			this.matiere = matiere;
		}


		public Salle getSalle() {
			return salle;
		}


		public void setSalle(Salle salle) {
			this.salle = salle;
		}


		public Classe getClasse() {
			return classe;
		}


		public void setClasse(Classe classe) {
			this.classe = classe;
		}



		
}
