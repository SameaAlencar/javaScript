package m?dia_final;

import java.util.Scanner;

public class M?diaFinal {

	public static void main(String[] args) {
		
		String nome;
		double n1, n2, n3, n4,  m?dia;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Nome do aluno: ");
		nome = leitor.next();
        
		System.out.print("Nota do 1o Bim: ");
		n1 = leitor.nextDouble();
		
		System.out.print("Nota do 2o Bim: ");
		n2 = leitor.nextDouble();

		System.out.print("Nota do 3o Bim: ");
		n3 = leitor.nextDouble();
		
		System.out.print("Nota do 4o Bim: ");
		n4 = leitor.nextDouble();
		
		leitor.close();
		
		// Calcular a m?dia
		
		m?dia = (n1 + n2 + n3 + n4) / 4;
		
		System.out.println("A m?dia do(a) aluno(a) " + nome + " ?: " + m?dia );
		
		// Verificar a situa??o do aluno
		
		if (m?dia >= 6 ) {
			System.out.println("**** A P R O V A D O ****");
		}
		else if (m?dia <4) {
			System.out.println("**** R E P R O V A D O ****");
		}
		else   {
			System.out.println("**** R E C U P E R A ? ? O ****");
		}
		
	}

}
