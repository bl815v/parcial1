package model;

public abstract class Producto {
	private String fechaCaducidad;
	private int numLote;
	
	public Producto(String pfechaCaducidad, int pnumLote) {
		fechaCaducidad = pfechaCaducidad;
		numLote = pnumLote;
	}

	@Override
	public String toString() {
		return "\nFecha de caducidad: " + fechaCaducidad + 
				"\nNumero de lote: " + numLote;
	}

	public String getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setFechaCaducidad(String fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

	public int getNumLote() {
		return numLote;
	}

	public void setNumLote(int numLote) {
		this.numLote = numLote;
	}
	
	
	
}
