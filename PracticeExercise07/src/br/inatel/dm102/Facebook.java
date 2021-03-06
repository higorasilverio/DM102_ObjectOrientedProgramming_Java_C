package br.inatel.dm102;

public class Facebook extends RedeSocial implements VideoConferencia, Compartilhamento {

	public Facebook(String senha, int numAmigos) {
		super(senha, numAmigos);
	}

	@Override
	public void compartilhar() {
		System.out.println("*COMPARTILHOU ALGO NO FACEBOOK*");
	}

	@Override
	public void fazStreaming() {
		System.out.println("*FEZ UM STREAMING NO FACEBOOK*");
	}

	@Override
	public void postarFoto() {
		System.out.println("*POSTOU FOTO NO FACEBOOK*");
	}

	@Override
	public void postarVideo() {
		System.out.println("*POSTOU V?DEO NO FACEBOOK*");
	}

	@Override
	public void postarComentario() {
		System.out.println("*POSTOU COMENT?RIO NO FACEBOOK*");
	}

	@Override
	public void curtirPublicacao() {
		System.out.println("*CURTIU PUBLICA??O NO FACEBOOK*");
	}

}
