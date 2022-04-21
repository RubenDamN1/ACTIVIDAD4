/* Clase operacionesMatematicas
 * Autor: Ruben Alvarez
 * Fecha:20/04/2022
 * Descripci�n: clase para las operaciones aritm�ticas b�sicas
 * Modificaci�n 1: Comentarios. Misma fecha
 */
import java.util.Scanner; // importo la clase scanner para leer datos

public class operacionesMatematicas {

	public static void main(String[] args) {
			// Declaro variables para recibir los n�meros
			int numero1, numero2;
			// Declaro variables para recibir los resultados
			int suma, resta, producto, divisionE;
			// Creo un objeto Scanner
			Scanner leer = new Scanner(System.in);
			// Leo por teclado ambos n�meros
			System.out.println("Por favor, introduce el primer n�mero");
			numero1 = leer.nextInt();
			System.out.println("Por favor, introduce el segundo n�mero");
			numero2 = leer.nextInt();
			// Hago las operaciones
			suma = numero1 + numero2;
			resta = numero1 - numero2;
			producto = numero1 * numero2;
			divisionE = numero1 / numero2;
			// Muestro los resultados
			System.out.println("La suma de los dos numeros es: " + suma);
			System.out.println("La resta de los dos numeros es: " + resta);
			System.out.println("El producto de los dos numeros es: " + producto);
			System.out.println("La division entera de los dos numeros es: " + divisionE);
	}
}
