import java.util.Scanner;

public class EstructudaDeControlIf {
	public static void main (String []args) {
	//Estructuras de control de flujo 
	//Nos sirve para la toma de decisiones 
	
	//Estructuras de control de flujo nos sirven para cambiar el flujo de nuestro programa
	//evaluando una condici�n y apartir de la evaluaci�n se realiza una acci�n u otra.
	
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
