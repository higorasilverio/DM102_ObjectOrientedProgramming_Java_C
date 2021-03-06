package br.inatel.dm102;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

	private String loginCliente;

	private List<Ingresso> ing = new ArrayList<>();

	public CarrinhoDeCompras(String loginCliente) {
		this.loginCliente = loginCliente;
	}

	public void addIngresso(Ingresso ing) {
		this.ing.add(ing);
		ing.mostraInfos();
	}

	public void mostraDetalhesCompras() {
		String ingressos = "";
		for (Ingresso ingresso : ing)
			ingressos += "- N?mero do ingresso: " + ingresso.getNumero() + ", valor do ingresso: R$"
					+ String.format("%.2f", ingresso.calculaTotalIngresso()) + ".\n";
		System.out.println(
				"Carrinho de compras do cliente -> " + this.loginCliente + ":\n" + ingressos
						+ "Valor total da compra: R$"
						+ String.format("%.2f", valorTotalDaCompra()) + "\n");
	}

	private float valorTotalDaCompra() {
		boolean temIngressoKids = false;
		float valorTotalDaCompra = 0.0f;
		for (Ingresso ingresso : this.ing) {
			if (ingresso instanceof Kids)
				temIngressoKids = true;
			valorTotalDaCompra += ingresso.calculaTotalIngresso();
		}
		if (temIngressoKids)
			valorTotalDaCompra = valorTotalDaCompra * 0.5f;
		return valorTotalDaCompra;
	}

}
