import java.util.Scanner;

public class Anagrama {
	public static void main(String[] args){
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingresa tu primer palabra: ");
		String primeraPalabra = entrada.nextLine();

		System.out.println("Ingresa tu segunda palabra: ");
		String segundaPalabra = entrada.nextLine();
		
		for(int i = 0; i < primeraPalabra.length(); i++){
			for(int j = 0; j < segundaPalabra.length(); j++){
				if (primeraPalabra == segundaPalabra) {
					System.out.println("ola");					
				} else {
					System.out.println("adios");
				}  
			}	
		}
	}
}
