
import java.util.*;

import Financeiro.Financeiro;
import Financeiro.Menu;

class Main {

	public static void main(String[] args) {

		String closeBox = "\n--------------------------------------------------------------\n";

        Menu menu = new Menu();
		
        Scanner in = new Scanner(System.in);
		in.useLocale(Locale.ENGLISH);

  		String tela = menu.welcome();

  		Financeiro a = new Financeiro();

  		while(true){

			Double valor = 0d;

  			//System.out.print("\033[H\033[2J");
        	System.out.println(tela);
  			System.out.print("Digite a opcao desejada: ");
        	int acao = in.nextInt();

        	// verificacao de tipo de conta

			if (acao == 1) {
				System.out.print("Pessoa fisica\n");
			}

			else if (acao == 2) {
				System.out.print("Pessoa fisica\n");
			}

			while(true) {

				// Opcoes para usuario ja logado

				System.out.println(menu.principal());
				System.out.print("Digite a opcao desejada: ");
				int opcao = in.nextInt();

				// CONSULTA
				if (opcao == 1) {
					System.out.print(menu.saldo(a.getSaldo()));
				}

				// DEPOSITAR
				else if (opcao == 2) {
					//System.out.print("\033[H\033[2J");
					System.out.println(menu.depositar());
					System.out.print("Depositar valor: ");
					valor = in.nextDouble();
					System.out.print(closeBox);
					a.Entrada(valor);
				}

				// EXTRATOS
				else if (opcao == 3) {
					ArrayList<Double> movimentacoes = a.getMovimentacoes();
					System.out.println(menu.movimentacoes());
					String tipoMov = "";

					for (Double trans : movimentacoes) {
						if(trans > 0){
							tipoMov = " Depositado: ";
						} else if(trans < 0) {
							trans = trans * -1;
							tipoMov = " Retirado: ";
						} else {
							tipoMov = " Movimentacao invalida: ";
						}

						System.out.println(tipoMov + "R$ " + trans);
					}
					System.out.print(closeBox);
				}

				// SACAR
				else if (opcao == 4) {

					Double valorIn = a.getValor();

					//System.out.print("\033[H\033[2J");
					System.out.println(menu.sacar());
					System.out.print(" Sacar valor: ");
					valor = in.nextDouble();
					if(valor > valorIn){
						System.out.println(" Transacao invalida");
					}
					System.out.print(closeBox);
					a.Saida(valor);
				}

				// SAIR
				else if (opcao == 0) {
					break;
				}
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