package com.example.Rest;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.InterfaceMetier.InscriptionInterface;
import com.example.entites.Inscription;

@RestController
@RequestMapping("/Inscription")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class InscriptionRest {
	@Autowired
	private InscriptionInterface vf;
	@PostMapping("/add") 
	public void save(@RequestBody Inscription v)
	
	{	vf.add(v);
	}
	@GetMapping("/get")
	public Collection<Inscription> findALL()
	{
		return vf.getAll();
	}
	@GetMapping("/getNom/{idInscri}")
	public Inscription getNom(@PathVariable(value = "idInscri") Long idInscri)
	{
		return vf.getId(idInscri);
	}
	
	@DeleteMapping("/delete/{id}")
	public void supprimer(@PathVariable(value = "id") Long id) {
		vf.delete(id);
	}
	@PutMapping("edit")  // modification
	public void update (@RequestBody Inscription v)
	
	{
	vf.update(v);
	}
	@GetMapping("/getone/{id}")
	public Inscription findOne(@PathVariable(value = "id")Long id)
	{
		return vf.getId(id);
	}
}
