package Constructor;

public class Constructor3 {

	
		//Declaramos los atributos
		private String Nombre;
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


				
				/* 
				 * GETTERS AND SETETRS 
				 */
				
				public String getNombre() {
					return Nombre;
				}


				public void setNombre(String nombre) {
					Nombre = nombre;
				}


				public String getDni() {
					return Dni;
				}


				public void setDni(String dni) {
					Dni = dni;
				}


				public int getEdad() {
					return Edad;
				}


				public void setEdad(int edad) {
					Edad = edad;
				}


				public String getDescripcion() {
					return Descripcion;
				}


				public void setDescripcion(String descripcion) {
					Descripcion = descripcion;
				}
		
				
		
		}
