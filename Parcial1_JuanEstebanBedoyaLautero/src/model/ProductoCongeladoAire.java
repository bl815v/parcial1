package model;

public class ProductoCongeladoAire extends ProductoCongelado {
	String ComposicionAirePercent;
	
	public ProductoCongeladoAire(String pfechaCaducidad, int pnumLote, String pfechaEnvasado, String ppaisOrigen, double ptemperaturaMantenRecomend, String pComposicionAirePercent) {
		super(pfechaCaducidad, pnumLote, pfechaEnvasado, ppaisOrigen, ptemperaturaMantenRecomend);
		ComposicionAirePercent = pComposicionAirePercent;
	}
	
	@Override
	public String toString() {
		return super.toString() + 
				"\nComposicion del aire (%nitrógeno, %oxigeno, %dioxido de carbono, %vapor de agua): " + ComposicionAirePercent; 
	}

	public String getComposicionAirePercent() {
		return ComposicionAirePercent;
	}

	public void setComposicionAirePercent(String composicionAirePercent) {
		ComposicionAirePercent = composicionAirePercent;
	}
	
	
	
}
