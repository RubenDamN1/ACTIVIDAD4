import java.util.Scanner;

public class operacionesMatematicas {

	public static void main(String[] args) {

			int numero1, numero2;
			int suma, resta, producto, divisionE;
			Scanner leer = new Scanner(System.in);

			System.out.println("Por favor, introduce el primer número");
			numero1 = leer.nextInt();
			System.out.println("Por favor, introduce el segundo número");
			numero2 = leer.nextInt();

			suma = numero1 + numero2;
			resta = numero1 - numero2;
			producto = numero1 * numero2;
			divisionE = numero1 / numero2;
				
			System.out.println("La suma de los dos numeros es: " + suma);
			System.out.println("La resta de los dos numeros es: " + resta);
			System.out.println("El producto de los dos numeros es: " + producto);
			System.out.println("La division entera de los dos numeros es: " + divisionE);
	}
}
