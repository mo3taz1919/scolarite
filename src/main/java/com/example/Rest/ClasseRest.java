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

import com.example.InterfaceMetier.ClasseInterface;
import com.example.entites.Classe;

@RestController
@RequestMapping("/Classe")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ClasseRest {
	@Autowired
	private ClasseInterface vf;
	@PostMapping("/add") 
	public void save(@RequestBody Classe v)
	
	{	vf.add(v);
	}
	@GetMapping("/get")
	public Collection<Classe> findALL()
	{
		return vf.getAll();
	}
	@GetMapping("/getNom/{idClasse}")
	public Classe getNom(@PathVariable(value = "idClasse") Long idClasse)
	{
		return vf.getId(idClasse);
	}
	
	@DeleteMapping("/delete/{id}")
	public void supprimer(@PathVariable(value = "id") Long id) {
		vf.delete(id);
	}
	@PutMapping("edit")  // modification
	public void update (@RequestBody Classe v)
	
	{
	vf.update(v);
	}
	@GetMapping("/getone/{id}")
	public Classe findOne(@PathVariable(value = "id")Long id)
	{
		return vf.getId(id);
	}
}
