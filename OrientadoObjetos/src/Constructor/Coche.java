package Constructor;

public class Coche {

	private String color;
	private String marca;
	private double km;
	
	
	
	public Coche (String m, String c, int i) {
		marca = m;
		color = c;
		km = i;
		
	}
		
	
	//Metodos
	
	public void AñadirKilometros(Double km_de_mas) {
		km = km + km_de_mas;
	}
	
	public double obtenerkm () {
		return km;
	}

	public String ObtenerColor () {
		return color;
	}
}
