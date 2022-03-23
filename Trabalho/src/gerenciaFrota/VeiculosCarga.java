package gerenciaFrota;

public class VeiculosCarga extends VeiculosUtilitarios {
	String pesoMaximo,
			taraVeiculo,
			compartimentoCarga,
			tipoCompartimento;

	public VeiculosCarga(String marca, String modelo, String anoFabricacao, String anoModelo,
			String renavam, String capacidadeTanque, String pesoMaximo, String taraVeiculo,
			String compartimentoCarga, String tipoCompartimento) {
		this.marca = marca;
		this.modelo = modelo;
		this.anoFabricacao = anoFabricacao;
		this.anoModelo = anoModelo;
		this.renavam = renavam;
		this.capacidadeTanque = capacidadeTanque;
		this.pesoMaximo = pesoMaximo;
		this.taraVeiculo = taraVeiculo;
		this.compartimentoCarga = compartimentoCarga;
		this.tipoCompartimento = tipoCompartimento;
	}

	public String getPesoMaximo() {
		return pesoMaximo;
	}

	public String getTaraVeiculo() {
		return taraVeiculo;
	}

	public String getCompartimentoCarga() {
		return compartimentoCarga;
	}

	public String getTipoCompartimento() {
		return tipoCompartimento;
	}
}
