package br.inatel.dm102;

import java.util.Date;

public class Kids extends VIP {

	private String docResponsavel;

	public Kids(float valorIngresso, Date dataHoraCompra, String tamanhoAbada, String docResponsavel) {
		super(valorIngresso, dataHoraCompra, tamanhoAbada);
		this.docResponsavel = docResponsavel;
	}

	public String getDocResponsavel() {
		return docResponsavel;
	}

}
