package test;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.Test;

import PotagerModel.CaseCultivable;
import PotagerModel.Jardin;
import PotagerModel.Planche;

public class plancheTest {

	@Test
	public void testPlanchesVoisines(){
		Jardin jardin = new Jardin(10,30);
		LinkedList<CaseCultivable> casesPlanche1 = new LinkedList<CaseCultivable>();
		for(int i=0;i<5;i++){
			casesPlanche1.add(jardin.getTerrain()[i][0].getCulture());
		}
		Planche planche1 = new Planche();
		planche1.setCases(casesPlanche1);
		LinkedList<Planche> voisinesPlanche1 = planche1.planchesVoisines();
		if(!(voisinesPlanche1.size()==0)){
			fail("Probl�me quand une seule planche");
		}
	}

}
