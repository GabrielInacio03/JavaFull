package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("----------------------------");
		System.out.println("------ Menu Principal ------");
		System.out.println("----------------------------");
		System.out.println("-- Opções --");
		System.out.println("1 - Abrir");
		System.out.println("2 - Salvar");
		System.out.println("3 - Fechar");
		System.out.println("----------------------------");
		System.out.println("Desenvolvido por - Gabriel Inácio");
		System.out.println("----------------------------");
		
		System.out.println("Digite o número da opção desejada: ");
		
		//importar o java.util.Scanner
		Scanner entrada = new Scanner(System.in);
		
		int numeroOpcao = entrada.nextInt();
		
		System.out.println("           ");
		System.out.println("----------------------------");
		//System.out.println("O número desejado foi: "+ numeroOpcao);
		System.out.printf("O número desejado foi:  %d \n", numeroOpcao);
		System.out.println("----------------------------");
		
	}//fim do método main

}//fim da classe ProjetoScanner
