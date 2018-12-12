package EjercicioPersona;

import java.util.Scanner;



public class ProbarPersona2 {
	public static void main(String[] args) {
	//Pedir nombre,edad,sexo,peso,altura,dni
		
		String Nombre, DNI;
		char Sexo;
		int Edad;
		double Peso, Altura;
		
		Scanner scan = new Scanner(System.in);
	
		// Pedimos los datos de la persona
		
		System.out.println("Introduce el nombre");
		Nombre = scan.nextLine();
		System.out.println("Introduce la edad");
		Edad = scan.nextInt();
		System.out.println("Introduce el sexo");
		scan.nextLine();
		Sexo = scan.next().charAt(0);
		System.out.println("Introduce la altura");
		Altura = scan.nextDouble();
		System.out.println("Introduce el peso");
		Peso = scan.nextDouble();
		System.out.println("introduce el dni");
		scan.nextLine();
		DNI = scan.nextLine();
		// Fin pedir datos de la persona
		
		//Creamos una persona pasandole los parametros al crear la persona
		Persona2 p1 = new Persona2(Nombre, Edad, DNI, Sexo, Peso, Altura);
		
		//Creamos una persona y le damos los datos con el metodo set
		Persona2 p2 = new Persona2();
		p2.setNombre("Dios");
		p2.setEdad(23459943);
		p2.setSexo('h');
		p2.setAltura(3.90);
		p2.setPeso(1000000);
		p2.setDNI("666666666S");
	
		System.out.println("----- PERSONA 1-----");
		System.out.println(p1.toString());
		mostrarMensajePeso(p1);
		mostrarMayorDeEdad(p1);
		
		
		System.out.println("----- PERSONA 2-----");
		System.out.println(p2.toString());
		mostrarMensajePeso(p2);
		mostrarMayorDeEdad(p2);
		
		
	}
	//mostrar mensaje sobre estado fisico
		public static void mostrarMensajePeso(Persona2 p) {
			
			
			int imc = p.calcularIMC(p);
			switch (imc) {
			case Persona2.PESO_IDEAL:
				System.out.println("La persona esta en un peso ideal");
				break;
			case Persona2.INFRAPESO:
				System.out.println("La persona esta en delgadez");
				break;
			case Persona2.SOBREPESO:
				System.out.println("La persona sufre de sobrepeso");
				break;
			
			}
		}
		
		
		//mostrar mensaje sobre si es mayor de edad
		public static void mostrarMayorDeEdad(Persona2 p) {
			
			if(p.esMayorDeEdad(p)) {
				System.out.println("La persona es mayor de edad");
			}else {
				System.out.println("La persona no es mayor de edad");
			}
			
			
			
		}
	
	
	
		
		

}