package br.com.fiap.gulliver.testes;

import java.util.HashMap;
import java.util.Scanner;

import javax.swing.JOptionPane;

import br.com.fiap.gulliver.modelo.Restaurante;

public class TesteRestaurante {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		HashMap<Integer, Restaurante> listaRestaurantes = new HashMap<Integer, Restaurante>();
		
		String hasMoreItems = "sim";
		int i = 0;
		while(hasMoreItems.equals("sim")) {
			Restaurante restaurante = new Restaurante(
					i,
					JOptionPane.showInputDialog("Digite o País do seu restaurante"),
					i,
					JOptionPane.showInputDialog("Digite a cidade do seu restaurante"),
					i,
					JOptionPane.showInputDialog("Digite bairro do seu restaurante"),
					i,
					JOptionPane.showInputDialog("Digite o tipo de comida do restaurante"),
					i,
					JOptionPane.showInputDialog("Digite o nome do seu restaurante"),
					JOptionPane.showInputDialog("Digite o site do seu restaurante"),
					JOptionPane.showInputDialog("Digite o número de contato do seu restaurante")
					);
					
			
			listaRestaurantes.put(i, restaurante);
			i++;
			
			hasMoreItems = JOptionPane.showInputDialog("Tem mais items? (sim/nao)");
		}
		
		for(int j = 0; j <= listaRestaurantes.size(); j++) {
			System.out.println(listaRestaurantes.get(j));
		}

	}

}
















//Restaurante restaurante = new Restaurante(
//		1,
//		JOptionPane.showInputDialog("Digite o País do seu restaurante"),
//		1,
//		JOptionPane.showInputDialog("Digite a cidade do seu restaurante"),
//		1,
//		JOptionPane.showInputDialog("Digite bairro do seu restaurante"),
//		1,
//		JOptionPane.showInputDialog("Digite o tipo de comida do restaurante"),
//		1,
//		JOptionPane.showInputDialog("Digite o nome do seu restaurante"),
//		JOptionPane.showInputDialog("Digite o site do seu restaurante"),
//		JOptionPane.showInputDialog("Digite o número de contato do seu restaurante")
//		);

//System.out.println(restaurante.getBasico());
//System.out.println(restaurante.getCodigo_Tipo_Comida());
//System.out.println(restaurante.getNome_Tipo_Comida());
//System.out.println(restaurante.getCodigo_Bairro());
//System.out.println(restaurante.getNome_Bairro());
//System.out.println(restaurante.getCodigo_Cidade());
//System.out.println(restaurante.getNome_Cidade());
//System.out.println(restaurante.getCodigo_Pais());
//System.out.println(restaurante.getNome_Pais());