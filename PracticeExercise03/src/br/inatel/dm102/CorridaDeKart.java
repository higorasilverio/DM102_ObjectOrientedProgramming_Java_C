package br.inatel.dm102;

import java.util.Scanner;

public class CorridaDeKart {

	public static Scanner sc = new Scanner(System.in);
	public static String cilindradas;

	public static void main(String[] args) throws InterruptedException {
		Kart kart1 = new Kart();
		Kart kart2 = new Kart();
		configuraCilindradas();
		configuraKarts(kart1, kart2);
		configuraPilotos(kart1, kart2);
		selecaoKart(kart1, kart2);
		kart1.mostrarinfosKart();
		kart2.mostrarinfosKart();
		iniciaCorrida(kart1, kart2);
		defineVencedor(kart1, kart2);
	}

	private static void configuraCilindradas() {
		System.out.println("###----------###   Configuração das cilindradas!   ###----------###\n");
		System.out.print("Quais as cilindradas do motor nesta competição (50 / 100 / 150)? ");
		cilindradas = sc.nextLine();
	}

	private static void configuraKarts(Kart kart1, Kart kart2) {
		System.out.println("\n###----------###   Configuração dos karts   ###----------###\n");
		criarKart(kart1, "Azulzão");
		criarKart(kart2, "Vermelhão");
	}

	private static void criarKart(Kart kart, String nomeKart) {
		kart.nome = nomeKart;
		kart.motor.cilindradas = cilindradas.equalsIgnoreCase("50") || cilindradas.equalsIgnoreCase("100")
				|| cilindradas.equalsIgnoreCase("150") ? cilindradas : null;
		System.out.print("Entre com a velocidade máxima (Km) do kart " + nomeKart + " (menor que 150): ");
		int velocidadeMax = sc.nextInt();
		sc.nextLine();
		kart.motor.velocidadeMax = velocidadeMax >= 0 && velocidadeMax <= 150 ? velocidadeMax : 0;
	}

	private static void configuraPilotos(Kart kart1, Kart kart2) {
		System.out.println("\n###----------###   Configuração dos Pilotos   ###----------###\n");
		Piloto piloto1 = new Piloto();
		criaPiloto(piloto1, kart1);
		Piloto piloto2 = new Piloto();
		criaPiloto(piloto2, kart2);
	}

	private static void criaPiloto(Piloto piloto, Kart kart) {
		System.out.print("Entre com o nome do piloto do kart " + kart.nome + ": ");
		piloto.nome = sc.nextLine();
		System.out.print("Piloto será vilão na corrida (Sim / Não): ");
		piloto.vilao = sc.nextLine().equalsIgnoreCase("Sim");
		kart.piloto = piloto;
	}

	private static void selecaoKart(Kart kart1, Kart kart2) {
		System.out.println("\n###----------###   Seleção de kart pelos jogadores   ###----------###\n");
		Jogador jogador1 = new Jogador();
		jogador1.nome = "Player 1";
		Jogador jogador2 = new Jogador();
		jogador2.nome = "Player 2";
		System.out.print(jogador1.nome + ": Selecione o kart para jogar (1 - Azulzão, 2 - Vermelhão): ");
		int selecionado = sc.nextInt();
		if (selecionado == 1) {
			kart1.jogador = jogador1;
			kart2.jogador = jogador2;
		} else {
			kart1.jogador = jogador2;
			kart2.jogador = jogador1;
		}
		System.out.println();
	}

	private static void iniciaCorrida(Kart kart1, Kart kart2) throws InterruptedException {
		new Thread();
		Thread.sleep(500);
		System.out.println("###----------###   A corrida se inicia!   ###----------###");
		Thread.sleep(1000);
		System.out.println("\nO " + kart1.nome.toUpperCase() + " encontrou um obstáculo e vai precisar pula-lo!");
		kart1.pular();
		Thread.sleep(500);
		System.out.println("\nOs competidores se estranham na reta... Ambos executaram seus poderes especiais!");
		kart1.piloto.soltaPoder();
		kart2.piloto.soltaPoder();
		Thread.sleep(500);
		System.out.println("\nO " + kart2.nome.toUpperCase() + " parece estar ficando para trás e vai ativar o turbo!");
		kart2.soltarTurbo();
		Thread.sleep(500);
		System.out.println("\nAmbos os karts entraram muito rápido na curva... ai vem o drift!");
		kart1.fazerDrift();
		kart2.fazerDrift();
		Thread.sleep(500);
		System.out.println();
	}

	private static void defineVencedor(Kart kart1, Kart kart2) {
		int[] desempenho = new int[2];
		desempenho[0] = cilindradas != null ? Integer.parseInt(cilindradas) * kart1.motor.velocidadeMax : 0;
		desempenho[1] = cilindradas != null ? Integer.parseInt(cilindradas) * kart2.motor.velocidadeMax : 0;
		if (desempenho[0] >= desempenho[1])
			System.out.println(kart1.nome.toUpperCase() + " prevalece sobre " + kart2.nome.toUpperCase() + " e "
					+ kart1.piloto.nome.toUpperCase() + " vence a corrida!");
		else
			System.out.println(kart2.nome.toUpperCase() + " prevalece sobre " + kart1.nome.toUpperCase() + " e "
					+ kart2.piloto.nome.toUpperCase() + " vence a corrida!");
		sc.close();
	}

}
