package uninter;

public class Euro extends Moeda {

	//Valor inicial da moeda com o metódo contrutor
	public Euro(double valor) {
			this.valor = valor;
	}
	
	@Override
	public void info() {
		System.out.println("Euro - " + valor);		
	}

	@Override
	public double converter() {
		return this.valor * 5.39;
	}

}
