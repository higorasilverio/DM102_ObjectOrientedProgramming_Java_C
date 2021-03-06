package br.inatel.dm102;

public class Robo {

	private static long serialNumberGenerator;
	private long serialNumber;

	private Processador processador;
	private Corpo corpo;

	public Robo(boolean temProcessador) {
		if (temProcessador) {
			this.processador = new Processador();
			System.out.println("Robo de custo elevado criado!\n");
		}
		else
			System.out.println("Robo de baixo custo criado!\n");
		this.corpo = new Corpo();
		this.serialNumber = Robo.serialNumberGenerator;
		Robo.serialNumberGenerator++;
	}

	public void mostraConfigRobo() {
		String dadosProcessador = "N/A";
		if (this.processador != null)
			dadosProcessador = this.processador.getMarca() + " (" + this.processador.getFrequenciaProcessamento()
					+ " Mhz)";
		String dadosCorpo = this.corpo.getTipo() + " (" + this.corpo.getCor() + ")";
		System.out.println("N?mero de s?rie: " + this.serialNumber + "\nProcessador: " + dadosProcessador + "\nTipo do corpo: "
				+ dadosCorpo + "\n");

	}

	public Processador getProcessador() {
		return processador;
	}

	public Corpo getCorpo() {
		return corpo;
	}

}
