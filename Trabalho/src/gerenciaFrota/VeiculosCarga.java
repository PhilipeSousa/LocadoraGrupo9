package gerenciaFrota;

public class VeiculosCarga extends VeiculosUtilitarios {
	private float taraVeiculo,
			tamCompartimento;
	private String tipoCompartimento;

	public VeiculosCarga(String marca, String modelo, String anoFabricacao, String anoModelo,
			String renavam, float capacidadeTanque, float taraVeiculo,
			float tamCompartimento, String tipoCompartimento) {
		this.marca = marca;
		this.modelo = modelo;
		this.anoFabricacao = anoFabricacao;
		this.anoModelo = anoModelo;
		this.renavam = renavam;
		this.capacidadeTanque = capacidadeTanque;
		this.taraVeiculo = taraVeiculo;
		this.tamCompartimento = tamCompartimento;
		this.tipoCompartimento = tipoCompartimento;
	}

	public float getTaraVeiculo() {
		return taraVeiculo;
	}

	public float getTamCompartimento() {
		return tamCompartimento;
	}

	public String getTipoCompartimento() {
		return tipoCompartimento;
	}
}
