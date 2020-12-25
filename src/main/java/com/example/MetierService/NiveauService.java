package com.example.MetierService;

import java.util.Collection;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.InterfaceMetier.NiveauInterface;
import com.example.Repository.NiveauRepository;
import com.example.entites.Niveau;
@Service
public class NiveauService implements NiveauInterface {
	
	
	@Autowired
	private NiveauRepository vf;
	@Transactional

	@Override
	public Collection<Niveau> getAll() {
		return vf.findAll();
	}

	@Override
	public Niveau getId(Long id) {
		return vf.findById(id).get();
	}

	@Override
	public void delete(long id) {
		vf.deleteById(id);
	}

	@Override
	public Niveau add(Niveau c) {
		return vf.save(c);
	}

	@Override
	public Niveau update(Niveau c) {
		return vf.saveAndFlush(c);
	}

}
