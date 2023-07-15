package uninter;

import java.util.ArrayList;

public class Cofrinho {

	//Aqui é a lista das moedas
	private ArrayList <Moeda> listaMoedas;
	
	//Constrututor do Cofrinho
	public Cofrinho() {
		
		this.listaMoedas = new ArrayList<>();
	}
	
	//adiciona as moedas
	
	public void adicionar(Moeda moeda) {
		this.listaMoedas.add(moeda);
	}
	
	//Remover as moedas
	
	public void remover(Moeda moeda) {
		this.listaMoedas.remove(moeda);
	}
	
	
	//Lista as moedas
	
	public void listagemMoedas() {
		if (this.listaMoedas.isEmpty()) {
			System.out.println("Não existe nenhuma moeda no cofrinho!");
			return;
		}
					
		for (Moeda moeda : this.listaMoedas) {
			moeda.info();
		}
	}
	
	//Metódo de converte os valores em real
	
	public double totalConvertido() {
		if (this.listaMoedas.isEmpty()) {
			return 0;
		}
		
		double valorAcumulado = 0;
		for(Moeda moeda : this.listaMoedas) {
			valorAcumulado =  valorAcumulado + moeda.converter();
		}
		
		return valorAcumulado;
	}
}
