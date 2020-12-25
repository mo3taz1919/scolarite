package com.example.InterfaceMetier;

import java.util.Collection;

import com.example.entites.Matiere;

public interface MatiereInterface {
	public Collection<Matiere> getAll();
	public Matiere getId(Long id);
	public void delete(long id);
	public Matiere add (Matiere c );
	public Matiere update (Matiere c);
}
