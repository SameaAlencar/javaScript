import java.util.Scanner;

public class Exerc?cio {

	public static void main(String[] args) {
		
		int a;
		int b;
		int c;
		Scanner leitor = new Scanner (System.in);
		
		System.out.println("Primeiro valor: ");
		a = leitor.nextInt();
		
		System.out.println("Segundo valor: ");
		b= leitor.nextInt();
		
		System.out.println("Terceiro valor: ");
		c = leitor.nextInt();
		
	
		leitor.close();
		if ( a> b) {
			
			if (a> c) {
				
				System.out.println("Maior valor ?" + a);
			}else {
				System.out.println("Maior valor ? " + c);
			}
			
		}else {
			
			if (b>c) {
				System.out.println("Maior valor:" + b);
			
			}else {
				System.out.println(" Maior valor: " + c);
			}
		}
		
		
		
		 
		 
		
		
		
		
		
		
		
		
		
	

	}

}
