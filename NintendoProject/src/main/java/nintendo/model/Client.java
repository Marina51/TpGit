package nintendo.model;

import java.util.List;

public class Client {
	private String nom;
	private String prenom;
	private List<Jeu> achat;
	
		public Client(String nom, String prenom, List<Jeu> achat) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.achat = achat;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public List<Jeu> getAchat() {
		return achat;
	}

	public void setAchat(List<Jeu> achat) {
		this.achat = achat;
	}

	
}
