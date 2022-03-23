package gerenciaFrota;

public class Sedan extends VeiculosPasseio {
	public Sedan(String marca, String modelo, String anoFabricacao, String anoModelo,
			String renavam, String capacidadeTanque, String arCondicionado,
			String direcaoHidraulica, String cambioAutomatico) {
		this.marca = marca;
		this.modelo = modelo;
		this.anoFabricacao = anoFabricacao;
		this.anoModelo = anoModelo;
		this.renavam = renavam;
		this.capacidadeTanque = capacidadeTanque;
		this.arCondicionado = arCondicionado;
		this.direcaoHidraulica = direcaoHidraulica;
		this.cambioAutomatico = cambioAutomatico;
	}
}
