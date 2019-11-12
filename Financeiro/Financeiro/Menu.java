
package Financeiro;

public class Menu {

	public static String principal(){

		String menu = "";
		menu += "--------------------------------------------------------------\n";
		menu += "|                 ..::'  I N Í C I O  '::..                  |\n";
		menu += "--------------------------------------------------------------\n";
		menu += "| 1) Consultar Saldo                                         |\n";
		menu += "| 2) Depositar                                               |\n";
		menu += "| 3) Extratos                                                |\n";
		menu += "| 4) Sacar                                                   |\n";
		menu += "| 0) Sair                                                    |\n";
		menu += "--------------------------------------------------------------\n";


		return menu;
	}

	public static String saldo(Double saldo){

		String menu = "";
		menu += "--------------------------------------------------------------\n";
		menu += "|                  ..::'  S A L D O  '::..                   |\n";
		menu += "--------------------------------------------------------------\n";
		menu += "|                                                            |\n";
		menu += "| Saldo disponível: " + saldo + "                             \n";
		menu += "|                                                            |\n";
		menu += "| 9) Voltar                                                  |\n";
		menu += "--------------------------------------------------------------\n";

		return menu;
	}

	public static String depositar(){

		String menu = "";
		menu += "--------------------------------------------------------------\n";
		menu += "|              ..::'  D E P O S I T A R  '::..               |\n";
		menu += "--------------------------------------------------------------\n";
		menu += "|                                                            |\n";
		menu += "| Depositar valor:                                           |\n";
		menu += "|                                                            |\n";
		menu += "|                                                            |\n";
		menu += "--------------------------------------------------------------\n";

		return menu;
	}

	public static String sacar(){

		String menu = "";
		menu += "--------------------------------------------------------------\n";
		menu += "|                 ..::'  S A C A R  '::..                    |\n";
		menu += "--------------------------------------------------------------\n";
		menu += "|                                                            |\n";
		menu += "| Sacar valor:                                               |\n";
		menu += "|                                                            |\n";
		menu += "|                                                            |\n";
		menu += "--------------------------------------------------------------\n";

		return menu;
	}

	public static String movimentacoes(){

		String menu = "";
		menu += "--------------------------------------------------------------\n";
		menu += "|                ..::'  E X T R A T O  '::..                 |\n";
		menu += "--------------------------------------------------------------\n";
		menu += "|                                                            |\n";
		menu += "|  aqui é movimentacoes                                      |\n";
		menu += "--------------------------------------------------------------\n";

		return menu;
	}

	public static String login(){

		String menu = "";
		menu += "--------------------------------------------------------------\n";
		menu += "|              ..::'  B E M  -  V I N D O  '::..             |\n";
		menu += "--------------------------------------------------------------\n";
		menu += "| 1) Pessoa Física                                           |\n";
		menu += "| 2) Pessoa Jurídica                                         |\n";

		return menu;
	}
}