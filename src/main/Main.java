package main;



import java.util.ArrayList;

import util.Employe;
import util.FormGeo;
import util.Person;
import util.Rectangle;
import util.Triangle;

public class Main {

	public static void main(String[] args) {
		//declaration array
		Rectangle[] arrayRect = new Rectangle[5];
		ArrayList<FormGeo> listForms = new ArrayList<>();
		
		listForms.add(new Rectangle());
		listForms.add(new Triangle());
		double sumSurfaces = 0;
		
		for (int i = 0; i < listForms.size(); i++) {
			sumSurfaces += listForms.get(i).calculSurface();
		}
		
		for (FormGeo formGeo : listForms) {
			sumSurfaces += formGeo.calculSurface();
		}
		
	}
}
