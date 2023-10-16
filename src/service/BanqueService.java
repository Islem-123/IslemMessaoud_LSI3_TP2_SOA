package service;

import java.util.List;

public class BanqueService {
	private Compte compte;
	private List<Compte> comptes;
	
	double conversion(double montant) {
		return montant*3.36;
	}

	public Compte getCompte() {
		return compte;
	}

	public List<Compte> getComptes() {
		return comptes;
	}

	
	
}
