package br.com.fiap.gulliver.modelo;

public class Restaurante extends TipoComida {
	private int Codigo_Restaurante;
	private String Nome_Restaurante;
	private String Site_Restaurante;
	private String Telefone_Restaurante;

	@Override
	public String toString() {
		return "Restaurante - Codigo_Restaurante:" + Codigo_Restaurante + ", Nome_Restaurante:" + Nome_Restaurante
				+ ", Site_Restaurante:" + Site_Restaurante + ", Telefone_Restaurante:" + Telefone_Restaurante + ", " + super.toString() ;
	}

	public Restaurante() {
		super();
	}

	public Restaurante(int codigo_Pais, String nome_Pais, int codigo_Cidade, String nome_Cidade, int codigo_Bairro,
			String nome_Bairro, int codigo_Tipo_Comida, String nome_Tipo_Comida, int codigo_Restaurante,
			String nome_Restaurante, String site_Restaurante, String telefone_Restaurante) {
		super(codigo_Pais, nome_Pais, codigo_Cidade, nome_Cidade, codigo_Bairro, nome_Bairro, codigo_Tipo_Comida,
				nome_Tipo_Comida);
		Codigo_Restaurante = codigo_Restaurante;
		Nome_Restaurante = nome_Restaurante;
		Site_Restaurante = site_Restaurante;
		Telefone_Restaurante = telefone_Restaurante;
	}

	public void setBasico(String Nome_Restaurante, String Site_Restaurante, String
			Endereco_Restaurante, String Telefone_Restaurante) {
		this.Nome_Restaurante = Nome_Restaurante;
		this.Site_Restaurante = Site_Restaurante;
		this.Telefone_Restaurante = Telefone_Restaurante;		
	}
	
	public String getBasico() {
		return Nome_Restaurante + "\n" + Site_Restaurante + "\n" + Telefone_Restaurante;
	}

	public int getCodigo_Restaurante() {
		return Codigo_Restaurante;
	}
	public void setCodigo_Restaurante(int codigo_Restaurante) {
		Codigo_Restaurante = codigo_Restaurante;
	}
	public String getNome_Restaurante() {
		return Nome_Restaurante;
	}
	public void setNome_Restaurante(String nome_Restaurante) {
		Nome_Restaurante = nome_Restaurante;
	}
	public String getSite_Restaurante() {
		return Site_Restaurante;
	}
	public void setSite_Restaurante(String site_Restaurante) {
		Site_Restaurante = site_Restaurante;
	}

	public String getTelefone_Restaurante() {
		return Telefone_Restaurante;
	}
	public void setTelefone_Restaurante(String telefone_Restaurante) {
		Telefone_Restaurante = telefone_Restaurante;
	}
	
	
}
