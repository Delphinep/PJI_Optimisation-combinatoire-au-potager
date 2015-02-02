package PotagerModel;

import java.util.LinkedList;

/**
 * Classe de représentation d'une case cultivable, c'est à dire où l'utilisateur pourra soit fixer une plante de son choix,
 * soitb demander au systême d'y proposer une plante
 */
public class CaseCultivable {

	private Plante plante; /*la plante présente dans la case*/
	private PlanteFixe fixe; /*donne le droit de modifier ou non la plante de la case*/ 
	private Planche planche; /*la planche à laquelle appartient la case*/
	private CaseTerrain caseTerrain;

	/**
	 * @return the plante
	 */
	public Plante getPlante() {
		return plante;
	}
	
	public CaseTerrain getCaseTerrain(){
		return caseTerrain;
	}

	/**
	 * @param plante the plante to set
	 */
	public void setPlante(Plante plante) {
		this.plante = plante;
		this.fixe = PlanteFixe.VARIABLE;
	}

	/**
	 * @return the fixe
	 */
	public PlanteFixe getFixe() {
		return fixe;
	}

	/**
	 * @param fixe the fixe to set
	 */
	public void setFixe(PlanteFixe fixe) {
		this.fixe = fixe;
	}

	/**
	 * @return the planche
	 */
	public Planche getPlanche() {
		return planche;
	}

	/**
	 * @param planche the planche to set
	 */
	public void setPlanche(Planche planche) {
		this.planche = planche;
	}

	
	public CaseCultivable() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Classe interne définissant le caractère "fixe" de la plante 
	 * c'est à dire si le système peu ou non y mettre une plante de son choix
	 */
	private enum PlanteFixe{
		FIXE, VARIABLE
	}
	
	/* Pas utilis� */
	public LinkedList<CaseCultivable> voisines(){
		LinkedList<CaseCultivable> voisinesCultivables = new LinkedList<CaseCultivable>();
		LinkedList<CaseTerrain> voisinesTerrain = this.planche.getPlantation().getJardin().voisinsCase(this.caseTerrain.getX(), this.caseTerrain.getY());
		for (CaseTerrain caseterrain : voisinesTerrain){
			if (caseterrain.getCulture().getPlanche() != this.planche){
				voisinesCultivables.add(caseterrain.getCulture());
			}
		}
		return voisinesCultivables;
	}

}
