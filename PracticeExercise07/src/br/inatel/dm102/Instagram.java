package br.inatel.dm102;

public class Instagram extends RedeSocial {

	public Instagram(String senha, int numAmigos) {
		super(senha, numAmigos);
	}

	@Override
	public void postarFoto() {
		System.out.println("*POSTOU FOTO NO INSTAGRAM*");
	}

	@Override
	public void postarVideo() {
		System.out.println("*POSTOU V�DEO NO INSTAGRAM*");
	}

	@Override
	public void postarComentario() {
		System.out.println("*POSTOU COMENT�RIO NO INSTAGRAM*");
	}

	@Override
	public void curtirPublicacao() {
		System.out.println("*CURTIU PUBLICA��O NO INSTAGRAM*");
	}

}
