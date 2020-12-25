package com.example.InterfaceMetier;

import java.util.Collection;

import com.example.entites.Trimestre;

public interface TrimestreInterface {
	public Collection<Trimestre> getAll();
	public Trimestre getId(Long id);
	public void delete(long id);
	public Trimestre add (Trimestre c );
	public Trimestre update (Trimestre c);
}
