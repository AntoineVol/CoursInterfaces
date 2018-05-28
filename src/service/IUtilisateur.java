package service;

import java.util.Collection;

import domain.Personne;

public interface IUtilisateur {
	public Collection<Personne> findAll();
}
