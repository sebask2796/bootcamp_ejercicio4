package ejercicio_if;
import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class Ejercicio_if {

    
    public static void main(String[] args) {
        
        Scanner escaner = new Scanner(System.in);
		// Mandar mensaje
		System.out.println("Escribe un numero:");
		// Leer lo que se introduce
		double numero = escaner.nextDouble();
		// Comparar
		if (numero == 0) {
			System.out.println("El numero es neutro");
		} else if (numero < 0) {
			System.out.println("El numero es negativo");
		} else {
			System.out.println("El numero es positivo");
		}
    }
    
}
