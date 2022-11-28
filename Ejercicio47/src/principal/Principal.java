package principal;
import java.util.*;
public class Principal {
	public static void main(String [] args){
		int num=0;
		Scanner sc=new Scanner(System.in);
		
		String[] dias = {
			"",
			"Lunes",
			"Martes",
			"Miercoles",
			"Jueves",
			"Viernes",
			"Sabado",
			"Domingo",
		};
		
		System.out.println("Ingrese un numero entre 1 y 7: ");
			num=sc.nextInt();
			if (num>0 && num<8) {
				
				System.out.println(dias[num]);
			
			}
			else System.out.println("Este no es un numero entre 1 y 7");
		
		
	}
	

}
