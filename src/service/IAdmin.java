package service;

import domain.Personne;

public interface IAdmin extends IUtilisateur {
	public void addPersonne(Personne p);
	public void setPersonne(Personne p);
	public void removePersonne(int id);

}
