package Constructor;

public class Constructor3 {

	
		//Declaramos los atributos
		public String Nombre;
		private String Dni;
		private int Edad;
		private String Descripcion;

	

		//Creamos el Constructor
		public Constructor3 (String Nombre, int E) {
			
			Nombre = "Nombre";
			Edad = E;
			
		
		}
			
		
		//Metodos
		
		
				//Introducir DNI de la persona
				public  void IntroduceDni (String D) {
					Dni = D;
				}
				
				
				//Introducir Descripcion de la persona
				public void IntroduceDescripcion(String Desc) {
					Descripcion = Desc;
				}
				
				//Cambiar la edad por lo que introduce el usuario
				public void CambiarEdad (int num) {
					Edad = num;
				}
				
				//Introducir Datos de la persona
				public void DatosPersona() {
					System.out.println("El nombre de la persona es: " +Nombre);
					System.out.println("El Dni de la persona es : " +Dni);
					System.out.println("La Edad de la persona es: " +Edad);
					System.out.println("La Descripcion de la persona es: " +Descripcion);
					
					
				}
		
		
		
		}
