package com.example.InterfaceMetier;

import java.util.Collection;

import com.example.entites.Absence;

public interface AbsenceInterface {
	public Collection<Absence> getAll();
	public Absence getId(Long id);
	public void delete(long id);
	public Absence add (Absence c );
	public Absence update (Absence c);
}
