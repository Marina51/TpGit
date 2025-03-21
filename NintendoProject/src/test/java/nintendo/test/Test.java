package nintendo.test;

import nintendo.model.Adresse;
import nintendo.model.Boutique;
import nintendo.model.Console;

import nintendo.model.Jeu;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Console xbox = new Console ("xbox");
		Console wii = new Console("wii");
	
		
		Jeu zelda = new Jeu("Zelda",wii);
		Jeu mario = new Jeu("Mario",xbox);
		Jeu smashbross = new Jeu("Smash Bross",wii);
		Jeu Fornite = new Jeu("Fortnite",xbox);
		Jeu pokemon = new Jeu("Pokemon",wii);
		
		Adresse adresse1 = new Adresse(15,"rue","Nantes");
		Boutique boutique1 = new Boutique("Lala", adresse1);
		
	}

}
