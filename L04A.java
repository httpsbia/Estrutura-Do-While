package EstruturaDoWhile_pag50;
import java.util.*;

public class L04A {
	public static void main (String []args) {
		Scanner sc = new Scanner (System.in);
		int n = 15;
		do {
			System.out.println("O número é: " + n);
			System.out.println("O quadrado desse número é: " + (n*n));
			n++;
			
		}while (n <= 200);
	}
	
}
