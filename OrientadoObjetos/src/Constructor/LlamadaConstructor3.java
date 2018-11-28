package Constructor;


public class LlamadaConstructor3 {

	public static void main(String[] args) {
		// Llamada a la clase Constructor3

		Constructor3 c3 = new Constructor3 ("Nombre", 22);
		
		//Llamamos directamente a traves del constructor a los metodos e introducimos los datos que queramos
		c3.setNombre("Joni");
		c3.IntroduceDni("72574572h");
		c3.IntroduceDescripcion("desc1");
		c3.setEdad(10);
		c3.DatosPersona();
		
		
		//Llamada a los GETTERS Y SETTERS
		c3.setNombre("Axer");
		c3.setDni("666777888l");
		c3.setDescripcion("desc2");
		c3.setEdad(2);
		c3.DatosPersona();
		
	} 

}
