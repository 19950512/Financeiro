
import java.util.*;
import java.io.IOException;


import Financeiro.Financeiro;
import Financeiro.Menu;
import Financeiro.Cliente;

class Main {

	public static void main(String[] args) {

		limpaTerminal();
		String closeBox = "\n--------------------------------------------------------------\n";

        Menu menu = new Menu();
		
        Scanner in = new Scanner(System.in);
		in.useLocale(Locale.ENGLISH);

  		Financeiro a = new Financeiro();

  		Cliente b = new Cliente();

  		String cliente = null;

  		while(true){

			Double valor = 0d;

        	System.out.println(menu.tipoConta());
  			System.out.print("Digite a opcao desejada: ");
        	int acao = in.nextInt();
			limpaTerminal();

        	// verificacao de tipo de conta
			b.setFisico(false);
			if (acao == 1) {
				b.setFisico(true);
			}

			System.out.println(menu.login());
			System.out.println(" 1 - ja sou cliente\n 2 - criar conta\n");
			System.out.print("opcao: ");
			int opLogar = in.nextInt();

			limpaTerminal();
			if(opLogar == 1) {
				// logar cliente ja cadastrado

				System.out.println(menu.login());
				System.out.print("Informe seu ID para Logar: ");
				int indentificacao = in.nextInt();
				cliente = b.getNomeCliente(indentificacao);

			} else if(opLogar == 2){
				// cadastrar novo cliente

				System.out.println(menu.login());
				System.out.print("Informe seu nome: ");
				String novoNome = in.nextLine();
				b.novoCliente(novoNome);
				System.out.println();
				System.out.println("Bem Vindo " + novoNome);
				System.out.println("Seu ID: " + b.novoClienteID() + "\n");
			}
			
			limpaTerminal();
			System.out.println(menu.boasvindas(cliente));
			
			while(true) {

				// Opcoes para usuario ja logado
				System.out.println(menu.principal());
				System.out.print("Digite a opcao desejada: ");
				int opcao = in.nextInt();

				// CONSULTA
				if (opcao == 1) {
					limpaTerminal();
					System.out.print(menu.saldo(a.getSaldo()));
				}

				// DEPOSITAR
				else if (opcao == 2) {
					limpaTerminal();
					System.out.println(menu.depositar());
					System.out.print("Depositar valor: ");
					valor = in.nextDouble();
					System.out.print(closeBox);
					a.Entrada(valor);
				}

				// EXTRATOS
				else if (opcao == 3) {
					limpaTerminal();
					ArrayList<Double> movimentacoes = a.getMovimentacoes();
					System.out.println(menu.movimentacoes());
					System.out.println(" Mostrando Extrato de " + cliente + ":");
					System.out.println(" Custo de uso: " + (b.getAdicional() * 100) + "%");
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

					limpaTerminal();
					Double valorIn = a.getValor();
					
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
					limpaTerminal();
					break;
				}
			}
  		}
  	}
	
	public static void limpaTerminal(){
		System.out.print("\033[H\033[2J");  
		System.out.flush(); 
	}
}