import java.util.Scanner;

public class NumeroMayor {
	public static void main (String[]args) {
		/*
		 * Pedir 3 números al usuario y mostrar un mensaje con el
		 * número mayor
		 * */
		
		Scanner scanner = new Scanner(System.in);
		int numero1, numero2 ,numero3;
		
		System.out.println("Introduce el primero numero:");
		numero1 = scanner.nextInt();
		
		System.out.println("Introduce el segundo numero:");
		numero2 = scanner.nextInt();
		
		System.out.println("Introduce el tercer numero:");
		numero3 = scanner.nextInt();
		
		if(numero1 > numero2 ) {
			if(numero1 > numero3) {
				System.out.println("el  numero mayor es:" + numero1);
			} else {
				System.out.println("el numero mayor es:" + numero3);
			} 
			}else if (numero2 > numero3) {
				System.out.println("el  numero mayor es:" + numero2);
				} 
			if(numero1 == numero2){
				System.out.println("es un numero igual, por favor introduce numeros distintos");
			} else if(numero2 == numero3) {
				System.out.println("es un numero igual, por favor introduce numeros distintos");
			}
			else{
				System.out.println("el numero mayor es:" + numero3);
		}
	}
	
}
