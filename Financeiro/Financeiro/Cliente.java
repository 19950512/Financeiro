package Financeiro;

import java.util.*;

public class Cliente {

    private String nomeCliente;

    private boolean fisico;

    private Double adicional;

    private ArrayList<String> nomes = new ArrayList<String>();

    public Double getAdicional(){
        if(fisico){
            adicional = 0.15;
        } else  {
            adicional = 0.3;
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
