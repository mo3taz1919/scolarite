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

import com.example.InterfaceMetier.MatiereInterface;
import com.example.entites.Matiere;
@RestController
@RequestMapping("/Matiere")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class MatiereRest {
	@Autowired
	private MatiereInterface vf;
	@PostMapping("/add") 
	public void save(@RequestBody Matiere v)
	
	{	vf.add(v);
	}
	@GetMapping("/get")
	public Collection<Matiere> findALL()
	{
		return vf.getAll();
	}
	@GetMapping("/getNom/{idMatiere}")
	public Matiere getNom(@PathVariable(value = "idMatiere") Long idMatiere)
	{
		return vf.getId(idMatiere);
	}
	
	@DeleteMapping("/delete/{id}")
	public void supprimer(@PathVariable(value = "id") Long id) {
		vf.delete(id);
	}
	@PutMapping("edit")  // modification
	public void update (@RequestBody Matiere v)
	
	{
	vf.update(v);
	}
	@GetMapping("/getone/{id}")
	public Matiere findOne(@PathVariable(value = "id")Long id)
	{
		return vf.getId(id);
	}
}
