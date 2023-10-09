package controller;

import model.*;
import view.VistaConsola;

public class Controller {
	VistaConsola vista;
	public Controller() {
		vista = new VistaConsola();
		funcionar();
	}
	
	private void funcionar() {
		vista.MostrarMensaje("Agroalimentos Arboleda: \n");
		ProductoFresco tomateArbol = new ProductoFresco("Febrero 9 de 2024", 2312815 , "Octubre 2 de 2023", "Colombia");
		ProductoCongeladoAire maizTierno = new ProductoCongeladoAire("Febrero 9 de 2024", 2312815 , "Octubre 2 de 2023", "Colombia", 3.5, "3%, %60, %7, %30");
		ProductoCongeladoAgua durazno = new ProductoCongeladoAgua("Febrero 9 de 2024", 2312815 , "Octubre 2 de 2023", "Colombia", 1.4, 23);
		ProductoCongeladoNitrogeno frijol = new ProductoCongeladoNitrogeno("Febrero 9 de 2024", 2312815 , "Octubre 2 de 2023", "Colombia", 4.2, "Clasico", 23);
		
		vista.MostrarMensaje(tomateArbol.toString());
		vista.MostrarMensaje("\n");
		vista.MostrarMensaje(maizTierno.toString());
		vista.MostrarMensaje("\n");
		vista.MostrarMensaje(durazno.toString());
		vista.MostrarMensaje("\n");
		vista.MostrarMensaje(frijol.toString());
		vista.MostrarMensaje("\n");
	}
}
