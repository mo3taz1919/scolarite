package com.example.MetierService;

import java.util.Collection;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.InterfaceMetier.VacanceInterface;
import com.example.Repository.VacanceRepository;
import com.example.entites.Vacance;

@Service

public class VacanceService implements VacanceInterface{
	
	@Autowired
	private VacanceRepository vr;
	@Transactional

	@Override
	public Collection<Vacance> getAll() {
		return vr.findAll();
	}

	@Override
	public Vacance getId(Long id) {
		return vr.findById(id).get();
	}

	@Override
	public void delete(long id) {
		vr.deleteById(id);
	}

	@Override
	public Vacance add(Vacance c) {
		return vr.save(c);
	}

	@Override
	public Vacance update(Vacance c) {
		return vr.saveAndFlush(c);
	}

}
