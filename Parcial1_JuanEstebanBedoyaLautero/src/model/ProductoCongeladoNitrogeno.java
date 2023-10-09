package model;

public class ProductoCongeladoNitrogeno extends ProductoCongelado {
	String metodoCongelacion;
	double tiempoExpo;
	
	public ProductoCongeladoNitrogeno(String pfechaCaducidad, int pnumLote, String pfechaEnvasado, String ppaisOrigen, double ptemperaturaMantenRecomend, String pmetodoCongelacion, double ptiempoExpo) {
		super(pfechaCaducidad, pnumLote, pfechaEnvasado, ppaisOrigen, ptemperaturaMantenRecomend);
		metodoCongelacion = pmetodoCongelacion;
		tiempoExpo = ptiempoExpo;
	}
	
	@Override
	public String toString() {
		return super.toString() + 
				"\nMetodo de congelacion empleado: " + metodoCongelacion +
				"\nTiempo de exposicion al Nitrogeno (segundos): " + tiempoExpo; 
	}

	public String getMetodoCongelacion() {
		return metodoCongelacion;
	}

	public void setMetodoCongelacion(String metodoCongelacion) {
		this.metodoCongelacion = metodoCongelacion;
	}

	public double getTiempoExpo() {
		return tiempoExpo;
	}

	public void setTiempoExpo(double tiempoExpo) {
		this.tiempoExpo = tiempoExpo;
	}
	

}
