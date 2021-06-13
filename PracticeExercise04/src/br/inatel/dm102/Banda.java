package br.inatel.dm102;

import java.util.ArrayList;
import java.util.List;

public class Banda {
	public String nome;
	public String genero;

	public Empresario empresario;
	public List<Musico> musicos = new ArrayList<>();
	public List<Musica> musicas = new ArrayList<>();

	public void addMusico(Musico novoMusico) {
		this.musicos.add(novoMusico);
	}

	public void addMusica(Musica novaMusica) {
		this.musicas.add(novaMusica);
	}

	public void mostraInfosBanda() {
		String listaDeArtistas = "Nenhum artista ainda";
		if (this.musicos.size() > 0) {
			listaDeArtistas = "";
			for (Musico artista : this.musicos)
				listaDeArtistas += artista.nome + " (" + artista.funcao + ")" + ", ";
			listaDeArtistas = listaDeArtistas.substring(0, listaDeArtistas.length() - 2);
		}
		String setList = "Nenhuma m�sica ainda";
		if (this.musicas.size() > 0) {
			setList = "";
			for (Musica track : this.musicas)
				setList += track.nome + " (" + track.tempo + " min)" + ", ";
			setList = setList.substring(0, setList.length() - 2);
		}
		String agente = "N�o contratado ainda";
		if (this.empresario.nome != null)
			agente = this.empresario.nome + " (CNPJ: " + this.empresario.cnpj + ")";
		System.out.println("#---------- INFORMA��ES ATUALIZADAS DA BANDA ----------#");
		System.out.println("Banda: " + this.nome + " (" + this.genero + ")");
		System.out.println("M�sicos: " + listaDeArtistas);
		System.out.println("M�sicas: " + setList);
		System.out.println("Empres�rio: " + agente);
	}

}
