package com.example.InterfaceMetier;

import java.util.Collection;

import com.example.entites.Vacance;


public interface VacanceInterface {
	public Collection<Vacance> getAll();
	public Vacance getId(Long id);
	public void delete(long id);
	public Vacance add (Vacance c );
	public Vacance update (Vacance c);

}
