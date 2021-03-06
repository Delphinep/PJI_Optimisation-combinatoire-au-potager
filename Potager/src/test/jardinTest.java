package test;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.Test;

import PotagerModel.CaseTerrain;
import PotagerModel.Jardin;

public class jardinTest {

	@Test
	public void testVoisinsCasesCoin() {
		Jardin jardin = new Jardin(10,30);
		LinkedList<CaseTerrain> voisins = jardin.voisinsCase(0, 0);
		LinkedList<CaseTerrain> resultatAttendu = new LinkedList<CaseTerrain>();
		resultatAttendu.add(jardin.getTerrain()[1][1]);
		resultatAttendu.add(jardin.getTerrain()[0][1]);
		resultatAttendu.add(jardin.getTerrain()[1][0]);
		if(!voisins.containsAll(resultatAttendu)){
			fail("La m�thode ne retrouve pas tous les voisins dans le coin");
		}
		if(voisins.size()!=resultatAttendu.size()){
			fail("La m�thode trouve trop de voisins dans le coin");
		}
	}
	
	@Test
	public void testVoisinsCasesCentre(){
		Jardin jardin = new Jardin(15,30);
		LinkedList<CaseTerrain> voisins = jardin.voisinsCase(10, 23);
		LinkedList<CaseTerrain> resultatAttendu = new LinkedList<CaseTerrain>();
		resultatAttendu.add(jardin.getTerrain()[9][23]);
		resultatAttendu.add(jardin.getTerrain()[11][23]);
		resultatAttendu.add(jardin.getTerrain()[9][22]);
		resultatAttendu.add(jardin.getTerrain()[11][22]);
		resultatAttendu.add(jardin.getTerrain()[9][24]);
		resultatAttendu.add(jardin.getTerrain()[11][24]);
		resultatAttendu.add(jardin.getTerrain()[10][22]);
		resultatAttendu.add(jardin.getTerrain()[10][24]);
		if(!voisins.containsAll(resultatAttendu)){
			fail("La m�thode ne retrouve pas tous les voisins au centre");

		}
		if(voisins.size()!=resultatAttendu.size()){
			fail("La m�thode trouve trop de voisins au centre");
		}
	}

}
