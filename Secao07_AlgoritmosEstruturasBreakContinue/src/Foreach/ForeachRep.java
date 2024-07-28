package Foreach;

import java.util.ArrayList;
import java.util.List;

public class ForeachRep {

	public static void main(String[] args) {
		List<String> nomes = new ArrayList<>();
		nomes.add("Gabriel");
		nomes.add("Maria");
		nomes.add("Carlos");
		nomes.add("Matheus");
		nomes.add("Nathalia");
		
		for (String nome : nomes) {
			System.out.println("Nome: "+ nome);
		}
	}

}
