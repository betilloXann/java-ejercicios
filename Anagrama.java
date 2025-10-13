import java.util.Scanner;
import java.util.Arrays;

public class Anagrama {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa la primera palabra:");
        String primeraPalabra = entrada.nextLine();

        System.out.println("Ingresa la segunda palabra:");
        String segundaPalabra = entrada.nextLine();

        entrada.close();

        // Verificar si tienen la misma longitud
        if (primeraPalabra.length() != segundaPalabra.length()) {
            System.out.println("No son anagramas: diferente longitud.");
            return;
        }

        //Dos palabras exactamente iguales
        if (primeraPalabra.equals(segundaPalabra)) {
            System.out.println("Son iguales");
            return;
        }

        // Convertir a arreglos de caracteres
        char[] letras1 = primeraPalabra.toLowerCase().toCharArray();
        char[] letras2 = segundaPalabra.toLowerCase().toCharArray();


        // Ordenar los arreglos
        Arrays.sort(letras1);
        Arrays.sort(letras2);

        // Comparar letra por letra usando un for
        boolean sonAnagramas = true;
        for (int i = 0; i < letras1.length; i++) {
            if (letras1[i] != letras2[i]) {
                sonAnagramas = false;
                break;
            }
        }

        // Mostrar resultado
        if (sonAnagramas) {
            System.out.println("Si son");
        } else {
            System.out.println("No son");
        }
    }
}
