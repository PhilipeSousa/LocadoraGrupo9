package gerenciaFrota;

public class VeiculosPassageiros extends VeiculosUtilitarios {
	private boolean arCondicionado,
			direcaoHidraulica,
			tv;

	public VeiculosPassageiros(String marca, String modelo, String anoFabricacao, String anoModelo,
			String renavam, float capacidadeTanque, boolean arCondicionado,
			boolean direcaoHidraulica, boolean tv) {
		this.marca = marca;
		this.modelo = modelo;
		this.anoFabricacao = anoFabricacao;
		this.anoModelo = anoModelo;
		this.renavam = renavam;
		this.capacidadeTanque = capacidadeTanque;
		this.arCondicionado = arCondicionado;
		this.direcaoHidraulica = direcaoHidraulica;
		this.tv = tv;
	}

	public boolean getArCondicionado() {
		return arCondicionado;
	}

	public boolean getDirecaoHidraulica() {
		return direcaoHidraulica;
	}

	public boolean getTv() {
		return tv;
	}

}
