package com.example.InterfaceMetier;
import java.util.Collection;

import com.example.entites.AnnScolaire;
public interface AnnScolaireInterface {
	public Collection <AnnScolaire> getAll();
	public AnnScolaire getId(Long id);
	public void delete(long id);
	public AnnScolaire add (AnnScolaire c );
	public AnnScolaire update (AnnScolaire c);

}
