package lista1;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner (System.in);
		int x,y, contarNumerosImpares = 0, contarNumerosPares=0 ;
		
		System.out.println("entre com 10 valores");
		
		for (x=0; x<10; x++) {
			
			y = sc.nextInt();
		
			if (x%2==0) {
				
			contarNumerosPares = contarNumerosPares + 1;
			
			}
			else {
				
		contarNumerosImpares = contarNumerosImpares + 1;
		
			}
		}
			System.out.println("total de pares:   "  + contarNumerosPares);
		System.out.println("total de impares:  "  + contarNumerosImpares);
		
		
		
		sc.close();
		
	}

	}
