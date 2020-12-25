package com.example.InterfaceMetier;

import java.util.Collection;

import com.example.entites.Classe;

public interface ClasseInterface {
	public Collection<Classe> getAll();
	public Classe getId(Long id);
	public void delete(long id);
	public Classe add (Classe c );
	public Classe update (Classe c);
}
