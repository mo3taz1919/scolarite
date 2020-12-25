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

import com.example.InterfaceMetier.VacanceInterface;
import com.example.entites.Vacance;

@RestController
@RequestMapping("/Vacance")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class VacanceRest {
	@Autowired
	private VacanceInterface vf;
	@PostMapping("/add") 
	public void save(@RequestBody Vacance v)
	
	{	vf.add(v);
	}
	@GetMapping("/get")
	public Collection<Vacance> findALL()
	{
		return vf.getAll();
	}
	@GetMapping("/getNom/{idVac}")
	public Vacance getNom(@PathVariable(value = "idVac") Long idVac)
	{
		return vf.getId(idVac);
	}
	
	@DeleteMapping("/delete/{id}")
	public void supprimer(@PathVariable(value = "id") Long id) {
		vf.delete(id);
	}
	@PutMapping("edit")  // modification
	public void update (@RequestBody Vacance v)
	
	{
	vf.update(v);
	}
	@GetMapping("/getone/{id}")
	public Vacance findOne(@PathVariable(value = "id")Long id)
	{
		return vf.getId(id);
	}

}
