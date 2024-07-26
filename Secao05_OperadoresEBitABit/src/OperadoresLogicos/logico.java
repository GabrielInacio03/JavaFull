package OperadoresLogicos;

public class logico {

	public static void main(String[] args) {
		int a = 10;
		int b = 12;
		
		//ou = ||
		if(a == 10 || b == 15 )
		{
			System.out.println("Correto");
		}
		
		//e = &&
		if(a == 10 && b == 15)
		{
			System.out.println("Correto");
		}
		
		//mudança de estado
		boolean c = true;
		if(!c) {
			System.out.println("Não é verdadeiro");
		}
	}

}
