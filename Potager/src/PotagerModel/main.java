package PotagerModel;

import static org.junit.Assert.fail;

import java.util.LinkedList;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Jardin jardin = new Jardin(10,30);
			LinkedList<CaseTerrain> voisins = jardin.voisinsCase(0, 0);
			for(int i=0;i<voisins.size();i++){
				System.out.print(voisins.get(i).getX()+" ");
				System.out.println(voisins.get(i).getY());
			}
	}

}