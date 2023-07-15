package uninter;

//Clase filha da Moeda
public class Real extends Moeda {
	
	//Valor inicial da moeda com o metódo contrutor
	public Real(double valor) {
		this.valor = valor;
	}

	//Metódo Info do Real
	public void info() {		
		System.out.println("Real - " + valor);
	}

	
	//Valor convertido
	public double converter() {
		return this.valor;
		
	}
	
	

}
