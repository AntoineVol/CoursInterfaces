
package dao;

import java.util.Collection;

import domain.Personne;

public interface IDao {
	public void addPersonne(Personne p);
	public void setPersonne(Personne p);
	public void removePersonne(int id);
	public Collection<Personne> findAll();
}
