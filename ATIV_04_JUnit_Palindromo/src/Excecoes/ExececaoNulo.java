package Excecoes;

public class ExececaoNulo extends Exception{
	
	public ExececaoNulo() {
		
	}
	
	@Override
	public String getMessage() {
		return "N�o pode ser nulo"; 
	}
	
}
