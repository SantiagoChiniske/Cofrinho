package uninter;

//Clase filha da Moeda
public class Euro extends Moeda {

	//Valor inicial da moeda com o metódo contrutor
	public Euro(double valor) {
			this.valor = valor;
	}
	
	//Metódo Info do Real
	public void info() {
		System.out.println("Euro - " + valor);		
	}

	//Valor convertido
	public double converter() {
		return this.valor * 5.39;
	}

	public boolean equals(Object objeto) {
		//Validando a clase
		if(this.getClass()!= objeto.getClass()) {
			return false;
		}
		
		//Conversão entre variaveis do Objeto para classe Real
		Euro objetoDeEuro = (Euro) objeto;
		
		
		//Validando o valor
		if(this.valor != objetoDeEuro.valor) {
			return false;
		}
		return true;
	}
}
