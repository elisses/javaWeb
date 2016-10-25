package br.com.caelum.jdbc.teste;

import java.util.List;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaLista {

	public static void main(String[] args) {
		//criando contatoDAo
		ContatoDao dao = new ContatoDao();
		
		//listando os contatos con DAO
		List<Contato> contatos = dao.getLista();
		
		//imprimindo
		for(Contato contato : contatos){
			System.out.println("Nome: "+ contato.getNome());
			System.out.println("Email: "+ contato.getEmail());
			System.out.println("Endereço: "+ contato.getEndereco());
			System.out.println("Data Nascimento: "+ contato.getDataNascimento().getTime() + "\n");
		}

	}

}
