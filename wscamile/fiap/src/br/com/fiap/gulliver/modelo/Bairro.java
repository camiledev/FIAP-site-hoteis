package br.com.fiap.gulliver.modelo;

public class Bairro extends Cidade{
	private int Codigo_Bairro;
	private String Nome_Bairro;
	
	@Override
	public String toString() {
		return "Bairro - Codigo_Bairro:" + Codigo_Bairro + ", Nome_Bairro:" + Nome_Bairro + ", " + super.toString() ;
	}

	public Bairro() {
		super();
	}
	
	public Bairro(int codigo_Pais, String nome_Pais, int codigo_Cidade, String nome_Cidade, int codigo_Bairro,
			String nome_Bairro) {
		super(codigo_Pais, nome_Pais, codigo_Cidade, nome_Cidade);
		Codigo_Bairro = codigo_Bairro;
		Nome_Bairro = nome_Bairro;
	}

	public int getCodigo_Bairro() {
		return Codigo_Bairro;
	}
	public void setCodigo_Bairro(int codigo_Bairro) {
		Codigo_Bairro = codigo_Bairro;
	}
	public String getNome_Bairro() {
		return Nome_Bairro;
	}
	public void setNome_Bairro(String nome_Bairro) {
		Nome_Bairro = nome_Bairro;
	}
	
	
	
}
