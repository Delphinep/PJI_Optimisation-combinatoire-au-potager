package PotagerModel;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

import java.io.File;
import java.util.LinkedList;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*	Jardin jardin = new Jardin(10,30);
			LinkedList<CaseTerrain> voisins = jardin.voisinsCase(0, 0);
			for(int i=0;i<voisins.size();i++){
				System.out.print(voisins.get(i).getX()+" ");
				System.out.println(voisins.get(i).getY());
			}
	}*/
	//	Jardin jardin = new Jardin(10,30);
		//LinkedList<CaseCultivable> casesPlanche1 = new LinkedList<CaseCultivable>();
	//	Plantation plantation = new Plantation(jardin);
		/*for(int i=0;i<5;i++){
			casesPlanche1.add(jardin.getTerrain()[i][0].getCulture());
		}
		Planche planche1 = new Planche();
		planche1.setPlantation(plantation);
		planche1.setCases(casesPlanche1);
		LinkedList<Planche> voisinesPlanche1 = planche1.planchesVoisines();
		System.out.println(voisinesPlanche1.getFirst());*/
	/*	plantation.algoGlouton();
		
	}*/

		 
		 
		   try {
		 
			File fXmlFile = new File("plante2.xml");
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(fXmlFile);
		 
			//optional, but recommended
			//read this - <a href="http://stackoverflow.com/questions/13786607/normalization-in-dom-parsing-with-java-how-does-it-work" target="_blank">http://stackoverflow.com/questions/1...w-does-it-work</a>
			doc.getDocumentElement().normalize();
		 
			System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
		 
			NodeList nList = doc.getElementsByTagName("node");
			NodeList nList2 = doc.getElementsByTagName("edge");
		 
			System.out.println("----------------------------");
		 
			for (int temp = 0; temp < nList.getLength(); temp++) {
		 
				Node nNode = nList.item(temp);
		 
				System.out.println("\n L'element courant :" + nNode.getNodeName());
		 
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
		 
					Element eElement = (Element) nNode;
		 
					System.out.println(" id : " + eElement.getAttribute("id"));
					//System.out.println("First Name : " + eElement.getElementsByTagName("node").item(0).getTextContent());
					System.out.println("couleur : " + eElement.getElementsByTagName("data").item(0).getTextContent());
					//System.out.println("Nick Name : " + eElement.getElementsByTagName("edge").item(0).getTextContent());
					//System.out.println("Salary : " + eElement.getElementsByTagName("salary").item(0).getTextContent());
		 
				}
			}
		 
		 
			for (int temp = 0; temp < nList2.getLength(); temp++) {
		 
				Node nNode2 = nList2.item(temp);
		 
				System.out.println("\nL'element courant :" + nNode2.getNodeName());
		 
				if (nNode2.getNodeType() == Node.ELEMENT_NODE) {
		 
					Element eElement = (Element) nNode2;
		 
					System.out.println("id : " + eElement.getAttribute("id")+"\t source :"+eElement.getAttribute("source")+"\tDestination :"+eElement.getAttribute("target"));
		 
		                        System.out.println("valeur : " + eElement.getElementsByTagName("data").item(0).getTextContent());
		 
				}
			}
		    } catch (Exception e) {
			e.printStackTrace();
		    }
}
}
