package PotagerModel;

import java.util.HashMap;

public class Plante {

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
		/* test */
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the affinites
	 */
	public HashMap<String, Integer> getAffinites() {
		return affinites;
	}

	/**
	 * @param affinites the affinites to set
	 */
	public void setAffinites(HashMap<String, Integer> affinites) {
		this.affinites = affinites;
	}

	private String nom;
	private HashMap<String, Integer> affinites;

	public Plante(String nom) {
		this.nom = nom;
		/*
		 * gestion du fichier xml pour créer la HashMap d'affinités
		 */
	}

}
