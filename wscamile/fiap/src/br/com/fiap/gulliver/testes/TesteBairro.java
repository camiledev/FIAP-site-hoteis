package br.com.fiap.gulliver.testes;

import java.util.HashSet;
import java.util.Scanner;

public class TesteBairro {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		HashSet<String> set = new HashSet<String>();
		
		set.add("Pinheiros");
		set.add("Itaim Bibi");
		set.add("Bela Vista");
		
		System.out.println(set);
		
		System.out.println(set.toArray());
	}
}
