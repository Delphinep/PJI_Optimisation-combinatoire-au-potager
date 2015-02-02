package PotagerModel;

import java.util.LinkedList;

/**Classe de représentation du jardin
 * Le jardin est inclus dans une zone rectangulaire de laquelle on définit les zones ne faisant pas parties du jardin
 */
public class Jardin {

	private CaseTerrain[][] terrain; 
	private LinkedList<String> plantations;

	public Jardin(int longueur,int largeur) {
		this.terrain = new CaseTerrain[longueur][largeur];
		for (int i=0; i<this.terrain.length; i++){
			for (int j=0; j<this.terrain[0].length; j++){
				this.terrain[i][j] = new CaseTerrain(this);
				this.terrain[i][j].setX(i);
				this.terrain[i][j].setY(j);
			}
		}
		this.setPlantations(new LinkedList<String>());
	}

	/**
	 * @return the plantations
	 */
	public LinkedList<String> getPlantations() {
		return plantations;
	}

	/**
	 * @param plantations the plantations to set
	 */
	public void setPlantations(LinkedList<String> plantations) {
		this.plantations = plantations;
	}

	/**
	 * @return the terrain
	 */
	public CaseTerrain[][] getTerrain() {
		return terrain;
	}

	/**
	 * @param terrain the terrain to set
	 */
	public void setTerrain(CaseTerrain[][] terrain) {
		this.terrain = terrain;
	}

	public LinkedList<CaseTerrain> voisinsCase(int x, int y){
		LinkedList<CaseTerrain> voisins = new LinkedList<CaseTerrain>();
		CaseTerrain caseTerrain;
		for (int i=x-1; i<=x+1; i++){
			for (int j=y-1; j<=y+1; j++){
				try {
					caseTerrain = this.terrain[i][j];
					if (i!=x || j!=y){
						voisins.add(caseTerrain);
					}
				}
				catch (Exception e){}
			}
		}
		return voisins;
	}
	
	public int scoreCase(Plante plante, int x, int y){
		int score = 0;
		LinkedList<CaseTerrain> voisins = this.voisinsCase(x,y);
		for (CaseTerrain caseTerrain : voisins) {
			Plante planteVoisines = caseTerrain.getCulture().getPlante();
			 score += plante.getAffinites().get(plante.getNom());
		}
		return score;
	}


}
