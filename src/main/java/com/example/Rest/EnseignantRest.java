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

import com.example.InterfaceMetier.EnseignantInterface;
import com.example.entites.Enseignant;
@RestController
@RequestMapping("/Enseignant")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class EnseignantRest {
	@Autowired
	private EnseignantInterface vf;
	@PostMapping("/add") 
	public void save(@RequestBody Enseignant v)
	
	{	vf.add(v);
	}
	@GetMapping("/get")
	public Collection<Enseignant> findALL()
	{
		return vf.getAll();
	}
	@GetMapping("/getNom/{idEnseignant}")
	public Enseignant getNom(@PathVariable(value = "idEnseignant") Long idEnseignant)
	{
		return vf.getId(idEnseignant);
	}
	
	@DeleteMapping("/delete/{id}")
	public void supprimer(@PathVariable(value = "id") Long id) {
		vf.delete(id);
	}
	@PutMapping("edit")  // modification
	public void update (@RequestBody Enseignant v)
	
	{
	vf.update(v);
	}
	@GetMapping("/getone/{id}")
	public Enseignant findOne(@PathVariable(value = "id")Long id)
	{
		return vf.getId(id);
	}
}
