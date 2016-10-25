package br.com.caelum.jdbc.teste;

import java.util.Calendar;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaInsere {
	public static void main(String [] args) {
		//pronto pra gravar
		Contato contato = new Contato();
		contato.setNome("Elisa");
		contato.setEmail("elisa@gmail.com");
		contato.setEndereco("Rua maloque n4");
		contato.setDataNascimento(Calendar.getInstance());
		
		//gravando a conexão
		ContatoDao dao = new ContatoDao();
		
		dao.adiciona(contato);
		
		System.out.println("Gravado!");
		
	}

}
