package com.example.MetierService;
import java.util.Collection;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.InterfaceMetier.AnnScolaireInterface;
import com.example.Repository.AnnScolaireRepository;
import com.example.entites.AnnScolaire;


@Service
public class AnnScolaireService implements AnnScolaireInterface {
	
	@Autowired
	private AnnScolaireRepository ar;
	@Transactional

	@Override
	public Collection<AnnScolaire> getAll() {
		return ar.findAll();
	}

	@Override
	public AnnScolaire getId(Long id) {
		return ar.findById(id).get();
	}

	@Override
	public void delete(long id) {
		ar.deleteById(id);
	}

	@Override
	public AnnScolaire add(AnnScolaire c) {
		return ar.save(c);
	}

	@Override
	public AnnScolaire update(AnnScolaire c) {
		return ar.saveAndFlush(c);
	}


}
