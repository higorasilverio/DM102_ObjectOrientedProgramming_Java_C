package br.inatel.dm102;

import java.util.Scanner;

public class ConcertoDeRock {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Banda rock = new Banda();
		rock.genero = "Rock";
		rock.nome = "?pica";
		montaBanda(rock);
		montaRepertorio(rock);
		contrataEmpresario(rock);
		rock.mostraInfosBanda();

	}

	private static void montaBanda(Banda banda) {
		System.out.println("#---------- MONTANDO UMA BANDA DE ROCK ----------#");
		Musico integrante1 = new Musico();
		selecionaIntegrante(banda, integrante1, "Vocalista", "Bruce Dickinson");
		Musico integrante2 = new Musico();
		selecionaIntegrante(banda, integrante2, "Baterista", "Lars Ulrich");
		Musico integrante3 = new Musico();
		selecionaIntegrante(banda, integrante3, "Baixista", "Flea");
		Musico integrante4 = new Musico();
		selecionaIntegrante(banda, integrante4, "Guitarrista", "Joe Perry");
		System.out.println();

	}

	private static void selecionaIntegrante(Banda banda, Musico integrante, String funcao, String nome) {
		integrante.funcao = funcao;
		integrante.nome = nome;
		banda.addMusico(integrante);
		System.out.println("Novo integrante: " + integrante.nome + ", para a fun??o de " + integrante.funcao + ".");

	}

	private static void montaRepertorio(Banda banda) {
		System.out.println("#---------- MONTANDO REPERT?RIO DA BANDA ----------#");
		Musica musica1 = new Musica();
		aprendeMusica(banda, musica1, "The tropper", 4);
		Musica musica2 = new Musica();
		aprendeMusica(banda, musica2, "Fear of the dark", 7);
		Musica musica3 = new Musica();
		aprendeMusica(banda, musica3, "The day that never comes", 8);
		Musica musica4 = new Musica();
		aprendeMusica(banda, musica4, "Now that we're dead", 7);
		Musica musica5 = new Musica();
		aprendeMusica(banda, musica5, "Go robot", 4);
		Musica musica6 = new Musica();
		aprendeMusica(banda, musica6, "Soul to squeeze", 5);
		Musica musica7 = new Musica();
		aprendeMusica(banda, musica7, "The grind", 3);
		Musica musica8 = new Musica();
		aprendeMusica(banda, musica8, "Devil's got a new disguise", 4);
		System.out.println();

	}

	private static void aprendeMusica(Banda banda, Musica musica, String nome, int tempo) {
		musica.nome = nome;
		musica.tempo = tempo;
		banda.addMusica(musica);
		System.out.println("Repert?rio atualizado: " + musica.nome + ", com " + musica.tempo + " min de dura??o.");

	}

	private static void contrataEmpresario(Banda banda) {
		System.out.println("#---------- CONTRATANDO EMPRES?RIO ----------#");
		Empresario empresario = new Empresario();
		empresario.cnpj = 65677404;
		empresario.nome = "Higor Silv?rio";
		banda.empresario = empresario;
		System.out
				.println("Empres?rio contratado: " + banda.empresario.nome + ". CNPJ: " + banda.empresario.cnpj + ".");
		System.out.println();
		
	}

}
