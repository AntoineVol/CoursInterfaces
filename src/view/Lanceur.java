package view;

import java.util.Scanner;

import domain.Personne;
import service.IAdmin;
import service.IUtilisateur;
import service.ServiceImpl;

public class Lanceur {
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		IAdmin admin = new ServiceImpl();
		IUtilisateur utilisateur = new ServiceImpl();
		admin.addPersonne(new Personne());
		utilisateur.findAll();
		System.out.println("Test pour commit v2");

	}

}
