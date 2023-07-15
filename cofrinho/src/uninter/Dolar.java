package uninter;

//Clase filha da Moeda
public class Dolar extends Moeda {

	//Valor inicial da moeda com o metódo contrutor
	public Dolar(double valor) {
			this.valor = valor;
	}
	
	//Metódo Info do Real
	public void info() {
		System.out.println("Dolar - " + valor);		
	}

	//Valor convertido para real
	public double converter() {
		return this.valor * 4.79;
	}

}
