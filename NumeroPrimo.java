import java.util.Scanner;

public class NumeroPrimo{
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        boolean esPrimo = true;

        System.out.println("Ingresa un numero");
        int numeroIngresado = numero.nextInt();

        numero.close();
        for(int i = 2; i < numeroIngresado; i++){
            if(numeroIngresado % i == 0){
                esPrimo = false;
                break;
       }
    }
    if (esPrimo && numeroIngresado > 1) {
        System.out.println("Es primo");
    } else {
        System.out.println("No lo es");
    }
  }
}
