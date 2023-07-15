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
	
	public boolean equals(Object objeto) {
		//Validando a clase
		if(this.getClass()!= objeto.getClass()) {
			return false;
		}
		
		//Conversão entre variaveis do Objeto para classe Real
		Real objetoDeReal = (Real) objeto;
		
		
		//Validando o valor
		if(this.valor != objetoDeReal.valor) {
			return false;
		}
		return true;
	}

}
