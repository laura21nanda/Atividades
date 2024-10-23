package Atividades.associacao;

public class Principal {

	public static void main(String[] args) {

		ContaBancaria banco = new ContaBancaria ("Bradesco", 2000);
		
		Cliente cliente = new Cliente("João", banco);
		
		System.out.println("Cliente :" + cliente.getNome()+ "\nConta bancaria: " + banco.getNome());
	}
}
