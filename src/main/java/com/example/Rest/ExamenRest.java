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

import com.example.InterfaceMetier.ExamenInterface;
import com.example.entites.Examen;

@RestController
@RequestMapping("Examen/")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ExamenRest {
	
	@Autowired
	private ExamenInterface vf;
	@PostMapping("/add") 
	public void save(@RequestBody Examen v)
	
	{	vf.add(v);
	}
	@GetMapping("/get")
	public Collection<Examen> findALL()
	{
		return vf.getAll();
	}
	@GetMapping("/getNom/{idExm}")
	public Examen getNom(@PathVariable(value = "idExm") Long idExm)
	{
		return vf.getId(idExm);
	}
	
	@DeleteMapping("/delete/{id}")
	public void supprimer(@PathVariable(value = "id") Long id) {
		vf.delete(id);
	}
	@PutMapping("edit")  // modification
	public void update (@RequestBody Examen v)
	
	{
	vf.update(v);
	}
	@GetMapping("/getone/{id}")
	public Examen findOne(@PathVariable(value = "id")Long id)
	{
		return vf.getId(id);
	}

}
