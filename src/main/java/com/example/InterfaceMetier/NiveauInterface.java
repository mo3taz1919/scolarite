package com.example.InterfaceMetier;

import java.util.Collection;


import com.example.entites.Niveau;

public interface NiveauInterface {
	public Collection<Niveau> getAll();
	public Niveau getId(Long id);
	public void delete(long id);
	public Niveau add (Niveau vf );
	public Niveau update (Niveau vf);
}
