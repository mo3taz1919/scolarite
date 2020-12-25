package com.example.MetierService;

import java.util.Collection;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.InterfaceMetier.AbsenceInterface;
import com.example.Repository.AbsenceRepository;
import com.example.entites.Absence;

@Service

public class AbsenceService implements AbsenceInterface {
	@Autowired
	private AbsenceRepository vr;
	@Transactional

	@Override
	public Collection<Absence> getAll() {
		return vr.findAll();
	}

	@Override
	public Absence getId(Long id) {
		return vr.findById(id).get();
	}

	@Override
	public void delete(long id) {
		vr.deleteById(id);
	}

	@Override
	public Absence add(Absence c) {
		return vr.save(c);
	}

	@Override
	public Absence update(Absence c) {
		return vr.saveAndFlush(c);
	}

}
