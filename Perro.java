public class Perro {
    private String nombre;
    private int edad;

    public Perro(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void ladrar() {
        System.out.println("Hola, soy " + nombre + " y tengo " + edad + " años.");
	System.out.println("Vamos a comer");
    }

    public static void main(String[] args) {
        Perro p1 = new Perro("Pedrito", 5);
        p1.ladrar();
    }
}

