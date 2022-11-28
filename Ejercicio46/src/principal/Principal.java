package principal;

import java.util.*;
public class Principal {
	public static void main(String [] args) {
		int num=0;
		Scanner sc=new Scanner (System.in);
	
			System.out.println("Ingrese un numero: ");
			num=sc.nextInt();
			
			if (num>10) {
				System.out.println("El numero es mayor que 10");
			}
			else if (num<10 || num==10) {
				System.out.println("El numero es menor o igual a 10");
			}
		
	
	
	
	
	}
}