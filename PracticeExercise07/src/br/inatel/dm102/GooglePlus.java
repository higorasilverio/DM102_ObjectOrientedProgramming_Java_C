package br.inatel.dm102;

public class GooglePlus extends RedeSocial implements VideoConferencia, Compartilhamento {

	public GooglePlus(String senha, int numAmigos) {
		super(senha, numAmigos);
	}

	@Override
	public void compartilhar() {
		System.out.println("*COMPARTILHOU ALGO NO GOOGLEPLUS*");
	}

	@Override
	public void fazStreaming() {
		System.out.println("*FEZ UM STREAMING NO GOOGLEPLUS*");
	}

	@Override
	public void postarFoto() {
		System.out.println("*POSTOU FOTO NO GOOGLEPLUS*");
	}

	@Override
	public void postarVideo() {
		System.out.println("*POSTOU VÍDEO NO GOOGLEPLUS*");
	}

	@Override
	public void postarComentario() {
		System.out.println("*POSTOU COMENTÁRIO NO GOOGLEPLUS*");
	}

	@Override
	public void curtirPublicacao() {
		System.out.println("*CURTIU PUBLICAÇÃO NO GOOGLEPLUS*");
	}

}
