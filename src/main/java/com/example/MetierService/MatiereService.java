package com.example.MetierService;

import java.util.Collection;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.InterfaceMetier.MatiereInterface;
import com.example.Repository.MatiereRepository;
import com.example.entites.Matiere;
@Service
public class MatiereService implements MatiereInterface {
	
	
	@Autowired
	private MatiereRepository vr;
	@Transactional

	@Override
	public Collection<Matiere> getAll() {
		return vr.findAll();
	}

	@Override
	public Matiere getId(Long id) {
		return vr.findById(id).get();
	}

	@Override
	public void delete(long id) {
		vr.deleteById(id);
	}

	@Override
	public Matiere add(Matiere c) {
		return vr.save(c);
	}

	@Override
	public Matiere update(Matiere c) {
		return vr.saveAndFlush(c);
	}

}
