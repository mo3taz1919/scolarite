package com.example.InterfaceMetier;

import java.util.Collection;

import com.example.entites.Enseignant;

public interface EnseignantInterface {
	public Collection<Enseignant> getAll();
	public Enseignant getId(Long id);
	public void delete(long id);
	public Enseignant add (Enseignant c );
	public Enseignant update (Enseignant c);
}
