import java.util.Scanner;

public class EstructudaDeControlIf {
	public static void main (String []args) {
	//Estructuras de control de flujo 
	//Nos sirve para la toma de decisiones 
	
	//Estructuras de control de flujo nos sirven para cambiar el flujo de nuestro programa
	//evaluando una condición y apartir de la evaluación se realiza una acción u otra.
	
	/*
	 if(codicion) {
	codigo
	} else {
		codigo
		} 
		*/
	System.out.println("Introduce tu edad:");
	Scanner scanner = new Scanner(System.in);
	int edad = scanner.nextInt();
	
	if(edad > 18 ) {
		System.out.println("Eres mayor de edad");
	} else {
		System.out.println("Eres menor de edad");
	}
	
	
}


}
