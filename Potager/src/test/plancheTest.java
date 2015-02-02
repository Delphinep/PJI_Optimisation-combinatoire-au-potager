package test;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.Test;

import PotagerModel.CaseCultivable;
import PotagerModel.Jardin;
import PotagerModel.Planche;
import PotagerModel.Plantation;

public class plancheTest {

	@Test
	public void testPlanchesVoisines(){
		Jardin jardin = new Jardin(10,30);
		LinkedList<CaseCultivable> casesPlanche1 = new LinkedList<CaseCultivable>();
		Plantation plantation = new Plantation(jardin);
		for(int i=0;i<5;i++){
			casesPlanche1.add(jardin.getTerrain()[i][0].getCulture());
		}
		Planche planche1 = new Planche();
		planche1.setPlantation(plantation);
		planche1.setCases(casesPlanche1);
		LinkedList<Planche> voisinesPlanche1 = planche1.planchesVoisines();
		System.out.println(voisinesPlanche1.size());
		if(!(voisinesPlanche1.size()==0)){
			fail("Problème quand une seule planche");
		}
	}
	
	public void testPlanchesVoisinesCoin(){
		Jardin jardin = new Jardin(10,30);
		LinkedList<CaseCultivable> casesPlanche1 = new LinkedList<CaseCultivable>();
		Plantation plantation = new Plantation(jardin);
		
		Planche planche1 = new Planche();
		planche1.setPlantation(plantation);
		planche1.setCases(casesPlanche1);
		
		/*Planche planche2 = new Planche();
		planche2.setPlantation(plantation);
		planche2.setCases(cases);
		*/
		LinkedList<Planche> voisinesPlanche1 = planche1.planchesVoisines();
		System.out.println(voisinesPlanche1.size());
		if(!(voisinesPlanche1.size()==0)){
			fail("Problème quand une seule planche");
		}
	}

}
