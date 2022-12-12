package application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramMaiorValorVet {

		public static void main(String[] args) {
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner (System.in);
			
			System.out.print("Quantos numeros vc vai digitar? ");
			int n = sc.nextInt();
			
			double maiorNum = 0.0;		
			double [] numeros = new double [n];
			
			for (int i=0; i<n; i++) {
				System.out.print("Digite um número: ");
				numeros[i]= sc.nextDouble();						
			    }
			
			//Procura maior valor e posicao no vetor
			maiorNum = numeros[0];
			int posMaior = 0;
			for (int i=1; i<numeros.length; i++) {
				if (numeros[i] > maiorNum) {
					maiorNum = numeros[i];
					posMaior = i;
				}
		     }
			
			System.out.println();
			System.out.printf("Maior Valor =  %.1f\n", maiorNum);
			System.out.printf("Posicao no vetor de Maior Valor =  %d\n", posMaior);
			
	        sc.close();
		}
	}



