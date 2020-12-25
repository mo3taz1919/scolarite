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

import com.example.InterfaceMetier.AnnScolaireInterface;
import com.example.entites.AnnScolaire;
@RestController
@RequestMapping("/AnnScolaire")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class AnnScolaireRest {
	@Autowired
	private AnnScolaireInterface vf;
	@PostMapping("/add") 
	public void save(@RequestBody AnnScolaire v)
	
	{	vf.add(v);
	}
	@GetMapping("/get")
	public Collection<AnnScolaire> findALL()
	{
		return vf.getAll();
	}
	@GetMapping("/getNom/{idAnnsc}")
	public AnnScolaire getNom(@PathVariable(value = "idAnnsc") Long idAnnsc)
	{
		return vf.getId(idAnnsc);
	}
	
	@DeleteMapping("/delete/{id}")
	public void supprimer(@PathVariable(value = "id") Long id) {
		vf.delete(id);
	}
	@PutMapping("edit")  // modification
	public void update (@RequestBody AnnScolaire v)
	
	{
	vf.update(v);
	}
	@GetMapping("/getone/{id}")
	public AnnScolaire findOne(@PathVariable(value = "id")Long id)
	{
		return vf.getId(id);
	}

}
