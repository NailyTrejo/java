import java.util.Scanner;

public class Triangulo {
 /*Pedirle 3 ángulos a un usuario y decirle si es un triangulo válido
 la suma de los angulos internos es 180° */
	public static void main(String[]args) {
		
		Scanner scanner = new Scanner (System.in);
		int lado1, lado2, lado3;
		System.out.println("Introduce el primer lado:");
		lado1 = scanner.nextInt();
		
		System.out.println("Introduce el segundo lado:");
		lado2 = scanner.nextInt();
		
		System.out.println("Introduce el tercer lado:");
		lado3 = scanner.nextInt();
		
		int suma = lado1 + lado2 + lado3;
		
		if(suma == 180) {
			System.out.println("Si es un triangulo y sus angulos suman 180°");
		} else {
			System.out.println("No es un triangulo, ya que sus angulos no suman 180°");
		}
	}
}
