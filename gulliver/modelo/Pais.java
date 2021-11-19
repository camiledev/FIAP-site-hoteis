package br.com.fiap.gulliver.modelo;

public class Pais {
	
	private int Codigo_Pais;
	private String Nome_Pais;
	
	@Override
	public String toString() {
		return "Pais - Codigo_Pais:" + Codigo_Pais + ", Nome_Pais:" + Nome_Pais ;
	}

	public Pais() {
		super();
	}
	
	public Pais(int codigo_Pais, String nome_Pais) {
		super();
		Codigo_Pais = codigo_Pais;
		Nome_Pais = nome_Pais;
	}

	public int getCodigo_Pais() {
		return Codigo_Pais;
	}
	public void setCodigo_Pais(int codigo_Pais) {
		Codigo_Pais = codigo_Pais;
	}
	public String getNome_Pais() {
		return Nome_Pais;
	}
	public void setNome_Pais(String nome_Pais) {
		Nome_Pais = nome_Pais;
	}

	
	
	
}
