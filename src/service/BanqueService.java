package service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BanqueService {
	
	
	double conversion(double montant) {
		return montant*3.36;
	}

	public Compte getCompte(int code) {
		return new Compte(code, 0, new Date());
	}

	public List<Compte> getComptes() {
		List<Compte> comptes = new ArrayList<>();
		Compte c1 = new Compte(10,10.5,new Date());
		Compte c2 = new Compte(9,15.5,new Date());
		comptes.add(c1);
		comptes.add(c2);
		return comptes;
	}

	
	
}
