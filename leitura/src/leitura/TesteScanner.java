package leitura;

import java.util.Scanner;

public class TesteScanner {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		int primeiroNumero;
		int segundoNumero;
		int resultado;
		String nome;
		
		System.out.println("Qual o primeiro n�mero?");
		primeiroNumero = leitor.nextInt();
		
		System.out.println("Qual o segundo n�mero?");
		segundoNumero = leitor.nextInt();
		System.out.println("Qual o seu nome?");
	
	    nome = leitor.next();
	    System.out.println("Ol� " + nome);
	    leitor.close();
		  
		resultado = primeiroNumero + segundoNumero; 
		
		System.out.println("Resultado " + resultado);
		
	    
		
		// TODO Auto-generated method stub

	}

}
