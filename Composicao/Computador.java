package Atividades.Composicao;

import Relacoes.Composicao.Coracao;

public class Computador {

	private String modelo;
	private Processador processador;
	
	public Computador(String modelo, Processador processador) {
		this.modelo = modelo;
		this.processador = new processador(processador);
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public int getCoracao() {
		return coracao.getBatimento(){
		}
	}
}
}
