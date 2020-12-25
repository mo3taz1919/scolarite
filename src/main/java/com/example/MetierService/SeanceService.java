package com.example.MetierService;

import java.util.Collection;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.InterfaceMetier.SeanceInterface;
import com.example.Repository.SeanceRepository;
import com.example.entites.Seance;
@Service
public class SeanceService implements SeanceInterface {
	
	
	@Autowired
	private SeanceRepository vr;
	@Transactional

	@Override
	public Collection<Seance> getAll() {
		return vr.findAll();
	}

	@Override
	public Seance getId(Long id) {
		return vr.findById(id).get();
	}

	@Override
	public void delete(long id) {
		vr.deleteById(id);
	}

	@Override
	public Seance add(Seance c) {
		return vr.save(c);
	}

	@Override
	public Seance update(Seance c) {
		return vr.saveAndFlush(c);
	}

}
