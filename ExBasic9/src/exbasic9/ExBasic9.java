package exbasic9;

import java.util.Scanner;

public class ExBasic9 {

	public static void main(String[] args) {
		
		//Creo el escáner
		Scanner sc= new Scanner (System.in); 
		
		//Declaro las variables
		final double euros;
		double pesetas;
		
		//Pedimos los datos
		System.out.print("Introduzca una cantidad de pesetas y pulse Intro: ");
		pesetas=sc.nextDouble();
		
		//Cálculos
		euros=pesetas*0.0060;
		
		//Devolvemos el resultado
		System.out.println();
		System.out.print("Euros: "+euros);
		
		//Cerramos el escáner
		sc.close();
		
	}

}
