package OperadoresBitaBit;

public class bitabit {

	public static void main(String[] args) {
		/*
		 * Operadores bitwise são utilizados quando precisamos realizar operações
		 * a nível de bits com números inteiros, ou seja, trabalhar com a sua 
		 * representação binária
		 * */
		
		
		int x = 60; //00111100		
		int y = 13; //00001101
		
		//operador &
		int c = x & y; //=1100
		System.out.println(x & y); //resultado 12
		System.out.println(Integer.toBinaryString(x & y)); //1100
		
		//operador |
		System.out.println(x | y);
		System.out.println(Integer.toBinaryString(x | y)); //111101
		
		//operador ^, diferente
		System.out.println(x ^ y);
		System.out.println(Integer.toBinaryString(x ^ y)); //110001
		
		//deslocamento <<
		System.out.println(x << 2);
		System.out.println(Integer.toBinaryString(x << 2));
		
		//deslocamento >>
		System.out.println(x >> 2);
		System.out.println(Integer.toBinaryString(x >> 2));
	}

}
