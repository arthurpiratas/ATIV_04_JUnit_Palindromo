package Excecoes;

public class ExececaoNulo extends Exception{
	
	public ExececaoNulo() {
		
	}
	
	@Override
	public String getMessage() {
		return "Não pode ser nulo"; 
	}
	
}
