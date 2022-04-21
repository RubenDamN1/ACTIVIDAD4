/* Clase operacionesMatematicas
 * Autor: Ruben Alvarez
 * Fecha:20/04/2022
 * Descripción: clase para las operaciones aritméticas básicas
 * Modificación 1: Comentarios. Misma fecha
 */
import java.util.Scanner; // importo la clase scanner para leer datos

public class operacionesMatematicas {

	public static void main(String[] args) {
			// Declaro variables para recibir los números
			int numero1, numero2;
			// Declaro variables para recibir los resultados
			int suma, resta, producto, divisionE;
			// Creo un objeto Scanner
			Scanner leer = new Scanner(System.in);
			// Leo por teclado ambos números
			System.out.println("Por favor, introduce el primer número");
			numero1 = leer.nextInt();
			System.out.println("Por favor, introduce el segundo número");
			numero2 = leer.nextInt();
			// Hago las operaciones
			
			// Suma después de refactorizar
			suma = sumaNumeros(numero1, numero2);
			
			// Resta después de refactorizar
			resta = restaNumeros(numero1, numero2);
			
			// Producto después de refactorizar
			producto = prodNumeros(numero1, numero2);
			
			// Division entera después de refactorizar
			divisionE = divisionEntera(numero1, numero2);
			
			// Muestro los resultados
			// Creo un metodo para visualizar los resultados
			visualizar(suma, resta, producto, divisionE);
	}

	private static void visualizar(int suma, int resta, int producto, int divisionE) {
		System.out.println("La suma de los dos numeros es: " + suma);
		System.out.println("La resta de los dos numeros es: " + resta);
		System.out.println("El producto de los dos numeros es: " + producto);
		System.out.println("La division entera de los dos numeros es: " + divisionE);
	}

	private static int divisionEntera(int numero1, int numero2) {
		int divisionE=0;
		//modifico esta parte para evitar division por cero
		if(numero2!=0)
			divisionE = numero1 / numero2;			
		return divisionE;
	}

	private static int prodNumeros(int numero1, int numero2) {
		int producto;
		producto = numero1 * numero2;
		return producto;
	}

	private static int restaNumeros(int numero1, int numero2) {
		int resta;
		resta = numero1 - numero2;
		return resta;
	}

	private static int sumaNumeros(int numero1, int numero2) {
		int suma;
		suma = numero1 + numero2;
		return suma;
	}
}
