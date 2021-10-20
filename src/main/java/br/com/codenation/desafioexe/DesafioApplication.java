package br.com.codenation.desafioexe;

import java.util.List;
import java.util.ArrayList;

public class DesafioApplication {

	public static List<Integer> fibonacci() {
		List<Integer> numerosFibonacci = new ArrayList<>();
		int aNumero = 0;
		int bNumero = 1;
		int aux;
		numerosFibonacci.add(aNumero);


// https://www.youtube.com/watch?v=NoLkFgrEdWA&t=170s
		for (int i = 0; i < 14; i++) {
			numerosFibonacci.add(bNumero);
			aux = bNumero;
			bNumero = bNumero + aNumero;
			aNumero = aux;
		}
		return numerosFibonacci;

	}



	public static Boolean isFibonacci(Integer a) {
		return fibonacci().contains(a);
	}

}