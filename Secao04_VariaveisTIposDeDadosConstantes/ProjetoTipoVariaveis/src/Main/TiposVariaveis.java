package Main;

public class TiposVariaveis {

	public static void main(String[] args) {
		//tipos de variáveis primitivos
		
		//tipos inteiros
		int numero1 = 1234;
		short numero2 = 4523;
		byte numero3 = 127; //maximo
		long numero4 = 12345678;
		
		//converter inteiro por inteiro
		int converter1 = numero2;
		long converter2 = (int)numero4; //conversão em casting
		long converter3 = (byte)numero4;
		
		
		//tipos caracter
		char valorChar = 'A';
		int converter4 = valorChar; //converte o char para decimal, tabela ascii
		//tipos fluatuantes
		float numero5 = 4.123f;
		double numero6 = 45.66544554;
		
		//tipo boooleano - verdadeiro ou falso
		boolean verdadeiro = true;
		boolean falso = false;
		
		//tipos de variáveis não primitivos - são objetos
		//pq foi criado uma classe para ter esse tipo
		
		String frase = "Curso Java";
		Float numero7 = 4.56f;
		Double numero8 = 4.52;
		System.out.println(numero8.toString() + "\n" + numero8.toString());
		
		
		System.out.println("___________________________");
		
		
	}

}
