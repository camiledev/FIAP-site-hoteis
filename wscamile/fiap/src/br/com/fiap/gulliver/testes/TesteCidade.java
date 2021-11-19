package br.com.fiap.gulliver.testes;

import java.util.ArrayList;

public class TesteCidade {

	public static void main(String[] args) {
		ArrayList<String> listaPais = new ArrayList<String>();
		listaPais.add("Brasil");
		
		for(String Pais:listaPais) {
			System.out.println(listaPais);
		}
		
		ArrayList<String> listaCidade = new ArrayList<String>();
		listaCidade.add("São Paulo");
		
		for(String Cidade:listaCidade) {
			System.out.println(listaCidade);
		}
	}
}	
