package service;

import java.util.Collection;

import dao.DaoImpl;
import dao.IDao;
import domain.Personne;

public class ServiceImpl implements IAdmin, IUtilisateur{
	
	//attribut de passage d'une couche à une autre
	private IDao dao = new DaoImpl();

	@Override
	public void addPersonne(Personne p) {
		dao.addPersonne(p);
		
	}

	@Override
	public void setPersonne(Personne p) {
		dao.setPersonne(p);
		
	}

	@Override
	public void removePersonne(int id) {
		dao.removePersonne(id);
		
	}

	@Override
	public Collection<Personne> findAll() {
		return dao.findAll();
	}
	

}
