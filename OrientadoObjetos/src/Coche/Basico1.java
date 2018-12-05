package Coche;

import java.util.ArrayList;
import java.util.Scanner;

import Constructor.Coche;

public class Basico1 {

	//Creamos un ArrayList para guardar objetos de tipo coche
	
	static ArrayList<OO_Coches> coches = new ArrayList();

	static Scanner sc = new Scanner(System.in);
	
	
	
	//Metodo Main
	public static void main(String[] args) {
		leerCoches();
		System.out.println("\nCoches introducidos:");
		
		mostrarCoches();
		mostrarPorMarca();
		mostrarPorKm();
		System.out.println("\nCoche con mayor numero de km:" +mostrarMayorKm());
		System.out.println("\nCoches ordenados de menor a mayor numero de km");
		mostrarOrdenadosPorKm();
		
	}//Fin metodo main
	
	//Metodos
	
	//Método para mostrar todos los coches  
			private static void mostrarCoches() {
				for(int i = 0; i< coches.size(); i++)
		            System.out.println(coches.get(i));  //se invoca el método toString de la clase Coche
		    }
		
	//Método para mostrar todos los coches de una marca que se pide por teclado
			public static void mostrarPorMarca(){
		        String marca;
		        System.out.print("Introduce marca de los coches a listar: ");
		        marca = sc.nextLine();
		        System.out.println("Coches de la marca " + marca);
		        for(int i = 0; i<coches.size(); i++){
		            if(coches.get(i).getMarca().equalsIgnoreCase(marca))
		                System.out.println(coches.get(i));
		        }
		    }

			
			
			 //Método para mostrar todos los coches con un número de Km inferior
		    //al número de Km que se pide por teclado
		    public static void mostrarPorKm(){
		        int Km;
		        System.out.print("Introduce número de kilómetros: ");
		        Km = sc.nextInt();
		        System.out.println("Coches con menos de " + Km + " Km");
		        for(int i = 0; i<coches.size(); i++){
		            if(coches.get(i).getKm() < Km)
		                System.out.println(coches.get(i));
		        }
		    }
			
			
		    //Método que devuelve el Coche con mayor número de Km
		    public static OO_Coches mostrarMayorKm(){
		        OO_Coches mayor = coches.get(0);
		        for(int i = 0; i < coches.size(); i++){
		            if(coches.get(i).getKm() > mayor.getKm())
		                mayor = coches.get(i);
		        }
		        return mayor;
		    }
			
			
		  //Método que muestra los coches ordenados por número de Km de menor a mayor
		    public static void mostrarOrdenadosPorKm(){
		        int i, j;
		        OO_Coches aux;
		        for(i = 0; i< coches.size()-1; i++)
		            for(j=0;j<coches.size()-i-1; j++)
		                if(coches.get(j+1).getKm() < coches.get(j).getKm()){
		                    aux = coches.get(j+1);
		                    coches.set(j+1, coches.get(j));
		                    coches.set(j, aux);                
		                }
		        mostrarCoches();
		    }
		
			
			
			
			
			
			
			
	//Metodo para leer coches introducidos por array
	public static void leerCoches() {
		
		//Declaramos las variables para leer los datos de coche
		String Matricula;
		String Marca;
		String Modelo;
		int Km;
		
		//Variable auxiliar que contendra la referencia de cada coche nuevo
		OO_Coches aux;
		int i, N;
		
		//Se pide por teclado el numero de coches a leer
		do {
			System.out.println("Numero de coches?");
			N = sc.nextInt();
		}while (N < 0);
		sc.nextLine(); //Para limpiar el intro
		
		//Lectura de N coches
		for (i=1; i<=N; i++) {
			//leemos datos de cada coche
			System.out.println("Coche " +i);
			System.out.println("Matricula: ");
			Matricula = sc.nextLine();
			System.out.println("Marca: ");
			Marca = sc.nextLine();
			System.out.println("Modelo: ");
			Modelo = sc.nextLine();
			System.out.println("Numero de Kilometros: ");
			Km = sc.nextInt();
			sc.nextLine();//Limpiar intro
			aux = new OO_Coches();
			//Se asignan valores a los atributos del nuevo objeto
			aux.setMatricula(Matricula);
			aux.setMarca(Marca);
			aux.setModelo(Modelo);
            aux.setKm(Km);
            
          //se añade el objeto al final del array
            coches.add(aux);
            
            
            
            
            
		}
		
		
		
	}
	
}//Fin metodo coches
