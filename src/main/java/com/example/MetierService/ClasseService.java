package com.example.MetierService;

import java.util.Collection;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.InterfaceMetier.ClasseInterface;
import com.example.Repository.ClasseRepository;
import com.example.entites.Classe;


@Service
public class ClasseService implements ClasseInterface {
	
	
	@Autowired
	private ClasseRepository vr;
	@Transactional

	@Override
	public Collection<Classe> getAll() {
		return vr.findAll();
	}

	@Override
	public Classe getId(Long id) {
		return vr.findById(id).get();
	}

	@Override
	public void delete(long id) {
		vr.deleteById(id);
	}

	@Override
	public Classe add(Classe c) {
		return vr.save(c);
	}

	@Override
	public Classe update(Classe c) {
		return vr.saveAndFlush(c);
	}

}
