//Elaborar um programa que apresente no final o somatório dos valores pares existentes na faixa de
//1 até 500.


package EstruturaDoWhile_pag50;
import java.util.*;

public class L04B {
	public static void main (String []args) {
		
		int num = 1;
		int cont = 0;
		Scanner sc = new Scanner (System.in);
		
		do {
			if (num%2==0) {
			 System.out.println(num);
			}
			
			cont += num;
			num++;	
			
			
		}while (num <= 500);
		
		System.out.println(cont);	
	}
}
