package PotagerModel;

import java.util.ArrayList;

public class Plantation {

	private ArrayList<Planche> planches;
	private Jardin jardin;
	
	public Plantation() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the planches
	 */
	public ArrayList<Planche> getPlanches() {
		return planches;
	}

	/**
	 * @param planches the planches to set
	 */
	public void setPlanches(ArrayList<Planche> planches) {
		this.planches = planches;
	}

	/**
	 * @return the jardin
	 */
	public Jardin getJardin() {
		return jardin;
	}

	/**
	 * @param jardin the jardin to set
	 */
	public void setJardin(Jardin jardin) {
		this.jardin = jardin;
	}
	
	@SuppressWarnings("null")
	public ArrayList<CaseCultivable> voisins(){
		ArrayList<CaseCultivable> voisins = null;
		for(int i=0;i<planches.size();i++){
			voisins.addAll(planches.get(i).voisins());
		}
		return voisins;
	}

}
