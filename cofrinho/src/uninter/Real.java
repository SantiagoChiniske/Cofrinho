package uninter;

public class Real extends Moeda {
	
	//Valor inicial da moeda com o metódo contrutor
	public Real(double valor) {
		this.valor = valor;
	}

	@Override
	public void info() {
		
		System.out.println("Real - " + valor);
		
		
	}

	
	@Override
	public double converter() {
		
		return this.valor;
		
	}
	
	

}
