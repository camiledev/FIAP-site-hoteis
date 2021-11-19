package br.com.fiap.gulliver.testes;

import java.util.HashMap;
import java.util.Scanner;

public class TesteTipoComida {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		HashMap<Integer, String> tipo_comida = new HashMap<Integer, String>();
		
		tipo_comida.put(1, "Brasileira");
		tipo_comida.put(2, "Japonesa");
		tipo_comida.put(3, "Italiana");
		
		
		for(int i = 0; i <= tipo_comida.size(); i++) {
			System.out.println(tipo_comida.get(i));
		}
		
	}
}
