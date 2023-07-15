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

	public boolean equals(Object objeto) {
		//Validando a clase
		if(this.getClass()!= objeto.getClass()) {
			return false;
		}
		
		//Conversão entre variaveis do Objeto para classe Real
		Dolar objetoDeDolar = (Dolar) objeto;
		
		
		//Validando o valor
		if(this.valor != objetoDeDolar.valor) {
			return false;
		}
		return true;
	}
}
