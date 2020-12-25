package com.example.InterfaceMetier;

import java.util.Collection;

import com.example.entites.Salle;


public interface SalleInterface {
	public Collection<Salle> getAll();
	public Salle getId(Long id);
	public void delete(long id);
	public Salle add (Salle c );
	public Salle update (Salle c);
}
