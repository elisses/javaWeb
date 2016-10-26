package br.com.caelum.jdbc.teste;

import java.util.Calendar;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaAlterar {

	public static void main(String[] args) {
		
		Contato contato =new Contato();
		contato.setNome("Antonio");
		contato.setEmail("antonio@gmail.com");
		contato.setEndereco("Rua claras n 34");
		contato.setDataNascimento(Calendar.getInstance());
		contato.setId(5);
		
		ContatoDao dao = new ContatoDao();
		
		if(dao.altera(contato)==1){
			
			System.out.println("Alterado com sucesso!");
		}else{
			System.out.println("Dados não alterado!");
		}
		

	}

}
