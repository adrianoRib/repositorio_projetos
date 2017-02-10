package br.com.certification.main;

import br.com.certification.model.Usuario;
import br.com.certification.model.Endereco;

public class App {

  static int id = 1;

  public static void main(String[] args){
    Usuario u = new Usuario();
    Endereco e = new Endereco();
    e.setRua("Al. Araguaia");
    e.setNumero(1234);
    e.setBairro("Alphaville");
    e.setCidade("Barueri");
    u.setEndereco(e);
    u.setNome("Adriano");
    u.setIdade(25);

    System.out.println(u);
  }
}
