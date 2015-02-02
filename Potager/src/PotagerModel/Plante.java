package PotagerModel;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class Plante {

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
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
	public HashMap<String, Integer> affinites;
	public String listeAffinites;

	public Plante(String nom, String listeAffinites) {
		this.listeAffinites = listeAffinites;
		this.nom = nom;
		/*
		 * gestion du fichier xml pour créer la HashMap d'affinités
		 */
	}

}
