package br.com.caelum.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	public Connection getConnection(){
		//fazendo a conexão com o banco de dados
		try {
			//servidor+endereço ip ou localhost + database + login + senha
			return DriverManager.getConnection("jdbc:mysql://localhost/agenda","root","root");
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
	}

}
 