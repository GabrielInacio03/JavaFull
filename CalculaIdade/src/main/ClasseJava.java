package main;

import java.util.Scanner;
import java.util.Calendar;

public class ClasseJava 
{

	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
		Calendar calendario = Calendar.getInstance();
		
		System.out.println("----------------------------");
		System.out.println("-- Digite sua idade: ");
		System.out.println("----------------------------");
		
		int idade = calendario.get(Calendar.YEAR) - entrada.nextInt();
		
		System.out.printf("voce nasceu em "+ idade);
		System.out.println();
		System.out.println("----------------------------");
	}//fim método main

}//fim classe ClasseJava
