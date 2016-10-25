package br.com.caelum.jdbc.util;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FormataData {
	public static String formatada (Date date)throws ParseException{
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String dataFormatada = sdf.format(date);
		return dataFormatada;
	}

}
