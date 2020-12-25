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

import com.example.InterfaceMetier.SalleInterface;
import com.example.entites.Salle;
@RestController
@RequestMapping("/Salle")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class SalleRest {
	@Autowired
	private SalleInterface vf;
	@PostMapping("/add") 
	public void save(@RequestBody Salle v)
	
	{	vf.add(v);
	}
	@GetMapping("/get")
	public Collection<Salle> findALL()
	{
		return vf.getAll();
	}
	@GetMapping("/getNom/{idSalle}")
	public Salle getNom(@PathVariable(value = "idSalle") Long idSalle)
	{
		return vf.getId(idSalle);
	}
	
	@DeleteMapping("/delete/{id}")
	public void supprimer(@PathVariable(value = "id") Long id) {
		vf.delete(id);
	}
	@PutMapping("edit")  // modification
	public void update (@RequestBody Salle v)
	
	{
	vf.update(v);
	}
	@GetMapping("/getone/{id}")
	public Salle findOne(@PathVariable(value = "id")Long id)
	{
		return vf.getId(id);
	}
}
