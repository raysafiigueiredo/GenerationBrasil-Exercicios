
/*
 * 
 * 
 * 
 */

package lista1;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		
		int x;
		
		for (x = 1000; x<=1999; x++) {
			if (x%11==5) {
				
				System.out.println(x);
			}
		}
		sc.close();
		

	}

}
