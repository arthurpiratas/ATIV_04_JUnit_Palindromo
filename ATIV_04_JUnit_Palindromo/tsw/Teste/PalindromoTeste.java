package Teste;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Excecoes.ExececaoNulo;
import Negocio.IPalindromo;
import Negocio.Palindromo;

class PalindromoTeste {
	
	IPalindromo palindromo; 
	

	@BeforeEach
	void setUp() throws Exception {
		
		palindromo = new Palindromo(); 
	}

	@Test
	void testarStringPalindromoSucessoSemEspaco() throws ExececaoNulo {
		// Setando variável 
		
		String string = "Ana"; 
		
		// resultado = true 
		
		 assertTrue(palindromo.isPolindromo(string));
	}
	
	@Test
	void testarStringPalindromoFalhaSemEspaco() throws ExececaoNulo {
		// Setando variável 
		
		String string = "Arthur"; 
		
		// resultado = false 
		
		 assertFalse(palindromo.isPolindromo(string));
	}
	
	@Test
	void testarStringPalindromoSucessoComEspaco() throws ExececaoNulo {
		// Setando variável 
		
		String string = "Luz Azul"; 
		
		// resultado = true 
		
		 assertTrue(palindromo.isPolindromo(string));
	}
	
	@Test
	void testarStringPalindromoFalhaComEspaco() throws ExececaoNulo {
		// Setando variável 
		
		String string = "Carro Preto"; 
		
		// resultado = false 
		
		 assertFalse(palindromo.isPolindromo(string));
	}
	
	@Test
	void testarStringPalindromoSucesspComAcento() throws ExececaoNulo {
		// Setando variável 
		
		String string = "Após a sopa"; 
		
		// resultado = true 
		
		 assertTrue(palindromo.isPolindromo(string));
	}
	
	@Test
	void testarStringPalindromoSucesspComFalha() throws ExececaoNulo {
		// Setando variável 
		
		String string = "síntese errada"; 
		
		// resultado = false 
		
		 assertFalse(palindromo.isPolindromo(string));
	}
	
	@Test
	void testarStringPalindromoNulo()  {
		// Setando variável 
		
		String string = null; 

		// resultado Erro 
		
		assertThrows(ExececaoNulo.class, () -> {
			 assertTrue(palindromo.isPolindromo(string));
		    });
	}
	
	@Test
	void testarStringPalindromoVazio() throws ExececaoNulo {
		// Setando variável 
		
		String string = ""; 
		
				
		// resultado = true 
		
		assertTrue(palindromo.isPolindromo(string));
	}

}
