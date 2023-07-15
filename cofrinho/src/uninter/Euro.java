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

}
