package PotagerModel;

import java.util.ArrayList;
import java.util.LinkedList;

public class Plantation {

	private ArrayList<Planche> planches;
	private Jardin jardin;
	private Plante[] aPlanter;
	
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
	
	/**
	 * @return the aPlanter
	 */
	public Plante[] getaPlanter() {
		return aPlanter;
	}

	/**
	 * @param aPlanter the aPlanter to set
	 */
	public void setaPlanter(Plante[] aPlanter) {
		this.aPlanter = aPlanter;
	}


}
