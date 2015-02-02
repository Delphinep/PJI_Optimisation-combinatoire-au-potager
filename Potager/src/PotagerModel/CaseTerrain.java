package PotagerModel;

import java.util.LinkedList;

/**
 * Classe de représentation d'une partie du jardin
 */
public class CaseTerrain {

	public SolType soltype; /*le type du sol parmi les choix de l'enum*/
	public float humidite; /*une des caractéristiques possibles du sol*/
	private int x;
	private int y;
	private CaseCultivable culture;
	private Jardin jardin;
	
	public CaseTerrain(Jardin jardin) {
		this.jardin = jardin;
		this.soltype = SolType.CULTIVABLE;
		this.culture = new CaseCultivable(this);
	}	

	/**
	 * @return the soltype
	 */
	public SolType getSoltype() {
		return soltype;
	}

	public Jardin getJardin(){
		return this.jardin;
	}

	/**
	 * @param soltype the soltype to set
	 */
	public void setSoltype(SolType soltype) {
		this.soltype = soltype;
	}



	/**
	 * @return the humidite
	 */
	public float getHumidite() {
		return humidite;
	}



	/**
	 * @param humidite the humidite to set
	 */
	public void setHumidite(float humidite) {
		this.humidite = humidite;
	}

	/**
	 * @return the x
	 */
	public int getX() {
		return x;
	}
	
	public void setX(int x){
		this.x=x;
	}

	/**
	 * @return the y
	 */
	public int getY() {
		return y;
	}

	public void setY(int y){
		this.y=y;
	}
	/**
	 * @return the culture
	 */
	public CaseCultivable getCulture() {
		return culture;
	}


}
