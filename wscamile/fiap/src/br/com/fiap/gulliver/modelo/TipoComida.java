package br.com.fiap.gulliver.modelo;

public class TipoComida extends Bairro{
	private int Codigo_Tipo_Comida;
	private String Nome_Tipo_Comida;
	
	@Override
	public String toString() {
		return "TipoComida - Codigo_Tipo_Comida:" + Codigo_Tipo_Comida + ", Nome_Tipo_Comida:" + Nome_Tipo_Comida + ", " + super.toString() ;
	}

	public TipoComida() {
		super();
	}

	public TipoComida(int codigo_Pais, String nome_Pais, int codigo_Cidade, String nome_Cidade, int codigo_Bairro,
			String nome_Bairro, int codigo_Tipo_Comida, String nome_Tipo_Comida) {
		super(codigo_Pais, nome_Pais, codigo_Cidade, nome_Cidade, codigo_Bairro, nome_Bairro);
		Codigo_Tipo_Comida = codigo_Tipo_Comida;
		Nome_Tipo_Comida = nome_Tipo_Comida;
	}

	public int getCodigo_Tipo_Comida() {
		return Codigo_Tipo_Comida;
	}
	public void setCodigo_Tipo_Comida(int codigo_Tipo_Comida) {
		Codigo_Tipo_Comida = codigo_Tipo_Comida;
	}
	public String getNome_Tipo_Comida() {
		return Nome_Tipo_Comida;
	}
	public void setNome_Tipo_Comida(String nome_Tipo_Comida) {
		Nome_Tipo_Comida = nome_Tipo_Comida;
	}
	
	
}
