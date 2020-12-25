package com.example.MetierService;

import java.util.Collection;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.InterfaceMetier.InscriptionInterface;
import com.example.Repository.InscriptionRepository;
import com.example.entites.Inscription;

@Service
public class InscriptionService implements InscriptionInterface{
	@Autowired
	private InscriptionRepository vr;
	@Transactional

	@Override
	public Collection<Inscription> getAll() {
		return vr.findAll();
	}

	@Override
	public Inscription getId(Long id) {
		return vr.findById(id).get();
	}

	@Override
	public void delete(long id) {
		vr.deleteById(id);
	}

	@Override
	public Inscription add(Inscription c) {
		return vr.save(c);
	}

	@Override
	public Inscription update(Inscription c) {
		return vr.saveAndFlush(c);
	}
}
