package IfElse;

public class decisoes {

	public static void main(String[] args) {
		//Estrutura de decisão utilizadas para controlar o fluxo de execução
		//if e else
		int a = 10;
		
		if(a == 10)
		{
			System.out.println("a é igual a 10");
		}else if(a > 10)
		{
			System.out.println("a é maior que 10");
		}else
		{
			System.out.println("a é menor que 10");
		}
		
		//ternário
		boolean verdadeiro = (a == 10) ? true : false;
		if(verdadeiro)
		{
			System.out.println("Verdadeiro");
		}
	}

}
