package model;

public class ProductoFresco extends Producto {
	private String fechaEnvasado, paisOrigen;
	
	public ProductoFresco(String pfechaCaducidad, int pnumLote, String pfechaEnvasado, String ppaisOrigen) {
		super(pfechaCaducidad, pnumLote);
		fechaEnvasado = pfechaEnvasado;
		paisOrigen = ppaisOrigen;
	}

	@Override
	public String toString() {
		return super.toString() + 
				"\nFecha de envasado: " + fechaEnvasado + 
				"\nPais de origen: " + paisOrigen; 
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
	
	
}
