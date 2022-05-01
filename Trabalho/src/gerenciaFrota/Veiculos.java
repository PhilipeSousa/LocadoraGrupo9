package gerenciaFrota;

import java.util.LinkedList;
import java.util.List;

import gerenciaFrota.ObjetoNaoEncontradoException;

import javax.swing.JOptionPane;

public class Veiculos {
	String marca,
	modelo,
	anoFabricacao,
	anoModelo,
	renavam;
	float capacidadeTanque;
	Diaria diaria;
	static List<Veiculos> cadastroVeiculos = new LinkedList<Veiculos>();

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

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setAnoFabricacao(String anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public void setAnoModelo(String anoModelo) {
		this.anoModelo = anoModelo;
	}

	public void setRenavam(String renavam) {
		this.renavam = renavam;
	}

	public void setCapacidadeTanque(float capacidadeTanque) {
		this.capacidadeTanque = capacidadeTanque;
	}

	public void setDiaria(Diaria diaria) {
		this.diaria = diaria;
	}

	private static void cadastrarVeiculo(Veiculos veic) {
		boolean adicionou = cadastroVeiculos.add(veic);
		if (adicionou)
			JOptionPane.showMessageDialog(null, "Veiculo cadastrado com sucesso!");
	}
	
	public static boolean removerVeiculo() {
		boolean resposta = false;

		String renavam = JOptionPane.showInputDialog(null, "Buscar pelo renavam o cadastro a ser excluido: ");
		for (Veiculos veiculo : cadastroVeiculos) {
			if (veiculo.getRenavam().equals(renavam)) {
				JOptionPane.showMessageDialog(null, "Encontrado cadastro de veiculo:\nMarca: " + veiculo.getMarca() +
						"\nModelo: " + veiculo.getModelo() + "\nRenavam: " + veiculo.getRenavam());

				int confirmacao = JOptionPane.showConfirmDialog(null, "Deseja remover o cadastro?",
						"Remover cadastro",
						JOptionPane.YES_NO_OPTION);

				if (confirmacao == JOptionPane.YES_OPTION) {
					cadastroVeiculos.remove(veiculo);
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


	public static void cadastrarMotocicleta() {
		String marca = JOptionPane.showInputDialog("Marca: ");
		String modelo = JOptionPane.showInputDialog("Modelo: ");
		
		String anoFabricacao = JOptionPane.showInputDialog("Ano de fabricacao: ");
		String anoModelo = JOptionPane.showInputDialog("Ano do modelo: ");
		String renavam = JOptionPane.showInputDialog("Renavam: ");
		
		String strCapacidadeTanque = JOptionPane.showInputDialog("Capacidade do tanque de combustivel: ");
		float capacidadeTanque = Float.parseFloat(strCapacidadeTanque);
		String strFreiosAbs = JOptionPane.showInputDialog("Possui freios Abs? ");
		boolean freiosAbs = Boolean.parseBoolean(strFreiosAbs);
		String strControleTracao = JOptionPane.showInputDialog("Possui controle de tracao? ");
		boolean controleTracao = Boolean.parseBoolean(strControleTracao);
		String strPilotoAutomatico = JOptionPane.showInputDialog("Possui piloto automatico? ");
		boolean pilotoAutomatico = Boolean.parseBoolean(strPilotoAutomatico);
		String modoPilotagem = JOptionPane.showInputDialog("Modo de pilotagem: ");
		Motocicletas moto = new Motocicletas(marca, modelo, anoFabricacao, anoModelo,
				renavam, capacidadeTanque, freiosAbs, controleTracao, pilotoAutomatico, modoPilotagem);
		cadastrarVeiculo(moto);	 
	}

	public static void cadastrarVeiculosPassageiros() {
		String marca = JOptionPane.showInputDialog("Marca: ");
		String modelo = JOptionPane.showInputDialog("Modelo: ");
		String anoFabricacao = JOptionPane.showInputDialog("Ano de fabricacao: ");
		String anoModelo = JOptionPane.showInputDialog("Ano do modelo: ");
		String renavam = JOptionPane.showInputDialog("Renavam: ");
		String strCapacidadeTanque = JOptionPane.showInputDialog("Capacidade do tanque de combustivel: ");
		float capacidadeTanque = Float.parseFloat(strCapacidadeTanque);
		//String numeroOcupantes = JOptionPane.showInputDialog("Numero de ocupantes: ");
		String strArCondicionado = JOptionPane.showInputDialog("Possui ar-condicionado? ");
		boolean arCondicionado = Boolean.parseBoolean(strArCondicionado);
		String strDirecaoHidraulica = JOptionPane.showInputDialog("Possui direcao hidraulica? ");
		boolean direcaoHidraulica = Boolean.parseBoolean(strDirecaoHidraulica);
		String strTv = JOptionPane.showInputDialog("Pssui tv? ");
		boolean tv = Boolean.parseBoolean(strTv);
		VeiculosPassageiros veicPas = new VeiculosPassageiros(marca, modelo, anoFabricacao, anoModelo, renavam,
				capacidadeTanque, arCondicionado, direcaoHidraulica, tv);
		cadastrarVeiculo(veicPas);
	}

	public static void cadastrarVeiculosCarga() {
		String marca = JOptionPane.showInputDialog("Marca: ");
		String modelo = JOptionPane.showInputDialog("Modelo: ");
		String anoFabricacao = JOptionPane.showInputDialog("Ano de fabricacao: ");
		String anoModelo = JOptionPane.showInputDialog("Ano do modelo: ");
		String renavam = JOptionPane.showInputDialog("Renavam: ");
		String strCapacidadeTanque = JOptionPane.showInputDialog("Capacidade do tanque de combustivel: ");
		float capacidadeTanque = Float.parseFloat(strCapacidadeTanque);
		String strTaraVeiculo = JOptionPane.showInputDialog("Tara do veiculo: ");
		float taraVeiculo = Float.parseFloat(strTaraVeiculo);
		String strTamCompartimento = JOptionPane.showInputDialog("Tamanho do compartimento de carga: ");
		float tamCompartimento = Float.parseFloat(strTamCompartimento);
		String tipoCompartimento = JOptionPane.showInputDialog("Tipo do compartimento: ");
		VeiculosCarga veicCar = new VeiculosCarga(marca, modelo, anoFabricacao,
				anoModelo, renavam, capacidadeTanque,
				taraVeiculo, tamCompartimento, tipoCompartimento);
		cadastrarVeiculo(veicCar); 
	}

	public static void cadastrarCompactoLuxo() {
		String marca = JOptionPane.showInputDialog("Marca: ");
		String modelo = JOptionPane.showInputDialog("Modelo: ");
		String anoFabricacao = JOptionPane.showInputDialog("Ano de fabricacao: ");
		String anoModelo = JOptionPane.showInputDialog("Ano do modelo: ");
		String renavam = JOptionPane.showInputDialog("Renavam: ");
		String strCapacidadeTanque = JOptionPane.showInputDialog("Capacidade do tanque de combustivel: ");
		float capacidadeTanque = Float.parseFloat(strCapacidadeTanque);
		String strArCondicionado = JOptionPane.showInputDialog("Possui ar-condicionado? ");
		boolean arCondicionado = Boolean.parseBoolean(strArCondicionado); 
		String strDirecaoHidraulica = JOptionPane.showInputDialog("Possui direcao hidraulica? ");
		boolean direcaoHidraulica = Boolean.parseBoolean(strDirecaoHidraulica);
		String strCambioAutomatico = JOptionPane.showInputDialog("Possui cambio automatico? ");
		boolean cambioAutomatico = Boolean.parseBoolean(strCambioAutomatico);
		CompactoLuxo compLuxo = new CompactoLuxo(marca, modelo, anoFabricacao,
				anoModelo, renavam, capacidadeTanque, arCondicionado, direcaoHidraulica, cambioAutomatico);
		cadastrarVeiculo(compLuxo); 
	}

	public static void cadastrarCompacto() {
		String marca = JOptionPane.showInputDialog("Marca: ");
		String modelo = JOptionPane.showInputDialog("Modelo: ");
		String anoFabricacao = JOptionPane.showInputDialog("Ano de fabricacao: ");
		String anoModelo = JOptionPane.showInputDialog("Ano do modelo: ");
		String renavam = JOptionPane.showInputDialog("Renavam: ");
		String strCapacidadeTanque = JOptionPane.showInputDialog("Capacidade do tanque de combustivel: ");
		float capacidadeTanque = Float.parseFloat(strCapacidadeTanque);
		String strArCondicionado = JOptionPane.showInputDialog("Possui ar-condicionado? ");
		boolean arCondicionado = Boolean.parseBoolean(strArCondicionado);
		String strDirecaoHidraulica = JOptionPane.showInputDialog("Possui direcao hidraulica? ");
		boolean direcaoHidraulica = Boolean.parseBoolean(strDirecaoHidraulica);
		String strCambioAutomatico = JOptionPane.showInputDialog("Possui cambio Automatico? ");
		boolean cambioAutomatico = Boolean.parseBoolean(strCambioAutomatico);
		Compacto comp = new Compacto(marca, modelo, anoFabricacao, anoModelo,
				renavam, capacidadeTanque, arCondicionado, direcaoHidraulica, cambioAutomatico);
		cadastrarVeiculo(comp);
	}

	public static void cadastrarSuvs() {
		String marca = JOptionPane.showInputDialog("Marca: ");
		String modelo = JOptionPane.showInputDialog("Modelo: ");
		String anoFabricacao = JOptionPane.showInputDialog("Ano de fabricacao: ");
		String anoModelo = JOptionPane.showInputDialog("Ano do modelo: ");
		String renavam = JOptionPane.showInputDialog("Renavam: ");
		String strCapacidadeTanque = JOptionPane.showInputDialog("Capacidade do tanque de combustivel: ");
		float capacidadeTanque = Float.parseFloat(strCapacidadeTanque);
		String strArCondicionado = JOptionPane.showInputDialog("Possui ar-condicionado? ");
		boolean arCondicionado = Boolean.parseBoolean(strArCondicionado);
		String strDirecaoHidraulica = JOptionPane.showInputDialog("Possui direcao hidraulica? ");
		boolean direcaoHidraulica = Boolean.parseBoolean(strDirecaoHidraulica);
		String strCambioAutomatico = JOptionPane.showInputDialog("Possui cambio Automatico? ");
		boolean cambioAutomatico = Boolean.parseBoolean(strCambioAutomatico);
		Suvs suv = new Suvs(marca, modelo, anoFabricacao, anoModelo, renavam,
				capacidadeTanque, arCondicionado, direcaoHidraulica, cambioAutomatico);
		cadastrarVeiculo(suv);
	}

	public static void cadastrarSedan() {
		String marca = JOptionPane.showInputDialog("Marca: ");
		String modelo = JOptionPane.showInputDialog("Modelo: ");
		String anoFabricacao = JOptionPane.showInputDialog("Ano de fabricacao: ");
		String anoModelo = JOptionPane.showInputDialog("Ano do modelo: ");
		String renavam = JOptionPane.showInputDialog("Renavam: ");
		String strCapacidadeTanque = JOptionPane.showInputDialog("Capacidade do tanque de combustivel: ");
		float capacidadeTanque = Float.parseFloat(strCapacidadeTanque);		 
		String strArCondicionado = JOptionPane.showInputDialog("Possui ar-condicionado? ");
		boolean arCondicionado = Boolean.parseBoolean(strArCondicionado);
		String strDirecaoHidraulica = JOptionPane.showInputDialog("Possui direcao hidraulica? ");
		boolean direcaoHidraulica = Boolean.parseBoolean(strDirecaoHidraulica);
		String strCambioAutomatico = JOptionPane.showInputDialog("Possui cambio Automatico? ");
		boolean cambioAutomatico = Boolean.parseBoolean(strCambioAutomatico);
		Sedan sed = new Sedan(marca, modelo, anoFabricacao, anoModelo, renavam,
				capacidadeTanque, arCondicionado, direcaoHidraulica, cambioAutomatico);
		cadastrarVeiculo(sed);

	}

	public static void imprimirVeiculos() {

	}

	public static boolean pesquisarVeiculosRenavam() {
		boolean resposta = false;

		String esc = JOptionPane.showInputDialog(null, "Buscar veiculo por renavam: ");
		for (Veiculos veiculo : cadastroVeiculos) {
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
		for (Veiculos veiculo : cadastroVeiculos) {
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
	
	public static void alterarVeiculo() {
		Veiculos l = pesquisar_alt();
		if (l != null && l instanceof Veiculos) {
			Veiculos pf = (Veiculos) l;
			String strEscolha = JOptionPane.showInputDialog("Digite: \n" 
					+ "1 - Para alterar marca: \n"
					+ "2 - Para alterar modelo: \n"
					+ "3 - Para alterar Ano de fabricacao: \n"
					+ "4 - Para alterar Ano do modelo: \n"
					+ "5 - Para alterar Renavam: \n"
					+ "6 - Para alterar Capacidade do tanque de combustivel: \n");

			int escolha = Integer.parseInt(strEscolha);
			if (escolha == 1) {
				String marcaMod = JOptionPane.showInputDialog("Digite a nova marca: ");
				l.setMarca(marcaMod);
				JOptionPane.showMessageDialog(null, "marca alterado com sucesso!");
			}
			if (escolha == 2) {
				String modelMod = JOptionPane.showInputDialog("Digite o novo modelo: ");
				l.setModelo(modelMod);
				JOptionPane.showMessageDialog(null, "email alterado com sucesso!");
			}
			if (escolha == 3) {
				String anofMod = JOptionPane.showInputDialog("Digite o novo ano de fabricacao: ");
				l.setAnoFabricacao(anofMod);
				JOptionPane.showMessageDialog(null, "ano alterado com sucesso!");
			}
			if (escolha == 4) {
				String anoMod = JOptionPane.showInputDialog("Digite o novo ano do modelo: ");
				l.setAnoModelo(anoMod);
				JOptionPane.showMessageDialog(null, "ano alterado com sucesso!");
			}
			if (escolha == 5) {
				String renaMod = JOptionPane.showInputDialog("Digite o novo Renavam: ");
				l.setRenavam(renaMod);
				JOptionPane.showMessageDialog(null, "renavam alterado com sucesso!");
			}
			if (escolha == 6) {
				String capMod = JOptionPane.showInputDialog("Digite o novo valor da Capacidade do tanque de combustivel: ");
				float capT = Float.parseFloat(capMod);
				l.setCapacidadeTanque(capT);
				JOptionPane.showMessageDialog(null, "rua alterada com sucesso!");
			}
		}
		
	}

	public static Veiculos pesquisar_alt() {
		
		int escolha = 1;
		Veiculos vecPesquisado = null; 

		if (escolha == 1) {
			String rena = JOptionPane.showInputDialog("Digite o renavam do veiculo que deseja alterar: ");
			

			for (Veiculos l : cadastroVeiculos) {
				if (l instanceof Veiculos) {
					Veiculos pf = (Veiculos) l; 
					if (l.getRenavam().equals(rena)) {
						JOptionPane.showMessageDialog(null, "veiculo encontrado!");
						vecPesquisado = l;
					} 
				} 
			}
		} 
		try {
			if (vecPesquisado == null) {
				throw new ObjetoNaoEncontradoException("Objeto nao encontrado!");
			}
		} catch (ObjetoNaoEncontradoException ex) {
			String msg = ex.getMessage();
			System.out.println("Exception " + msg);
		}
		return vecPesquisado;
	}

}

