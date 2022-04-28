package gerenciaFrota;

import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;

public class Veiculos {
	protected static String marca,
			modelo,
			anoFabricacao,
			anoModelo,
			renavam,
			modoPilotagem;
	protected static boolean freiosAbs, controleTracao, pilotoAutomatico;
	protected static float capacidadeTanque;
	Diaria diaria;

	static List<Veiculos> veiculos = new LinkedList<Veiculos>();
	static Motocicletas motocicleta = new Motocicletas(marca, modelo, anoFabricacao, anoModelo, renavam,
			capacidadeTanque, freiosAbs, controleTracao, pilotoAutomatico, modoPilotagem);

	public static boolean cadastrarVeiculo(Motocicletas motocicleta, VeiculosUtilitarios veiculoUtilitario,
			VeiculosPassageiros veiculosPassageiro, String escolha) {

		boolean resposta = false;

		if (escolha.equals("M")) {
			resposta = veiculos.add(motocicleta);
			JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
		}
		// } else if (escolha.equals("U")) {
		// resposta = veiculos.add(veiculoUtilitario);
		// JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
		// } else {
		// JOptionPane.showMessageDialog(null, "Valor invalido");
		// }

		return resposta;

	}

	public static void cadastrarMotocicleta() { // FAZER O IF DOS BOOLEANS
		Veiculos.marca = JOptionPane.showInputDialog("Marca: ");
		Veiculos.modelo = JOptionPane.showInputDialog("Modelo: ");
		Veiculos.anoFabricacao = JOptionPane.showInputDialog("Ano de fabricacao: ");
		Veiculos.anoModelo = JOptionPane.showInputDialog("Ano do modelo: ");
		Veiculos.renavam = JOptionPane.showInputDialog("Renavam: ");
		Veiculos.capacidadeTanque = Float
				.parseFloat(JOptionPane.showInputDialog("Capacidade do tanque de combustivel: "));
		Veiculos.freiosAbs = Boolean.parseBoolean(JOptionPane.showInputDialog("Possui freios Abs? "));
		Veiculos.controleTracao = Boolean.parseBoolean(JOptionPane.showInputDialog("Possui controle de tracao? "));
		Veiculos.pilotoAutomatico = Boolean.parseBoolean(JOptionPane.showInputDialog("Possui piloto automatico? "));
		Veiculos.modoPilotagem = JOptionPane.showInputDialog("Modo de pilotagem: ");
		motocicleta = new Motocicletas(marca, modelo, anoFabricacao, anoModelo, renavam, capacidadeTanque,
				freiosAbs, controleTracao, pilotoAutomatico, modoPilotagem);
		cadastrarVeiculo(motocicleta, null, null, "M");

	}

	// public static void cadastrarVeiculosPassageiros() {
	// String marca = JOptionPane.showInputDialog("Marca: ");
	// String modelo = JOptionPane.showInputDialog("Modelo: ");
	// String anoFabricacao = JOptionPane.showInputDialog("Ano de fabricacao: ");
	// String anoModelo = JOptionPane.showInputDialog("Ano do modelo: ");
	// String renavam = JOptionPane.showInputDialog("Renavam: ");
	// String capacidadeTanque = JOptionPane.showInputDialog("Capacidade do tanque
	// de combustivel: ");
	// String numeroOcupantes = JOptionPane.showInputDialog("Numero de ocupantes:
	// ");
	// String arCondicionado = JOptionPane.showInputDialog("Possui ar-condicionado?
	// ");
	// String direcaoHidraulica = JOptionPane.showInputDialog("Possui direcao
	// hidraulica? ");
	// String tv = JOptionPane.showInputDialog("Possui tv? ");
	// VeiculosPassageiros veicPas = new VeiculosPassageiros(marca, modelo,
	// anoFabricacao, anoModelo, renavam,
	// capacidadeTanque, numeroOcupantes, arCondicionado, direcaoHidraulica, tv);
	// cadastrarVeiculo(veicPas);
	// }

	// public static void cadastrarVeiculosCarga() {

	// String marca = JOptionPane.showInputDialog("Marca: ");
	// String modelo = JOptionPane.showInputDialog("Modelo: ");
	// String anoFabricacao = JOptionPane.showInputDialog("Ano de fabricacao: ");
	// String anoModelo = JOptionPane.showInputDialog("Ano do modelo: ");
	// String renavam = JOptionPane.showInputDialog("Renavam: ");
	// String capacidadeTanque = JOptionPane.showInputDialog("Capacidade do tanque
	// de combustivel: ");
	// String pesoMaximo = JOptionPane.showInputDialog("Peso maximo: ");
	// String taraVeiculo = JOptionPane.showInputDialog("Tara do veiculo: ");
	// String compartimentoCarga = JOptionPane.showInputDialog("Compartimento de
	// carga: ");
	// String tipoCompartimento = JOptionPane.showInputDialog("Tipo do
	// compartimento: ");
	// VeiculosCarga veicCar = new VeiculosCarga(marca, modelo, anoFabricacao,
	// anoModelo, renavam, capacidadeTanque,
	// pesoMaximo, taraVeiculo, compartimentoCarga, tipoCompartimento);
	// cadastrarVeiculo(veicCar);

	// }

	// public static void cadastrarCompactoLuxo() {

	// String marca = JOptionPane.showInputDialog("Marca: ");
	// String modelo = JOptionPane.showInputDialog("Modelo: ");
	// String anoFabricacao = JOptionPane.showInputDialog("Ano de fabricacao: ");
	// String anoModelo = JOptionPane.showInputDialog("Ano do modelo: ");
	// String renavam = JOptionPane.showInputDialog("Renavam: ");
	// String capacidadeTanque =
	// JOptionPane.showInputDialog("Capacidade do tanque de combust�vel: ");
	// String arCondicionado =
	// JOptionPane.showInputDialog("Possui ar-condicionado? ");
	// String direcaoHidraulica =
	// JOptionPane.showInputDialog("Possui direcao hidraulica? ");
	// String cambioAutomatico =
	// JOptionPane.showInputDialog("Possui cambio automatico? ");
	// CompactoLuxo compLuxo = new CompactoLuxo(marca, modelo, anoFabricacao,
	// anoModelo, renavam, capacidadeTanque,
	// arCondicionado, direcaoHidraulica, cambioAutomatico);
	// cadastrarVeiculo(compLuxo);

	// public static void cadastrarCompacto() {

	// String marca = JOptionPane.showInputDialog("Marca: ");
	// String modelo = JOptionPane.showInputDialog("Modelo: ");
	// String anoFabricacao = JOptionPane.showInputDialog("Ano de fabrica��o: ");
	// String anoModelo = JOptionPane.showInputDialog("Ano do modelo: ");
	// String renavam = JOptionPane.showInputDialog("Renavam: ");
	// String capacidadeTanque = JOptionPane.showInputDialog("Capacidade do tanque
	// de combustivel: ");
	// String arCondicionado = JOptionPane.showInputDialog("Possui ar-condicionado?
	// ");
	// String direcaoHidraulica = JOptionPane.showInputDialog("Possui direcao
	// hidraulica? ");
	// String cambioAutomatico = JOptionPane.showInputDialog("Possui cambio
	// automatico? ");
	// Compacto comp = new Compacto(marca, modelo, anoFabricacao, anoModelo,
	// renavam, capacidadeTanque, arCondicionado,
	// direcaoHidraulica, cambioAutomatico);
	// cadastrarVeiculo(comp);

	// }

	// public static void cadastrarSuvs() {

	// String marca = JOptionPane.showInputDialog("Marca: ");
	// String modelo = JOptionPane.showInputDialog("Modelo: ");
	// String anoFabricacao = JOptionPane.showInputDialog("Ano de fabrica��o: ");
	// String anoModelo = JOptionPane.showInputDialog("Ano do modelo: ");
	// String renavam = JOptionPane.showInputDialog("Renavam: ");
	// String capacidadeTanque = JOptionPane.showInputDialog("Capacidade do tanque
	// de combustivel: ");
	// String arCondicionado = JOptionPane.showInputDialog("Possui ar-condicionado?
	// ");
	// String direcaoHidraulica = JOptionPane.showInputDialog("Possui direcao
	// hidraulica? ");
	// String cambioAutomatico = JOptionPane.showInputDialog("Possui cambio
	// automatico? ");
	// Suvs suv = new Suvs(marca, modelo, anoFabricacao, anoModelo, renavam,
	// capacidadeTanque, arCondicionado,
	// direcaoHidraulica, cambioAutomatico);
	// cadastrarVeiculo(suv);

	// }

	// public static void cadastrarSedan() {

	// String marca = JOptionPane.showInputDialog("Marca: ");
	// String modelo = JOptionPane.showInputDialog("Modelo: ");
	// String anoFabricacao = JOptionPane.showInputDialog("Ano de fabrica��o: ");
	// String anoModelo = JOptionPane.showInputDialog("Ano do modelo: ");
	// String renavam = JOptionPane.showInputDialog("Renavam: ");
	// String capacidadeTanque = JOptionPane.showInputDialog("Capacidade do tanque
	// de combust�vel: ");
	// String arCondicionado = JOptionPane.showInputDialog("Possui ar-condicionado?
	// ");
	// String direcaoHidraulica = JOptionPane.showInputDialog("Possui dire��o
	// hidr�ulica? ");
	// String cambioAutomatico = JOptionPane.showInputDialog("Possui c�mbio
	// autom�tico? ");
	// Sedan sed = new Sedan(marca, modelo, anoFabricacao, anoModelo, renavam,
	// capacidadeTanque, arCondicionado,
	// direcaoHidraulica, cambioAutomatico);
	// cadastrarVeiculo(sed);

	// }

	// public static void cadastrarVeiculoPasseio() {
	// // Implementar o m�todo cadastro de ve�culos de passeio
	// }

	// public static void cadastrarVeiculosUtilitarios() {
	// // Implementar o m�todo cadastro de ve�culos utilit�rios
	// }

	// public static void imprimirLocatario() {
	// for (int x = 0; x < veic.length; x++) {
	// if (veic[x] instanceof Motocicletas) {
	// Motocicletas temp = (Motocicletas) veic[x];
	// String resposta = veic[x].getMarca() + "\n" +
	// veic[x].getModelo() + "\n" +
	// veic[x].getAnoFabricacao() + "\n" +
	// veic[x].getAnoModelo() + "\n" +
	// veic[x].getRenavam() + "\n" +
	// veic[x].getCapacidadeTanque() + "\n" +
	// temp.getControleTracao() + "\n" +
	// temp.getFreiosAbs() + "\n" +
	// temp.getPilotoAutomatico() + "\n" +
	// temp.getModoPilotagem();
	// JOptionPane.showMessageDialog(null, resposta);

	// } else if (veic[x] instanceof VeiculosPassageiros) {
	// VeiculosPassageiros temp = (VeiculosPassageiros) veic[x];
	// String resposta = veic[x].getMarca() + "\n" +
	// veic[x].getModelo() + "\n" +
	// veic[x].getAnoFabricacao() + "\n" +
	// veic[x].getAnoModelo() + "\n" +
	// veic[x].getRenavam() + "\n" +
	// veic[x].getCapacidadeTanque() + "\n" +
	// temp.getNumeroOcupantes() + "\n" +
	// temp.getArCondicionado() + "\n" +
	// temp.getDirecaoHidraulica() + "\n" +
	// temp.getTv();
	// JOptionPane.showMessageDialog(null, resposta);

	// } else if (veic[x] instanceof VeiculosCarga) {
	// VeiculosCarga temp = (VeiculosCarga) veic[x];
	// String resposta = veic[x].getMarca() + "\n" +
	// veic[x].getModelo() + "\n" +
	// veic[x].getAnoFabricacao() + "\n" +
	// veic[x].getAnoModelo() + "\n" +
	// veic[x].getRenavam() + "\n" +
	// veic[x].getCapacidadeTanque() + "\n" +
	// temp.getPesoMaximo() + "\n" +
	// temp.getTaraVeiculo() + "\n" +
	// temp.getCompartimentoCarga() + "\n" +
	// temp.getTipoCompartimento();
	// JOptionPane.showMessageDialog(null, resposta);

	// } else if (veic[x] instanceof CompactoLuxo) {
	// CompactoLuxo temp = (CompactoLuxo) veic[x];
	// String resposta = veic[x].getMarca() + "\n" +
	// veic[x].getModelo() + "\n" +
	// veic[x].getAnoFabricacao() + "\n" +
	// veic[x].getAnoModelo() + "\n" +
	// veic[x].getRenavam() + "\n" +
	// veic[x].getCapacidadeTanque() + "\n" +
	// temp.getArCondicionado() + "\n" +
	// temp.getDirecaoHidraulica() + "\n" +
	// temp.getCambioAutomatico() + "\n";
	// JOptionPane.showMessageDialog(null, resposta);

	// } else if (veic[x] instanceof Compacto) {
	// Compacto temp = (Compacto) veic[x];
	// String resposta = veic[x].getMarca() + "\n" +
	// veic[x].getModelo() + "\n" +
	// veic[x].getAnoFabricacao() + "\n" +
	// veic[x].getAnoModelo() + "\n" +
	// veic[x].getRenavam() + "\n" +
	// veic[x].getCapacidadeTanque() + "\n" +
	// temp.getArCondicionado() + "\n" +
	// temp.getDirecaoHidraulica() + "\n" +
	// temp.getCambioAutomatico() + "\n";
	// JOptionPane.showMessageDialog(null, resposta);

	// } else if (veic[x] instanceof Suvs) {
	// Suvs temp = (Suvs) veic[x];
	// String resposta = veic[x].getMarca() + "\n" +
	// veic[x].getModelo() + "\n" +
	// veic[x].getAnoFabricacao() + "\n" +
	// veic[x].getAnoModelo() + "\n" +
	// veic[x].getRenavam() + "\n" +
	// veic[x].getCapacidadeTanque() + "\n" +
	// temp.getArCondicionado() + "\n" +
	// temp.getDirecaoHidraulica() + "\n" +
	// temp.getCambioAutomatico() + "\n";
	// JOptionPane.showMessageDialog(null, resposta);

	// } else if (veic[x] instanceof Sedan) {
	// Sedan temp = (Sedan) veic[x];
	// String resposta = veic[x].getMarca() + "\n" +
	// veic[x].getModelo() + "\n" +
	// veic[x].getAnoFabricacao() + "\n" +
	// veic[x].getAnoModelo() + "\n" +
	// veic[x].getRenavam() + "\n" +
	// veic[x].getCapacidadeTanque() + "\n" +
	// temp.getArCondicionado() + "\n" +
	// temp.getDirecaoHidraulica() + "\n" +
	// temp.getCambioAutomatico() + "\n";
	// JOptionPane.showMessageDialog(null, resposta);
	// }
	// }

	// }

	public static boolean pesquisarVeiculosRenavam() {
		boolean resposta = false;

		String esc = JOptionPane.showInputDialog(null, "Buscar veiculo por renavam: ");
		for (Veiculos veiculo : veiculos) {
			if (veiculo.getRenavam().equals(esc)) {
				JOptionPane.showMessageDialog(null, "Encontrado cadastro de veiculo:\nMarca: " + veiculo.getMarca() +
						"\nModelo: " + veiculo.getModelo() + "\nRenavam: " + veiculo.getRenavam());
				resposta = true;
			}
		}

		if (resposta == false) {
			JOptionPane.showMessageDialog(null, "Nao Encontrado");
		}

		return resposta;
	}

	public static boolean pesquisarVeiculosMarcaModeloRen() {
		boolean resposta = false;

		String esc = JOptionPane.showInputDialog(null, "Buscar veiculo por marca, modelo ou renavam: ");
		for (Veiculos veiculo : veiculos) {
			if (veiculo.getRenavam().contains(esc) || veiculo.getModelo().contains(esc)
					|| veiculo.getMarca().contains(esc)) {
				JOptionPane.showMessageDialog(null, "Encontrado cadastro de veiculo:\nMarca: " + veiculo.getMarca() +
						"\nModelo: " + veiculo.getModelo() + "\nRenavam: " + veiculo.getRenavam());
				resposta = true;
			}
		}

		if (resposta == false) {
			JOptionPane.showMessageDialog(null, "Nao Encontrado");
		}

		return resposta;
	}

	public static boolean removerVeiculo() {
		boolean resposta = false;

		String renavam = JOptionPane.showInputDialog(null, "Buscar pelo renavam o cadastro a ser excluido: ");
		for (Veiculos veiculo : veiculos) {
			if (veiculo.getRenavam().equals(renavam)) {
				JOptionPane.showMessageDialog(null, "Encontrado cadastro de veiculo:\nMarca: " + veiculo.getMarca() +
						"\nModelo: " + veiculo.getModelo() + "\nRenavam: " + veiculo.getRenavam());

				int confirmacao = JOptionPane.showConfirmDialog(null, "Deseja remover o cadastro?",
						"Remover cadastro",
						JOptionPane.YES_NO_OPTION);

				if (confirmacao == JOptionPane.YES_OPTION) {
					veiculos.remove(veiculo);
					JOptionPane.showMessageDialog(null, "Cadastro removido com sucesso!");
					resposta = true;
				} else {
					JOptionPane.showMessageDialog(null, "Decisao revogada");
					resposta = true;
				}

			}
		}

		if (resposta == false) {
			JOptionPane.showMessageDialog(null, "Nao Encontrado");
		}

		return resposta;
	}

	// m�todos get's
	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public String getAnoFabricacao() {
		return anoFabricacao;
	}

	public String getAnoModelo() {
		return anoModelo;
	}

	public String getRenavam() {
		return renavam;
	}

	public float getCapacidadeTanque() {
		return capacidadeTanque;
	}
}
