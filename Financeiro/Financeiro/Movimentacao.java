package Financeiro;

import java.util.*;

public class Movimentacao {

	private String tipo;

	private int parcelas;

	private Double valor = 0d;

	private ArrayList<Double> movimentacoes = new ArrayList<Double>();
	private ArrayList<Double> entradas = new ArrayList<Double>();
	private ArrayList<Double> saidas = new ArrayList<Double>();

	public boolean Entrada(Double valor){
		this.entradas.add(valor);
		this.movimentacoes.add(valor);
		this.setValor(valor);
		return false;
	}

	public boolean Saida(Double valor){
		valor = valor * -1;

		this.saidas.add(valor);
		this.movimentacoes.add(valor);
		this.setValor(valor);
		return false;
	}

	// GETTERS
	public Boolean setValor(Double valor){
		this.valor = this.valor + valor;
		return false;
	}

	public ArrayList getMovimentacoes(){
		return this.movimentacoes;
	}
	public ArrayList getEntradas(){
		return this.entradas;
	}
	public ArrayList getSaidas(){
		return this.saidas;
	}
	public Double getValor(){
		return this.valor;
	}
}