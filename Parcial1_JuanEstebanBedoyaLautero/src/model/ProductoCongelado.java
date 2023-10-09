package model;

public abstract class ProductoCongelado extends Producto {
	private String fechaEnvasado, paisOrigen;
	double temperaturaMantenRecomend;
	
	public ProductoCongelado(String pfechaCaducidad, int pnumLote, String pfechaEnvasado, String ppaisOrigen, double ptemperaturaMantenRecomend) {
		super(pfechaCaducidad, pnumLote);
		fechaEnvasado = pfechaEnvasado;
		paisOrigen = ppaisOrigen;
		temperaturaMantenRecomend = ptemperaturaMantenRecomend;
	}

	@Override
	public String toString() {
		return super.toString() + 
				"\nFecha de envasado: " + fechaEnvasado + 
				"\nPais de origen: " + paisOrigen +
				"\nTemperatura de mantenimiento recomendada: " + temperaturaMantenRecomend; 
	}

	public String getFechaEnvasado() {
		return fechaEnvasado;
	}

	public void setFechaEnvasado(String fechaEnvasado) {
		this.fechaEnvasado = fechaEnvasado;
	}

	public String getPaisOrigen() {
		return paisOrigen;
	}

	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}

	public double getTemperaturaMantenRecomend() {
		return temperaturaMantenRecomend;
	}

	public void setTemperaturaMantenRecomend(double temperaturaMantenRecomend) {
		this.temperaturaMantenRecomend = temperaturaMantenRecomend;
	}
	
	
	
}
