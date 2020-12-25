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

import com.example.InterfaceMetier.AbsenceInterface;
import com.example.entites.Absence;

@RestController
@RequestMapping("/Absence")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class AbsenceRest {
	@Autowired
	private AbsenceInterface vf;
	@PostMapping("/add") 
	public void save(@RequestBody Absence v)
	
	{	vf.add(v);
	}
	@GetMapping("/get")
	public Collection<Absence> findALL()
	{
		return vf.getAll();
	}
	@GetMapping("/getNom/{idAbs}")
	public Absence getNom(@PathVariable(value = "idAbs") Long idAbs)
	{
		return vf.getId(idAbs);
	}
	
	@DeleteMapping("/delete/{id}")
	public void supprimer(@PathVariable(value = "id") Long id) {
		vf.delete(id);
	}
	@PutMapping("edit")  // modification
	public void update (@RequestBody Absence v)
	
	{
	vf.update(v);
	}
	@GetMapping("/getone/{id}")
	public Absence findOne(@PathVariable(value = "id")Long id)
	{
		return vf.getId(id);
	}

}
