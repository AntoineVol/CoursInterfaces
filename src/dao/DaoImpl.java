package dao;

import java.util.Collection;

import domain.Personne;

public class DaoImpl implements IDao {

	@Override
	public void addPersonne(Personne p) {
		System.out.println("Ajout 1 personne");
	}

	@Override
	public void setPersonne(Personne p) {
		System.out.println("Modifie 1 personne");
	}

	@Override
	public void removePersonne(int id) {
		System.out.println("Supprime 1 personne");
		
	}

	@Override
	public Collection<Personne> findAll() {
		System.out.println("Liste les personnnes");
		return null;
	}
	
}
