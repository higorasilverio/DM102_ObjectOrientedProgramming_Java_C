package br.inatel.dm102;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Lote {

	private static long lotNumberGenerator;
	private long lotNumber;
	private Date dataCriacao;

	private List<Robo> robo = new ArrayList<>();

	public Lote() {
		this.lotNumber = Lote.lotNumberGenerator;
		Lote.lotNumberGenerator++;
	}

	public void mostraRobosLote() {
		System.out.println(
				"Informa??es dos rob?s do lote: " + this.lotNumber + " (" + this.dataCriacao + ")\n");
		if (this.robo.size() > 0)
			for (Robo robot : robo)
				robot.mostraConfigRobo();
		else
			System.out.println("Nenhum rob? associado a este lote!");
	}

	public void setRobo(Robo robo) {
		this.robo.add(robo);
	}

	public void setDataCriacao(Date date) {
		this.dataCriacao = date;
	}

}
