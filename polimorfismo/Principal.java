package Atividades.polimorfismo;

public class Principal {

	public static void main(String[] args) {
		
		Brinquedo carro = new Carro("Azul", "Carro", 120, "Hrv");
		carro.mover();
		Brinquedo moto = new Moto("Vermelho", "Moto", 80, "Cb300");
		moto.mover();
		Brinquedo navio = new Navio("Branco", "Navio", 40, "Titanic");
		navio.mover();
	}
}

