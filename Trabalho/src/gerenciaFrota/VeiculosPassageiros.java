package gerenciaFrota;

public class VeiculosPassageiros extends VeiculosUtilitarios {
	String numeroOcupantes,
			arCondicionado,
			direcaoHidraulica,
			tv;

	public VeiculosPassageiros(String marca, String modelo, String anoFabricacao, String anoModelo,
			String renavam, String capacidadeTanque, String numeroOcupantes, String arCondicionado,
			String direcaoHidraulica, String tv) {
		this.marca = marca;
		this.modelo = modelo;
		this.anoFabricacao = anoFabricacao;
		this.anoModelo = anoModelo;
		this.renavam = renavam;
		this.capacidadeTanque = capacidadeTanque;
		this.numeroOcupantes = numeroOcupantes;
		this.arCondicionado = arCondicionado;
		this.direcaoHidraulica = direcaoHidraulica;
		this.tv = tv;
	}

	public String getNumeroOcupantes() {
		return numeroOcupantes;
	}

	public String getArCondicionado() {
		return arCondicionado;
	}

	public String getDirecaoHidraulica() {
		return direcaoHidraulica;
	}

	public String getTv() {
		return tv;
	}

}
