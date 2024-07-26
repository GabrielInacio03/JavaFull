package OperadoresAritimeticos;

public class aritmeticos {

	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		double c = 4.56;
		double d = 8.98;
		
		//soma
		int soma = a + b;
		System.out.println("soma: "+ soma);
		System.out.println();
		
		//subtração
		int subtracao = a - b;
		System.out.println("subtração: "+ subtracao);
		System.out.println();
		
		//multiplicacao
		int multiplicacao = a * b;
		System.out.println("multiplicação: "+ multiplicacao);
		System.out.println();
		
		//divisão
		int divisao = a * b;
		System.out.println("divisão: "+ divisao);
		System.out.println();
		
		//resto de divisão
		int resto = a % b;
		System.out.println("resto: "+ resto);
		System.out.println();
		
		//incremento, somar mais um
		a++;
		int incremento = a;
		System.out.println("incremento: "+ incremento);
		System.out.println();
		
		//decremento, subtrair menos um
		a--;
		int decremento = a;
		System.out.println("decremento: "+ decremento);
		System.out.println();
	}

}
