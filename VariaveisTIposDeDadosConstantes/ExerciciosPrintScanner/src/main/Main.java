package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("----------------------------");
		System.out.println("Cálculo da Área do Retângulo");
		System.out.println("----------------------------");
		
		System.out.println("Digite o lado A do retângulo:");
		float ladoA = entrada.nextFloat();
		
		System.out.println("Digite o lado B do retângulo");
		float ladoB = entrada.nextFloat();
		
		System.out.println("calculando área...");
		System.out.println("----------------------------");
		float area = ladoA * ladoB;
		System.out.println("A Área do retângulo é "+ area +"cm");
	}//fim do método main

}//fim da classe Main
