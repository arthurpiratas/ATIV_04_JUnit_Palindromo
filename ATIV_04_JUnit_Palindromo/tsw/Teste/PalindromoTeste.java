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
		// Setando vari�vel 
		
		String string = "ana"; 
		
		// resultado = true 
		
		 assertTrue(palindromo.isPolindromo(string));
	}

}
