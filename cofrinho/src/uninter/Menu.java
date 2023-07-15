package uninter;

import java.util.Scanner;

public class Menu {
	
	
	//Declaração do metódo de uso do declado e dos metódos do Cofrinho
	private Scanner sc;
	private Cofrinho cofrinho;
	
	//Constrututor do Cofrinho
	public Menu() {
		sc = new Scanner(System.in);
		cofrinho = new Cofrinho();
	}
	
	//Inicialização do nosso Menu
	public void exibirMenuPrincipal() {
		System.out.println("COFRINHO:");
		System.out.println("1-Adicionar moeda");
		System.out.println("2-Remover moeda");
		System.out.println("3-Lista moedas");
		System.out.println("4-Calcular valor total convertido para real:");
		System.out.println("0-Encerrar");
		
		String opcao = sc.next();
		
	//Depois de usuário selecionar vai cair nesse switch que vai ser respectiva opção
		switch (opcao) {
		
		
		//Finalizar o programa
		case"0": 
			System.out.println("Encerrando...");
			break;
		
		//Adicionar Moeda
		case"1":
			exibirSubMenuAdicionarMoedas();
			exibirMenuPrincipal();
			break;
			
		case"2":
			exibirSubMenuRemoverMoedas();
			exibirMenuPrincipal();
			break;
			
		//Lista as moedas
		case "3":
			cofrinho.listagemMoedas();
			exibirMenuPrincipal();
			break;
		
		//Mostra as moedas convertidas para o Real
		case "4":
			double valorTotalConvertido = cofrinho.totalConvertido();//Aqui está pegando o valor convertendo para double
			String valorTotalConvertidoTextual = String.format("%.2f",valorTotalConvertido);//Aqui está formatando e tornando a variáveil em String
			valorTotalConvertidoTextual = valorTotalConvertidoTextual.replace(".",",");//Mundando o ponto para virgula do valor
			System.out.println("O valor total convertido para real?" + valorTotalConvertidoTextual);//Printando na tela o valor 
			break;
			
		//Caso o usuário insira um valor errado
		default:
			System.out.println("Opção inválida!");
			exibirMenuPrincipal();
			break;
			
		
		}
	}
	
	
	//Aqui é Metódo adicionar a moeda
	private void exibirSubMenuAdicionarMoedas(){
		System.out.println("Escolha uma moeda:");
		System.out.println("1 - Real");
		System.out.println("2 - Dólar");
		System.out.println("3 - Euro");
		
		int opcaoMoeda = sc.nextInt();//Aqui vai ser guardado opção do usuário
		
		System.out.println("Digite o valor:");
		String valorTextualMoeda  = sc.next();
		
		valorTextualMoeda = valorTextualMoeda.replace(",",".");//aqui estamos mudando de vircula para ponto
		
		double valorMoeda = Double.valueOf(valorTextualMoeda); 
		
		Moeda moeda = null;//O valor da moeda começa como nulo
		
		
		//Aqui começa a estrutura de decisão de qual o usuário selecionou
		if(opcaoMoeda == 1) {
			moeda = new Real(valorMoeda);
			cofrinho.adicionar(moeda);
			
		}
		else if(opcaoMoeda == 2) {
			moeda = new Dolar(valorMoeda);
		}
		else if(opcaoMoeda == 3) {
			moeda = new Euro(valorMoeda);		
			
		}else {
			System.out.println("Não existe essa moeda");
			exibirMenuPrincipal();
		}
		
		cofrinho.adicionar(moeda);
		
		//Print confirmando que funcionou 
		System.out.println("Sua moeda foi adicionada!");
		
	}
	
	private void exibirSubMenuRemoverMoedas(){
		System.out.println("Escolha uma moeda:");
		System.out.println("1 - Real");
		System.out.println("2 - Dólar");
		System.out.println("3 - Euro");
		
		int opcaoMoeda = sc.nextInt();//Aqui vai ser guardado opção do usuário
		
		System.out.println("Digite o valor:");
		String valorTextualMoeda  = sc.next();
		
		valorTextualMoeda = valorTextualMoeda.replace(",",".");//aqui estamos mudando de vircula para ponto
		
		double valorMoeda = Double.valueOf(valorTextualMoeda); 
		
		Moeda moeda = null;//O valor da moeda começa como nulo
		
		
		//Aqui começa a estrutura de decisão de qual o usuário selecionou
		if(opcaoMoeda == 1) {
			moeda = new Real(valorMoeda);;		
		}
		else if(opcaoMoeda == 2) {
			moeda = new Dolar(valorMoeda);
		}
		else if(opcaoMoeda == 3) {
			moeda = new Euro(valorMoeda);	
		}else {
			System.out.println("Não existe essa moeda");
			exibirMenuPrincipal();
		}
		
		cofrinho.remover(moeda);
		
		//Print confirmando que funcionou 
		System.out.println("Sua moeda foi adicionada!");
		
	}

}
