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

import com.example.InterfaceMetier.NiveauInterface;
import com.example.entites.Niveau;

@RestController
@RequestMapping("/Niveau")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class NiveauRest {
	@Autowired
	private NiveauInterface vf;
	@PostMapping("/add") 
	public void save(@RequestBody Niveau v)
	
	{	vf.add(v);
	}
	@GetMapping("/get")
	public Collection<Niveau> findALL()
	{
		return vf.getAll();
	}
	@GetMapping("/getNom/{idNiveau}")
	public Niveau getNom(@PathVariable(value = "idNiveau") Long idNiveau)
	{
		return vf.getId(idNiveau);
	}
	
	@DeleteMapping("/delete/{id}")
	public void supprimer(@PathVariable(value = "id") Long id) {
		vf.delete(id);
	}
	@PutMapping("edit")  // modification
	public void update (@RequestBody Niveau v)
	
	{
	vf.update(v);
	}
	@GetMapping("/getone/{id}")
	public Niveau findOne(@PathVariable(value = "id")Long id)
	{
		return vf.getId(id);
	}
}
