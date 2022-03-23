package gerenciaFrota;

public class Motocicletas extends Veiculos {
	String freiosAbs,
			controleTracao,
			pilotoAutomatico,
			modoPilotagem;

	public Motocicletas(String marca, String modelo, String anoFabricacao, String anoModelo,
			String renavam, String capacidadeTanque, String freiosAbs, String controleTracao,
			String pilotoAutomatico, String modoPilotagem) {
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

	public String getFreiosAbs() {
		return freiosAbs;
	}

	public String getControleTracao() {
		return controleTracao;
	}

	public String getPilotoAutomatico() {
		return pilotoAutomatico;
	}

	public String getModoPilotagem() {
		return modoPilotagem;
	}
}
