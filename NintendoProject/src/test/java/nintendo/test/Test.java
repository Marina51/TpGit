package nintendo.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import nintendo.model.Adresse;
import nintendo.model.Boutique;
import nintendo.model.Client;
import nintendo.model.Console;
import nintendo.model.Jeu;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Console xbox = new Console ("xbox");
		Console wii = new Console("wii");
	
		Adresse adresse1 = new Adresse(15,"rue","Nantes");
		Boutique boutique1 = new Boutique("Lala", adresse1);
		
		Jeu zelda = new Jeu("Zelda",wii, boutique1);
		Jeu mario = new Jeu("Mario",xbox, boutique1);
		Jeu smashbross = new Jeu("Smash Bross",wii, boutique1);
		Jeu Fornite = new Jeu("Fortnite",xbox, boutique1);
		Jeu pokemon = new Jeu("Pokemon",wii, boutique1);
		
		List<Jeu> achat = new ArrayList();
		Collections.addAll(achat, zelda, mario, smashbross, Fornite, pokemon );
		
		Client c1 = new Client("John", "Doe", achat);
		Client c2 = new Client("Jane","Doe", achat);
		
		
		
	}

}
