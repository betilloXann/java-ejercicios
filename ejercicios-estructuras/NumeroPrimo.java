//Todos los numeros primos entra 1 y 100
public class NumeroPrimo{
    public static void main(String[] args) {
        
        for(int numero = 2; numero <= 100; numero++){ //numero es el numero que vamos a verificar
            boolean esPrimo = true; 

            for(int i = 2; i < Math.sqrt(numero); i++){
                if( numero  % i == 0){
                    esPrimo = false;
                    break;
                }
            }
        if (esPrimo) {
            System.out.println(numero);
            }
        }
    }
}
