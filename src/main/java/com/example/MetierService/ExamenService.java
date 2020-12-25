package com.example.MetierService;

import java.util.Collection;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.InterfaceMetier.ExamenInterface;
import com.example.Repository.ExamenRepository;
import com.example.entites.Examen;

@Service

public class ExamenService implements ExamenInterface{
	@Autowired
	private ExamenRepository vr;
	@Transactional

	@Override
	public Collection<Examen> getAll() {
		return vr.findAll();
	}

	@Override
	public Examen getId(Long id) {
		return vr.findById(id).get();
	}

	@Override
	public void delete(long id) {
		vr.deleteById(id);
	}

	@Override
	public Examen add(Examen c) {
		return vr.save(c);
	}

	@Override
	public Examen update(Examen c) {
		return vr.saveAndFlush(c);
	}

}
