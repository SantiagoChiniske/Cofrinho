package uninter;

import java.util.ArrayList;

public class Main {
	
	//Metódo principal
	public static void main (String[] args) {
		
		
//	Menu menu = new Menu();
//	menu.exibirMenuPrincipal();
		
		
	Moeda moedaDeUmReal = new Real(99);
	moedaDeUmReal.info();
	System.out.println(moedaDeUmReal.converter());
	
	System.out.println("-----------------------");
	
	Moeda moedaDeDolar = new Dolar(5);
	moedaDeDolar.info();
	System.out.println(moedaDeDolar.converter());
		
	
	ArrayList<Moeda> listaDeMoedas = new ArrayList<>();
	System.out.println("Lista de moedas: " +listaDeMoedas.toString());
	
	listaDeMoedas.add(moedaDeUmReal);
	System.out.println("Lista de moedas: " +listaDeMoedas.toString());

	for (Moeda moedaDeReal : listaDeMoedas) {
		moedaDeReal.info();
	}

	}
}
