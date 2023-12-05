package examenEntornos;
import java.util.Scanner;
public class ejercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double resultado=0;
		int opcion;
		System.out.println("Menú de opciones:");
		System.out.println("1. Área triángulo");
		System.out.println("2. Área círculo");
		System.out.println("3. Área del cono");
		System.out.print("Seleccione una opción: ");


		opcion = sc.nextInt();

		switch (opcion) {
		case 1:
			System.out.print("Ingrese la base del triángulo: ");
			double baseTriangulo = sc.nextDouble();
			System.out.print("Ingrese la altura del triángulo: ");
			double alturaTriangulo = sc.nextDouble();
			resultado = 0.5 * baseTriangulo * alturaTriangulo;
		break;
			case 2:
			System.out.print("Ingrese el radio del círculo: ");
			double radioCirculo = sc.nextDouble();
			resultado = Math.PI * Math.pow(radioCirculo, 2);
		break;
		case 3:
			
	
		break;

		default:
		System.out.println("Opción no válida. Inténtelo de nuevo.");
		}
		System.out.println(resultado);
		sc.close();
	}
}
