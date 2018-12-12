package EjercicioPersona;

public class Persona2 {

	
	
	//ATRIBUTOS
	private String Nombre;
	private int Edad;
	private String DNI;
	private double Peso;
	private double Altura;
	private char Sexo;
	
	
	
	//Variables para los datos del peso
	
	public static final int INFRAPESO = -1;
	public static final int PESO_IDEAL = 0;
	public static final int SOBREPESO = 1;
	
	
	
	
	
	
	//Constructor vacio
	public Persona2 () {
		
	}
	
	//Constructor con todos los atributos como parametro
	public Persona2 (String Nombre,int Edad,String DNI,char Sexo,double Peso,double Altura) {
		this.Nombre = Nombre;
		this.Edad = Edad;
		this.DNI = DNI;
		this.Peso = Peso;
		this.Altura = Altura;
		this.Sexo = Sexo;
	}
	
	
	
	// Getters And Setters
	
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public int getEdad() {
		return Edad;
	}
	public void setEdad(int edad) {
		Edad = edad;
	}
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	public double getPeso() {
		return Peso;
	}
	public void setPeso(double peso) {
		Peso = peso;
	}
	public double getAltura() {
		return Altura;
	}
	public void setAltura(double altura) {
		Altura = altura;
	}
	public char getSexo() {
		return Sexo;
	}
	public void setSexo(char sexo) {
		this.Sexo = sexo;
	}
	
	
	//Metodos
	public int calcularIMC(Persona2 p) {
		double PesoActual = Peso /( Altura*Altura);
			if (PesoActual >=20 && PesoActual <=25) {
				return 0;
			}else if(PesoActual < 20){
				return INFRAPESO;
			}else {
				return SOBREPESO;
			}
		}
		
	
	//metodo para comprobar si la persona es mayor de edad
			public static boolean esMayorDeEdad(Persona2 p) {
				
				boolean mayor;
				
				if(p.getEdad() > 18) {
					mayor = true;
				}else {
					mayor = false;
				}
				
				return mayor;
	
	}
			@Override
			public String toString() {
		        String Sexo;
		        if (this.Sexo == 'H' ) {
		            Sexo = "hombre";
		        } else {
		            Sexo = "mujer";
		        }
		        return "Informacion de la persona:\n"
		                + "Nombre: " + Nombre + "\n"
		                + "Sexo: " + Sexo + "\n"
		                + "Edad: " + Edad + " años\n"
		                + "DNI: " + DNI + "\n"
		                + "Peso: " + Peso + " kg\n"
		                + "Altura: " + Altura + " metros\n";

			}
	
}

