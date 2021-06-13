package br.inatel.dm102;

public class Twitter extends RedeSocial implements Compartilhamento {

	public Twitter(String senha, int numAmigos) {
		super(senha, numAmigos);
	}

	@Override
	public void compartilhar() {
		System.out.println("*COMPARTILHOU ALGO NO TWITTER*");
	}

	@Override
	public void postarFoto() {
		System.out.println("*POSTOU FOTO NO TWITTER*");
	}

	@Override
	public void postarVideo() {
		System.out.println("*POSTOU VÍDEO NO TWITTER*");
	}

	@Override
	public void postarComentario() {
		System.out.println("*POSTOU COMENTÁRIO NO TWITTER*");
	}

	@Override
	public void curtirPublicacao() {
		System.out.println("*CURTIU PUBLICAÇÃO NO TWITTER*");
	}

}
