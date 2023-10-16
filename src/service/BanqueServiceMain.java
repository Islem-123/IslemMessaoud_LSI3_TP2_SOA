package service;

public class BanqueServiceMain {

	public static void main(String[] args) {
		double montant=5.5;
		Compte c1 = new Compte(10,10.5,"2/12/2023");
		Compte c2 = new Compte(9,15.5,"20/10/2023");
		BanqueService bs = new BanqueService();
		bs.conversion(5.5);
		System.out.println("le montant après la conversion est "+bs.conversion(5.5));

		
		
	}

}
