package Negocio;

import java.text.Normalizer;

import Excecoes.ExececaoNulo;

public class Palindromo implements IPalindromo {

	@Override
	public boolean isPolindromo(String string) throws ExececaoNulo {
		
		if(string == null) {
			throw new ExececaoNulo(); 
		}else {
			
		}
		
		String string2 = new String();
		string = string.replaceAll(" ", ""); 
		
		for (int i = (string.length()-1); i >= 0;  i--) {
			 string2 += string.charAt(i);
		}
				
		return removerAcentos(string2).compareToIgnoreCase(removerAcentos(string)) == 0 ? true : false;
	}
	
	
	public static String removerAcentos(String str) {
	    return Normalizer.normalize(str, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
	}

}
