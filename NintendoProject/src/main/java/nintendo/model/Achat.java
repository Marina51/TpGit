package nintendo.model;

import java.time.LocalDate;

public class Achat {
	
	protected Jeu jeu;
	protected LocalDate date;
	protected double prix;
	
	
	public Achat(Jeu jeu, LocalDate date, double prix) {
		super();
		this.jeu = jeu;
		this.date = date;
		this.prix = prix;
	}


	public Jeu getJeu() {
		return jeu;
	}


	public void setJeu(Jeu jeu) {
		this.jeu = jeu;
	}


	public LocalDate getDate() {
		return date;
	}


	public void setDate(LocalDate date) {
		this.date = date;
	}


	public double getPrix() {
		return prix;
	}


	public void setPrix(double prix) {
		this.prix = prix;
	}


	@Override
	public String toString() {
		return "Achat [jeu=" + jeu + ", prix=" + prix + "]";
	}
	
	

}
