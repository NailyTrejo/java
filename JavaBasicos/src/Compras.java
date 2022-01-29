import java.util.Scanner;

public class Compras {
	// si la cuenta es de menos de 1000
			// sila cuenta es de 1000 - 4999 10%
			// si la cuenta es de 5000 a 9999 20%
			// si la copra es de 10000 o más 30%

	public static void main(String[]args) {
	
		double descuento=0;
		double total=0;
		double compra=0;

		Scanner entrada= new Scanner(System.in);
		System.out.println("Introduzca el total de su compra");
		compra=entrada.nextDouble();
		
		System.out.println("El total de su compra es de: "+ compra);

		if( compra >= 10000){
		descuento= compra * 0.30;
		}else{
		if((compra>=5000) && ( compra <= 9999)){
		descuento = compra*0.20;
		}else{
		if((compra >= 1000) && (compra <= 4999)) {
		descuento = compra*0.10;
			}
		descuento=0;
		}
		System.out.println ("El descuento es de: " + descuento);
		total= compra - descuento;
		System.out.println ("El total de la compra es de : " + total);
		} }
		
	}

