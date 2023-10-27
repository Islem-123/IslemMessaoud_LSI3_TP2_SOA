package service;

import java.util.List;

public class BanqueServiceMain {

	public static void main(String[] args) {
		double montant=5.5;
		
		BanqueService bs = new BanqueService();
		
		bs.conversion(5.5);
		System.out.println("le montant après la conversion est "+bs.conversion(5.5));
		Compte compte = bs.getCompte(0);
	    System.out.println("Informations du compte individuel : "+"Code : " + compte.getCode()+"Solde : " + compte.getSolde()+"Date de création : " + compte.getDatecreat());
	       

	        List<Compte> comptes = bs.getComptes();
	        System.out.println("\nListe des comptes :");
	        for (Compte c : comptes) {
		        System.out.println("Code : " + compte.getCode()+"Solde : " + compte.getSolde()+"Date de création : " + compte.getDatecreat());

	           
	        }
	}

}
