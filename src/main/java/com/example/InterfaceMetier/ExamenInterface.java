package com.example.InterfaceMetier;

import java.util.Collection;

import com.example.entites.Examen;

public interface ExamenInterface {
	public Collection<Examen> getAll();
	public Examen getId(Long id);
	public void delete(long id);
	public Examen add (Examen c );
	public Examen update (Examen c);

}
