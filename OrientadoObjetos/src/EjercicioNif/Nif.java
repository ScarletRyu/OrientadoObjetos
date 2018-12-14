package EjercicioNif;

import java.util.Scanner;

public class Nif {

	//Atributos
	
	private int DNI;
	private char Letra;
	
	
	//Constructor por defecto
	public Nif() {
		
	}

	//Constructor Nif
	public Nif(int DNI) {
        this.DNI = DNI;
        Letra = calcularLetra();
    }

	//Devolver
	
    public String toString() {
        
        return "DNI de la persona: " +DNI+ "-"+ Letra;
    }
	
	
	//Metodo para calcular letra del Nif
	private char calcularLetra() {
		char[] letras = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
	return letras[DNI%23];
	}
	
	// Metodo leer, pide por teclado el número de DNI y calcula a partir del DNI introducido la letra que le corresponde.
	public void Leer() {
		Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Introduce el dni: ");
            DNI = sc.nextInt();
        } while (DNI <= 0);
        Letra = calcularLetra();
    }
		
	
	
	
	
	//Getters & Setters
	public int getDNI() {
		return DNI;
	}


	public void setDNI(int dNI) {
		DNI = dNI;
	}


	public int getLetra() {
		return Letra;
	}


	public void setLetra(char letra) {
		Letra = letra;
	}
	
	
	
}
