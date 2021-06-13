package br.inatel.dm102;

public class Kart {

	public String nome;
	public Motor motor;
	public Piloto piloto;
	public Jogador jogador;

	public Kart() {
		this.motor = new Motor();
	}

	public void pular() {
		System.out.println("Pulou! 'Blup'");
	}

	public void soltarTurbo() {
		System.out.println("Ativou turbo! 'Vruuaaum'");
	}

	public void fazerDrift() {
		System.out.println("Executou drift! 'Ziiuupp'");
	}

	public void mostrarinfosKart() {
		if (this.motor != null && this.piloto != null && this.jogador != null) {
			String cilindradas = this.motor.cilindradas == null ? "0" : this.motor.cilindradas;
			String papel = this.piloto.vilao == true ? "vil�o" : "mocinho";
			System.out.println(this.jogador.nome.toUpperCase() + ":\n" + "O kart " + this.nome.toUpperCase()
					+ ", com "
					+ cilindradas + " cilindradas e velocidade m�xima de " + this.motor.velocidadeMax
					+ " Km/h, � pilotado pelo " + papel + " " + this.piloto.nome.toUpperCase() + "!\n");
		}
	}
}
