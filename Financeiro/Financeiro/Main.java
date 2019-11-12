
import java.util.*;

import Financeiro.Financeiro;
import Financeiro.Menu;

class Main {

	public static void main(String[] args) {

        Menu menu = new Menu();
		
        Scanner in = new Scanner(System.in);
		in.useLocale(Locale.ENGLISH);
  		
  		String tela = menu.login();

  		Financeiro a = new Financeiro();

  		while(true){

  			System.out.print("\033[H\033[2J");
        	System.out.println(tela); 
  			Double valor = 0d;
        	String acao = in.nextLine();

        	// CONSULTA
        	if(acao.equals("1")){
        		tela = menu.saldo(a.getSaldo());
        	}
        	
        	// DEPOSITAR
        	if(acao.equals("2")){

	  			System.out.print("\033[H\033[2J");
	        	System.out.println(menu.depositar()); 
        		valor = in.nextDouble();
        		a.Entrada(valor);
        	}

        	// EXTRATOS
        	if(acao.equals("3")){
        		// a.getMovimentacoes();
	        	tela = menu.movimentacoes();
        	}

        	// SACAR
        	if(acao.equals("4")){

	  			System.out.print("\033[H\033[2J");
	        	System.out.println(menu.sacar()); 
        		valor = in.nextDouble();
        		a.Saida(valor);
        	}

        	// VOLTAR
        	if(acao.equals("9")){
        		tela = menu.principal();
        	}

        	// SAIR
        	if(acao.equals("0")){
        		break;
        	}

  		}
  		//System.out.println(menu.principal());
		/*Financeiro a = new Financeiro();

		System.out.println("Saldo Atual: ");
		System.out.println(a.getSaldo());

		System.out.println("Lançar uma Entrada: + 0.75");
		a.Entrada(0.75);

		System.out.println("Saldo Atual: ");
		System.out.println(a.getSaldo());

		System.out.println("Lançar uma Despesa: - 4.04");
		a.Saida(4.04);

		System.out.println("Saldo Atual: ");
		System.out.println(a.getSaldo());

		System.out.println("Lançar uma Despesa: - 3.18");
		a.Saida(3.18);

		System.out.println("Saldo Atual: ");
		System.out.println(a.getSaldo());
		System.out.println("\n");


		System.out.println("Movimentações: ");
		System.out.println(a.getMovimentacoes());

		System.out.println("Entradas: ");
		System.out.println(a.getEntradas());

		System.out.println("\n");
		System.out.println("Saídas: ");
		System.out.println(a.getSaidas());

		System.out.println("Saldo Atual: ");
		System.out.println(a.getSaldo());
*/	}
}