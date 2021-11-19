package br.com.fiap.gulliver.modelo;

public class Cidade extends Pais{

	private int Codigo_Cidade;
	private String Nome_Cidade;
	
	@Override
	public String toString() {
		return "Cidade - Codigo_Cidade:" + Codigo_Cidade + ", Nome_Cidade:" + Nome_Cidade + ", " + super.toString() ;
	}

	public Cidade() {
		super();
	}

	public Cidade(int codigo_Pais, String nome_Pais, int codigo_Cidade, String nome_Cidade) {
		super(codigo_Pais, nome_Pais);
		Codigo_Cidade = codigo_Cidade;
		Nome_Cidade = nome_Cidade;
	}
	
	public int getCodigo_Cidade() {
		return Codigo_Cidade;
	}
	public void setCodigo_Cidade(int codigo_Cidade) {
		Codigo_Cidade = codigo_Cidade;
	}
	public String getNome_Cidade() {
		return Nome_Cidade;
	}
	public void setNome_Cidade(String nome_Cidade) {
		Nome_Cidade = nome_Cidade;
	}
	
	
	
}
