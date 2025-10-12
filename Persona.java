public class Persona {
	private String nombre;
	private int edad;
	
	public Persona(String nombre, int edad){
		this.nombre = nombre;
		this.edad = edad;
	}
	public void saludar(){
		System.out.println("Hola, soy " + nombre + "y tengo " + edad);
	}
	public static void main(String[] args){
	Persona p1 = new Persona("Juan", 55);
	p1.saludar();
	}
}
