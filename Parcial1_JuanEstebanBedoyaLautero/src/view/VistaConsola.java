package view;

import java.util.Scanner;

public class VistaConsola {
	private Scanner leer;
	
	public VistaConsola() {
		leer = new Scanner(System.in);
	}
	
	public String leerMensaje(String mensaje) {
		System.out.println(mensaje);
		String dato = leer.nextLine();
		return dato;
	}
	
	public void MostrarMensaje(String mensaje) {
		System.out.println(mensaje);
	}
	
	
}
