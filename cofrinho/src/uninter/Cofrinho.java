package uninter;

import java.util.ArrayList;

public class Cofrinho {

	private ArrayList<Moeda> listaMoedas;
	
	public Cofrinho() {
		
		this.listaMoedas = new ArrayList<>();
	}
	
	
	public void adicionar(Moeda moeda) {
		this.listaMoedas.add(moeda);
	}
	
	
	public void listagemMoedas() {
		for(Moeda moeda : this.listaMoedas) {
			moeda.info();
		}
	}
	
}
