package gerenciaFrota;

public class Motocicletas extends Veiculos {
	private boolean freiosAbs,
			controleTracao,
			pilotoAutomatico;
	private String modoPilotagem;

	public Motocicletas(String marca, String modelo, String anoFabricacao, String anoModelo,
			String renavam, float capacidadeTanque, boolean freiosAbs, boolean controleTracao,
			boolean pilotoAutomatico, String modoPilotagem) {
		this.marca = marca;
		this.modelo = modelo;
		this.anoFabricacao = anoFabricacao;
		this.anoModelo = anoModelo;
		this.renavam = renavam;
		this.capacidadeTanque = capacidadeTanque;
		this.freiosAbs = freiosAbs;
		this.controleTracao = controleTracao;
		this.pilotoAutomatico = pilotoAutomatico;
		this.modoPilotagem = modoPilotagem;
	}

	public boolean getFreiosAbs() {
		return freiosAbs;
	}

	public boolean getControleTracao() {
		return controleTracao;
	}

	public boolean getPilotoAutomatico() {
		return pilotoAutomatico;
	}

	public String getModoPilotagem() {
		return modoPilotagem;
	}
}
