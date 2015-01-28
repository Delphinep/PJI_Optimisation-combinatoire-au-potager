package PotagerModel;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Classe représentant une planche, c'est à dire un ensemble de cases qui devra au final contenir la même plante
 * (suaf si une des cases contient une plante expressément demandé par l'utilisateur
 */
public class Planche {

	private Plantation plantation; /*la plantation dont dépend la planche*/
	private LinkedList<CaseCultivable> cases;/*une planche est représentée par une série de lignes*/
	
	/**
	 * @return the cases
	 */
	public LinkedList<CaseCultivable> getCases() {
		return cases;
	}

	/**
	 * @param cases the cases to set
	 */
	public void setCases(LinkedList<CaseCultivable> cases) {
		this.cases = cases;
	}

	/**
	 * @return the plantation
	 */
	public Plantation getPlantation() {
		return plantation;
	}

	/**
	 * @param plantation the plantation to set
	 */
	public void setPlantation(Plantation plantation) {
		this.plantation = plantation;
	}

	public LinkedList<Planche> planchesVoisines(){
		LinkedList<Planche> planchesVoisines = new LinkedList<Planche>();
		return planchesVoisines;
	}

	public ArrayList<CaseCultivable> voisins() {
		ArrayList<CaseCultivable> voisins = new ArrayList<CaseCultivable>();
		for(int i=0;i<cases.size();i++){
			voisins.addAll(cases.get(i).voisines());
		}
		return voisins;
	}
}
