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

import com.example.InterfaceMetier.TrimestreInterface;
import com.example.entites.Trimestre;

@RestController
@RequestMapping("/Trimestre")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class TrimestreRest {
	
	@Autowired
	private TrimestreInterface vf;
	@PostMapping("/add") 
	public void save(@RequestBody Trimestre v)
	
	{	vf.add(v);
	}
	@GetMapping("/get")
	public Collection<Trimestre> findALL()
	{
		return vf.getAll();
	}
	@GetMapping("/getNom/{idTri}")
	public Trimestre getNom(@PathVariable(value = "idTri") Long idTri)
	{
		return vf.getId(idTri);
	}
	
	@DeleteMapping("/delete/{id}")
	public void supprimer(@PathVariable(value = "id") Long id) {
		vf.delete(id);
	}
	@PutMapping("edit")  // modification
	public void update (@RequestBody Trimestre v)
	
	{
	vf.update(v);
	}
	@GetMapping("/getone/{id}")
	public Trimestre findOne(@PathVariable(value = "id")Long id)
	{
		return vf.getId(id);
	}

}
