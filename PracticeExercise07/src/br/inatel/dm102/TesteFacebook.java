package br.inatel.dm102;

public class TesteFacebook {

	public static void main(String[] args) {

		Facebook fb = new Facebook("@Aluno123#fb", 1530);
		System.out.println("Número de amigos: " + fb.numAmigos);
		System.out.println("Senha: " + fb.senha);
		System.out.println("Ações sendo realizadas na rede social Facebook:");
		fb.compartilhar();
		fb.curtirPublicacao();
		fb.fazStreaming();
		fb.postarComentario();
		fb.postarFoto();
		fb.postarVideo();

		Twitter tw = new Twitter("@Aluno123#tw", 5679);
		System.out.println("\nNúmero de amigos: " + tw.numAmigos);
		System.out.println("Senha: " + tw.senha);
		System.out.println("Ações sendo realizadas na rede social Twitter:");
		tw.compartilhar();
		tw.curtirPublicacao();
		tw.postarComentario();
		tw.postarFoto();
		tw.postarVideo();

	}

}
