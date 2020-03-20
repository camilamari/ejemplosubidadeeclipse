package main.java.presentacion;

import main.java.dominio.estudiante;
import main.java.dominio.persona;

public class principal {

	public static void main(String[] args) {

		persona p1 = new persona("Camila", "Zapata", 18);
		System.out.println(p1.toString());
		
		persona p2 = new estudiante("Kevim", "Chacon", 26, 3000);
		
	}

}
