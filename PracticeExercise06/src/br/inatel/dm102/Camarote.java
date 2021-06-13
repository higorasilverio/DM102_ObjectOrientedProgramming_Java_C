package br.inatel.dm102;

import java.util.Date;

public class Camarote extends Ingresso {

	private String tamanhoCamiseta;

	public Camarote(float valorIngresso, Date dataHoraCompra, String tamanhoCamiseta) {
		super(valorIngresso, dataHoraCompra);
		this.tamanhoCamiseta = tamanhoCamiseta;
	}

	public String getTamanhoCamiseta() {
		return this.tamanhoCamiseta;
	}

}
