package Atividades.associacao;

import Relacoes.associacao.Universidade;

;

public class Cliente {

	private String nome;
	private ContaBancaria contaBancaria;
	
	public Cliente(String nome, ContaBancaria contaBancaria) {
		this.nome = nome;
		this.contaBancaria = contaBancaria;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
}
