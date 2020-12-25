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

import com.example.InterfaceMetier.SeanceInterface;
import com.example.entites.Seance;
@RestController
@RequestMapping("/Seance")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class SeanceRest {
	@Autowired
	private SeanceInterface vf;
	@PostMapping("/add") 
	public void save(@RequestBody Seance v)
	
	{	vf.add(v);
	}
	@GetMapping("/get")
	public Collection<Seance> findALL()
	{
		return vf.getAll();
	}
	@GetMapping("/getNom/{idSeance}")
	public Seance getNom(@PathVariable(value = "idSeance") Long idSeance)
	{
		return vf.getId(idSeance);
	}
	
	@DeleteMapping("/delete/{id}")
	public void supprimer(@PathVariable(value = "id") Long id) {
		vf.delete(id);
	}
	@PutMapping("edit")  // modification
	public void update (@RequestBody Seance v)
	
	{
	vf.update(v);
	}
	@GetMapping("/getone/{id}")
	public Seance findOne(@PathVariable(value = "id")Long id)
	{
		return vf.getId(id);
	}
}
