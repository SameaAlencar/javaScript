package exercicio4;

import java.util.Scanner;

public class Elei��o {
  public static void main(String[] args) {
	   System.out.println("********************");
	   System.out.println("Elei��o Sindical");
	   System.out.println("********************");
	   
	   Scanner leitor = new Scanner (System.in);
	   String nomeDoPrimeiroCandidato;
	   String nomeDoSegundoCandidato;
	   String nomeDoTerceiroCandidato;
	   
	   System.out.println("Qual o nome do primeiro candidato?");
	   nomeDoPrimeiroCandidato = leitor.next();
	   
	   System.out.println("Qual o nome do segundo candidato?" );
	   nomeDoSegundoCandidato = leitor.next();
	   
	   System.out.println("Qual o nome do terceiro candidato?");
	   nomeDoTerceiroCandidato = leitor.next();
	   
	   System.out.println("********Apura��o********");
	    
	   int totalDeVotosParaJunior;
	   int totalDeVotosParaMarco;
	   int totalDeVotosParaLauro;
	   int totalNulos;
	   int totalBrancos;
	   
	   System.out.println("Qual � o total de votos para " + nomeDoPrimeiroCandidato + ": ");
	   totalDeVotosParaJunior = leitor.nextInt();
	   
	   System.out.println("Qual � o total de votos para " + nomeDoSegundoCandidato + ": ");
	   totalDeVotosParaMarco = leitor.nextInt();
	   
	   System.out.println("Qual � o total de votos para " + nomeDoTerceiroCandidato + ": ");
	   totalDeVotosParaLauro = leitor.nextInt();
	   
	   System.out.println("Qual � o total de votos nulos ");
	   totalNulos = leitor.nextInt();
	   
	   System.out.println("Qual � o total de votos Brancos ");
	   totalBrancos = leitor.nextInt();
	   
	   
	   System.out.println("*****************************");
	   System.out.println("RESULTADOS");
	   System.out.println("*****************************");
	  
	   
	   int valor1 = (1+1+1);
	   int valor2 = + totalDeVotosParaJunior + totalDeVotosParaLauro + totalDeVotosParaMarco +  totalNulos + totalBrancos;
	   System.out.println("Total de Eleitores " + valor1);
	   int percentual1 = (valor2 * totalDeVotosParaJunior) / 100;
	   System.out.println("Percentual de votos para " + nomeDoPrimeiroCandidato  + percentual1);
	   int percentual2 = (valor2 * totalDeVotosParaLauro) / 100;
	   System.out.println("Percentual de votos para " + nomeDoSegundoCandidato  + percentual2);
	   int percentual3 = (valor2 * totalDeVotosParaMarco) / 100;
	   System.out.println("Percentual de votos para " + nomeDoTerceiroCandidato  + percentual3);
	   leitor.close();
	   
	   
	   
			   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	    
	   
	   
	  // TODO Auto-generated method stub
	 
	  

	}

}
