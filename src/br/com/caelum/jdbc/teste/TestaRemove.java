package br.com.caelum.jdbc.teste;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaRemove {

	public static void main(String[] args) {
		Contato contato = new Contato();
		
		contato.setId(7);
		
		ContatoDao dao = new ContatoDao();
		
		dao.remove(contato);
		
		if(dao.remove(contato) == 1){
			System.out.println("Contato removido com sucesso!");
			
		}else{
			System.out.println("Contato no pode ser removido!");
		}

	}

}
