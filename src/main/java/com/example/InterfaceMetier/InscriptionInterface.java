package com.example.InterfaceMetier;

import java.util.Collection;

import com.example.entites.Inscription;

public interface InscriptionInterface {
	
	public Collection<Inscription> getAll();
	public Inscription getId(Long id);
	public void delete(long id);
	public Inscription add (Inscription c );
	public Inscription update (Inscription c);

}
