package br.inatel.dm102;

import java.util.Date;

public class FabricaDeRobos {

	public static void main(String[] args) {

		Robo robo1 = new Robo(true);
		robo1.getProcessador().setMarca("Intel");
		robo1.getProcessador().setFrequenciaProcessamento(500);
		robo1.getCorpo().setCor("Preto");
		robo1.getCorpo().setTipo("Pernas");

		Robo robo2 = new Robo(false);
		robo2.getCorpo().setCor("Branco");
		robo2.getCorpo().setTipo("Rodas");

		Robo robo3 = new Robo(true);
		robo3.getProcessador().setMarca("AMD");
		robo3.getProcessador().setFrequenciaProcessamento(500);
		robo3.getCorpo().setCor("Inox");
		robo3.getCorpo().setTipo("Esteira");

		Robo robo4 = new Robo(false);
		robo4.getCorpo().setCor("Azul");
		robo4.getCorpo().setTipo("Esférico");
		robo4.mostraConfigRobo();

		Robo robo5 = new Robo(true);
		robo5.getProcessador().setMarca("Intel");
		robo5.getProcessador().setFrequenciaProcessamento(750);
		robo5.getCorpo().setCor("Vermelho");
		robo5.getCorpo().setTipo("Rodas");

		Robo robo6 = new Robo(true);
		robo6.getProcessador().setMarca("AMD");
		robo6.getProcessador().setFrequenciaProcessamento(750);
		robo6.getCorpo().setCor("Amarelo");
		robo6.getCorpo().setTipo("Esférico");

		Lote lote1 = new Lote();
		lote1.setRobo(robo1);
		lote1.setRobo(robo3);
		lote1.setRobo(robo5);
		lote1.setRobo(robo6);
		lote1.setDataCriacao(new Date());
		lote1.mostraRobosLote();

		Lote lote2 = new Lote();
		lote2.setRobo(robo2);
		lote2.setRobo(robo4);
		lote2.setDataCriacao(new Date());
		lote2.mostraRobosLote();

		Lote lote3 = new Lote();
		lote3.setDataCriacao(new Date());
		lote3.mostraRobosLote();

	}

}
