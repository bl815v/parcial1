package model;

public class ProductoCongeladoAgua extends ProductoCongelado {
	double salinidadAgua;
	
	public ProductoCongeladoAgua(String pfechaCaducidad, int pnumLote, String pfechaEnvasado, String ppaisOrigen, double ptemperaturaMantenRecomend, double psalinidadAgua) {
		super(pfechaCaducidad, pnumLote, pfechaEnvasado, ppaisOrigen, ptemperaturaMantenRecomend);
		salinidadAgua = psalinidadAgua;
	}
	
	@Override
	public String toString() {
		return super.toString() + 
				"\nSalinidad del agua (gramos de sal / litro de agua): " + salinidadAgua; 
	}

	public double getSalinidadAgua() {
		return salinidadAgua;
	}

	public void setSalinidadAgua(double salinidadAgua) {
		this.salinidadAgua = salinidadAgua;
	}	
	
	
}
