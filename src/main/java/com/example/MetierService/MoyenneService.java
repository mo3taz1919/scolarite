package com.example.MetierService;

import java.util.Collection;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.InterfaceMetier.MoyenneInterface;
import com.example.Repository.MoyenneRepository;
import com.example.entites.Moyenne;

@Service
public class MoyenneService implements MoyenneInterface {
	
	
	@Autowired
	private MoyenneRepository vf;
	@Transactional

	@Override
	public Collection<Moyenne> getAll() {
		return vf.findAll();
	}

	@Override
	public Moyenne getId(Long id) {
		return vf.findById(id).get();
	}

	@Override
	public void delete(long id) {
		vf.deleteById(id);
	}

	@Override
	public Moyenne add(Moyenne c) {
		return vf.save(c);
	}

	@Override
	public Moyenne update(Moyenne c) {
		return vf.saveAndFlush(c);
	}


}
