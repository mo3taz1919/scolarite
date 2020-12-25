package com.example.InterfaceMetier;

import java.util.Collection;

import com.example.entites.Seance;


public interface SeanceInterface {
	public Collection<Seance> getAll();
	public Seance getId(Long id);
	public void delete(long id);
	public Seance add (Seance c );
	public Seance update (Seance c);
}
