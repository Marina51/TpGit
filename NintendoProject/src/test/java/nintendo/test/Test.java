package nintendo.test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import nintendo.model.Adresse;
import nintendo.model.Boutique;
import nintendo.model.Client;
import nintendo.model.Jeu;
import nintendo.model.Salon;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Salon xbox = new Salon ("xbox",500.0,LocalDate.parse("2003-11-05"));
		Salon wii = new Salon("wii",400.0,LocalDate.parse("2010-06-02"));
	
		Adresse adresse1 = new Adresse(15,"rue","Nantes");
		Boutique boutique1 = new Boutique("Lala", adresse1);
		
		Jeu zelda = new Jeu("Zelda",wii, boutique1);
		Jeu mario = new Jeu("Mario",xbox, boutique1);
		Jeu smashbross = new Jeu("Smash Bross",wii, boutique1);
		Jeu Fornite = new Jeu("Fortnite",xbox, boutique1);
		Jeu pokemon = new Jeu("Pokemon",wii, boutique1);
		
		
		
		Client c1 = new Client("John", "Doe");
		Client c2 = new Client("Jane","Doe");
		
		
		List<Jeu> achat = c1.getAchat();
		Collections.addAll(achat, zelda, mario, smashbross, Fornite, pokemon );
		
		
		
	}

}
