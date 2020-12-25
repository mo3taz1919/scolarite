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
import com.example.InterfaceMetier.MoyenneInterface;
import com.example.entites.Matiere;
import com.example.entites.Moyenne;

@RestController
@RequestMapping("/Moyenne")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class MoyenneRest {
	@Autowired
	private MoyenneInterface vf;
	@PostMapping("/add") 
	public void save(@RequestBody Moyenne v)
	
	{	vf.add(v);
	}
	@GetMapping("/get")
	public Collection<Moyenne> findALL()
	{
		return vf.getAll();
	}
	@GetMapping("/getNom/{idMoyenne}")
	public Moyenne getNom(@PathVariable(value = "idMoyenne") Long idMoyenne)
	{
		return vf.getId(idMoyenne);
	}
	
	@DeleteMapping("/delete/{id}")
	public void supprimer(@PathVariable(value = "id") Long id) {
		vf.delete(id);
	}
	@PutMapping("edit")  // modification
	public void update (@RequestBody Moyenne v)
	
	{
	vf.update(v);
	}
	@GetMapping("/getone/{id}")
	public Moyenne findOne(@PathVariable(value = "id")Long id)
	{
		return vf.getId(id);
	}
}
