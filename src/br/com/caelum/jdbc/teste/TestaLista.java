package br.com.caelum.jdbc.teste;

import java.text.ParseException;
import java.util.List;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;
import br.com.caelum.jdbc.util.FormataData;

public class TestaLista {

	public static void main(String[] args) throws ParseException{
		//criando contatoDAo
		ContatoDao dao = new ContatoDao();
		
		//listando os contatos con DAO
		List<Contato> contatos = dao.getLista();
		
		//imprimindo
		for(Contato contato : contatos){
			System.out.println("Nome: "+ contato.getNome());
			System.out.println("Email: "+ contato.getEmail());
			System.out.println("Endereço: "+ contato.getEndereco());
			System.out.println("Data Nascimento: "+
					FormataData.formatada(contato.getDataNascimento().getTime()) + "\n");
		}

	}

}
