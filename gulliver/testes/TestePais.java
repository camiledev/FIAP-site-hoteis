package br.com.fiap.gulliver.testes;

import java.util.ArrayList;

public class TestePais {

	public static void main(String[] args) {
		ArrayList<String> listaPais = new ArrayList<String>();
		listaPais.add("Brasil");
		
		for(String Pais:listaPais) {
			System.out.println(listaPais);
		}
	}
}

