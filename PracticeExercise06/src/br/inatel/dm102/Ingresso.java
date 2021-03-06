package br.inatel.dm102;

import java.util.Date;

public class Ingresso {

	private static long numberGenerator = 0;
	protected static float taxaCartao = 0.05f;

	private long numero;
	protected float valorIngresso;
	protected Date dataHoraCompra;

	public Ingresso(float valorIngresso, Date dataHoraCompra) {
		this.numero = Ingresso.numberGenerator;
		this.valorIngresso = valorIngresso;
		this.dataHoraCompra = dataHoraCompra;
		Ingresso.numberGenerator++;
	}

	public float calculaTotalIngresso() {
		return this.valorIngresso + (this.valorIngresso * Ingresso.taxaCartao);
	}

	public void mostraInfos() {
		String tipo = "";
		String infoAdicional = "";
		if (this instanceof Camarote) {
			tipo = "Camarote";
			infoAdicional = " (Camiseta: " + ((Camarote) this).getTamanhoCamiseta() + ")";
		}
		if (this instanceof VIP)
			if (this instanceof Kids) {
				tipo = "Kids";
				infoAdicional = " (Abada: " + ((VIP) this).tamanhoAbada + ", Documento do resposável: "
						+ ((Kids) this).getDocResponsavel() + ")";
			} else {
				tipo = "VIP";
				infoAdicional = " (Abada: " + ((VIP) this).tamanhoAbada + ")";
			}
		System.out.println("Informações do ingresso adicionado: " + "Tipo: " + tipo + infoAdicional + ", " + "Numero: "
				+ this.numero
				+ ", " + "Valor do ingresso: R$" + String.format("%.2f", this.valorIngresso) + ", " + "Valor pago: R$"
				+ String.format("%.2f", this.calculaTotalIngresso()) + ", " + "Data da inclusão: " + this.dataHoraCompra
				+ ".");
	}

	public long getNumero() {
		return numero;
	}

}
