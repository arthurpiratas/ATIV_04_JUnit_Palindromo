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
		// Setando vari�vel 
		
		String string = "Ana"; 
		
		// resultado = true 
		
		 assertTrue(palindromo.isPolindromo(string));
	}
	
	@Test
	void testarStringPalindromoFalhaSemEspaco() throws ExececaoNulo {
		// Setando vari�vel 
		
		String string = "Arthur"; 
		
		// resultado = false 
		
		 assertFalse(palindromo.isPolindromo(string));
	}
	
	@Test
	void testarStringPalindromoSucessoComEspaco() throws ExececaoNulo {
		// Setando vari�vel 
		
		String string = "Luz Azul"; 
		
		// resultado = true 
		
		 assertTrue(palindromo.isPolindromo(string));
	}
	
	@Test
	void testarStringPalindromoFalhaComEspaco() throws ExececaoNulo {
		// Setando vari�vel 
		
		String string = "Carro Preto"; 
		
		// resultado = false 
		
		 assertFalse(palindromo.isPolindromo(string));
	}
	
	@Test
	void testarStringPalindromoSucesspComAcento() throws ExececaoNulo {
		// Setando vari�vel 
		
		String string = "Ap�s a sopa"; 
		
		// resultado = true 
		
		 assertTrue(palindromo.isPolindromo(string));
	}
	
	@Test
	void testarStringPalindromoSucesspComFalha() throws ExececaoNulo {
		// Setando vari�vel 
		
		String string = "s�ntese errada"; 
		
		// resultado = false 
		
		 assertFalse(palindromo.isPolindromo(string));
	}
	
	@Test
	void testarStringPalindromoNulo()  {
		// Setando vari�vel 
		
		String string = null; 

		// resultado Erro 
		
		assertThrows(ExececaoNulo.class, () -> {
			 assertTrue(palindromo.isPolindromo(string));
		    });
	}
	
	@Test
	void testarStringPalindromoVazio() throws ExececaoNulo {
		// Setando vari�vel 
		
		String string = ""; 
		
				
		// resultado = true 
		
		assertTrue(palindromo.isPolindromo(string));
	}

}
