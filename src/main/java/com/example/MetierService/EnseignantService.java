package com.example.MetierService;

import java.util.Collection;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.InterfaceMetier.EnseignantInterface;
import com.example.Repository.EnseignantRepository;
import com.example.entites.Enseignant;
@Service
public class EnseignantService implements EnseignantInterface {
	
	
	@Autowired
	private EnseignantRepository vr;
	@Transactional

	@Override
	public Collection<Enseignant> getAll() {
		return vr.findAll();
	}

	@Override
	public Enseignant getId(Long id) {
		return vr.findById(id).get();
	}

	@Override
	public void delete(long id) {
		vr.deleteById(id);
	}

	@Override
	public Enseignant add(Enseignant c) {
		return vr.save(c);
	}

	@Override
	public Enseignant update(Enseignant c) {
		return vr.saveAndFlush(c);
	}

}
