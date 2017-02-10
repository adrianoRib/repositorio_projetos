package br.com.certification.model;

import br.com.certification.model.Endereco;

public class Usuario {

  private String nome;
  private Integer idade;
  private Endereco endereco;

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Integer getIdade() {
    return this.idade;
  }

  public void setIdade(Integer idade) {
    this.idade = idade;
  }

  public Endereco getEndereco() {
    return this.endereco;
  }

  public void setEndereco(Endereco endereco) {
    this.endereco = endereco;
  }

  @Override
	public String toString() {
    return this.getNome() + ", " + this.getIdade() + ", " + this.getEndereco();
  }
}
