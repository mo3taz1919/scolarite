package com.example.MetierService;

import java.util.Collection;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.InterfaceMetier.EleveInterface;
import com.example.Repository.EleveRepository;
import com.example.entites.Eleve;
@Service
public class EleveService implements EleveInterface {
	
	
	@Autowired
	private EleveRepository vr;
	@Transactional

	@Override
	public Collection<Eleve> getAll() {
		return vr.findAll();
	}

	@Override
	public Eleve getId(Long id) {
		return vr.findById(id).get();
	}

	@Override
	public void delete(long id) {
		vr.deleteById(id);
	}

	@Override
	public Eleve add(Eleve c) {
		return vr.save(c);
	}

	@Override
	public Eleve update(Eleve c) {
		return vr.saveAndFlush(c);
	}

}
