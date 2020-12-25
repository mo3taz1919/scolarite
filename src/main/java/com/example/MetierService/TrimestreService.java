package com.example.MetierService;

import java.util.Collection;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.InterfaceMetier.TrimestreInterface;
import com.example.Repository.TrimestreRepository;
import com.example.entites.Trimestre;

@Service

public class TrimestreService implements TrimestreInterface {

	@Autowired
	private TrimestreRepository vr;
	@Transactional

	@Override
	public Collection<Trimestre> getAll() {
		return vr.findAll();
	}

	@Override
	public Trimestre getId(Long id) {
		return vr.findById(id).get();
	}

	@Override
	public void delete(long id) {
		vr.deleteById(id);
	}

	@Override
	public Trimestre add(Trimestre c) {
		return vr.save(c);
	}

	@Override
	public Trimestre update(Trimestre c) {
		return vr.saveAndFlush(c);
	}

}
