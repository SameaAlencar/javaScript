package leitura;

import java.util.Scanner;

public class TesteScanner {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		int primeiroNumero;
		int segundoNumero;
		int resultado;
		String nome;
		
		System.out.println("Qual o primeiro número?");
		primeiroNumero = leitor.nextInt();
		
		System.out.println("Qual o segundo número?");
		segundoNumero = leitor.nextInt();
		System.out.println("Qual o seu nome?");
	
	    nome = leitor.next();
	    System.out.println("Olá " + nome);
	    leitor.close();
		  
		resultado = primeiroNumero + segundoNumero; 
		
		System.out.println("Resultado " + resultado);
		
	    
		
		// TODO Auto-generated method stub

	}

}
