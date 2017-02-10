package br.com.certification.model;

public class Endereco {

  private String rua;
  private Integer numero;
  private String bairro;
  private String cidade;

  public String getRua() {
    return this.rua;
  }

  public void setRua(String rua) {
    this.rua = rua;
  }

  public Integer getNumero() {
    return this.numero;
  }

  public void setNumero(Integer numero) {
    this.numero = numero;
  }

  public String getBairro() {
    return this.bairro;
  }

  public void setBairro(String bairro) {
    this.bairro = bairro;
  }

  public String getCidade() {
    return this.cidade;
  }

  public void setCidade(String cidade) {
    this.cidade = cidade;
  }

  @Override
	public String toString() {
		return this.getRua() + ", " + this.getNumero() + ", " + this.getBairro() + ", " + this.getCidade();
	}
}
