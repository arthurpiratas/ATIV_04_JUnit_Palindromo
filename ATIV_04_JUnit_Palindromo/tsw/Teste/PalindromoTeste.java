package Teste;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Negocio.IPalindromo;
import Negocio.Palindromo;

class PalindromoTeste {
	
	IPalindromo palindromo; 
	

	@BeforeEach
	void setUp() throws Exception {
		
		palindromo = new Palindromo(); 
	}

	@Test
	void testarStringPalindromoSucesso() {
		// Setando variável 
		
		String string = "Ana"; 
		
		// resultado = true 
		
		 assertTrue(palindromo.isPolindromo(string));
	}

}
