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

import com.example.InterfaceMetier.EleveInterface;
import com.example.entites.Eleve;
@RestController
@RequestMapping("/Eleve")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class EleveRest {
	@Autowired
	private EleveInterface vf;
	@PostMapping("/add") 
	public void save(@RequestBody Eleve v)
	
	{	vf.add(v);
	}
	@GetMapping("/get")
	public Collection<Eleve> findALL()
	{
		return vf.getAll();
	}
	@GetMapping("/getNom/{idEleve}")
	public Eleve getNom(@PathVariable(value = "idEleve") Long idEleve)
	{
		return vf.getId(idEleve);
	}
	
	@DeleteMapping("/delete/{id}")
	public void supprimer(@PathVariable(value = "id") Long id) {
		vf.delete(id);
	}
	@PutMapping("edit")  // modification
	public void update (@RequestBody Eleve v)
	
	{
	vf.update(v);
	}
	@GetMapping("/getone/{id}")
	public Eleve findOne(@PathVariable(value = "id")Long id)
	{
		return vf.getId(id);
	}
}
