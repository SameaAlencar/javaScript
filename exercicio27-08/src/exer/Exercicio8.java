package exer;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {

    
	Scanner leitor = new Scanner(System.in);
	
   String n;
   double vendas, tempo;
   
   System.out.println("Qual � o seu nome?");
   n = leitor.next();
   
   System.out.println("Qual � o seu n�mero de vendas?");
   vendas = leitor.nextDouble();
   
   System.out.println("Qual � o seu tempo de trabalho?");
   tempo = leitor.nextDouble();
   leitor.close();
   
   
   
   if (vendas < 20000 && vendas >10000 && tempo >=1 ) {
	   double por1 = vendas * 5/(100);
	   System.out.println( n + " a sua comiss�o ser� " + por1);
	   
   }else if (vendas >=20000 && tempo >= 1) {
      double por2 = vendas * 10/(100);
      System.out.println(n + " a sua comiss�o ser� " + por2);
    }else {
    	double por3 = vendas * 3/(100);
    	System.out.println(n+ " a sua comiss�o ser� " + por3);
    } 
   
   
    
	}

}
