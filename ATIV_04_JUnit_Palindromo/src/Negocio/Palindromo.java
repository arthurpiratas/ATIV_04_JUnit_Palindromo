package Negocio;

public class Palindromo implements IPalindromo {

	@Override
	public boolean isPolindromo(String string) {
		
		String string2 = new String();
		
		for (int i = string.length(); i > 0;  i++) {
			if(string.charAt(i) != ' ') {
				string2 += string.charAt(i);
			}
		}
				
		return string2.compareToIgnoreCase(string) == 0 ? true : false;
	}

}
