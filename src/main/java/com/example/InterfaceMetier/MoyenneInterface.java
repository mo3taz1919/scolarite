package com.example.InterfaceMetier;

import java.util.Collection;

import com.example.entites.Moyenne;

public interface MoyenneInterface {
	public Collection<Moyenne> getAll();
	public Moyenne getId(Long id);
	public void delete(long id);
	public Moyenne add (Moyenne c );
	public Moyenne update (Moyenne c);
}
