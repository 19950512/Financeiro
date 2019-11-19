package Financeiro;

import java.util.*;

public class Cliente {

    private String nomeCliente;

    private boolean fisico;

    private Double adicional;

    private ArrayList<String> nomes = new ArrayList<String>();

    public Double getAdicional(){

        /*
            PORCENTAGEM
            1% = 0.01
            5% = 0.05
            10% = 0.1
            30% = 0.4
            75% = 0.75
            90% = 0.9
        */

        if(fisico){
            adicional = 0.15;
        } else  {
            adicional = 0.03;
        }
        return adicional;
    }

    public String getNomeCliente(int target){
        this.nomes.add("Maria");
        return this.nomes.get(target);
    }

    public void setFisico(boolean fisico){
        this.fisico = fisico;
    }

    public boolean novoCliente(String novoNome){
        this.nomes.add(novoNome);

        // adicionar novas coisas a serem cadastradas sobre o cliente
        return false;
    }

    public int novoClienteID(){
        return nomes.size();
    }
}
