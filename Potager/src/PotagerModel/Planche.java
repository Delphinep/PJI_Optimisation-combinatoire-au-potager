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
		LinkedList<CaseTerrain> casesVoisines = new LinkedList<CaseTerrain>();
		for(int i=0;i<this.cases.size();i++){
			CaseTerrain caseI = new CaseTerrain();
			System.out.println(i);
			caseI = this.cases.get(i).getCaseTerrain();
		casesVoisines.addAll(this.plantation.getJardin().voisinsCase(caseI.getX(),caseI.getY()));
		}
		for(int j=0;j<casesVoisines.size();j++){
			CaseTerrain caseJ = casesVoisines.get(j);
			Planche plancheJ = caseJ.getCulture().getPlanche();
			if((caseJ.getSoltype() == SolType.CULTIVABLE)&&(!this.equals(plancheJ)&&(!planchesVoisines.contains(plancheJ)))){
				planchesVoisines.add(plancheJ);
			}
		}
		return planchesVoisines;
	}
	
	public int scoreCase(Plante plante, int x, int y){
		int score = 0;
		LinkedList<Planche> voisins = this.planchesVoisines();
		for (Planche planche : voisins) {
			//TODO
		}
		return score;
	}

}
