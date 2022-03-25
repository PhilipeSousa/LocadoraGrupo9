package gerenciaFrota;

//import javax.swing.JOptionPane;

public class Veiculos {
	String marca,
			modelo,
			anoFabricacao,
			anoModelo,
			renavam;
	float capacidadeTanque;

	Diaria diaria;

	private static void cadastrarVeiculo(Veiculos ve) {
		// Veiculos[] temp = new Veiculos[veic.length + 1];
		// for (int i = 0; i < veic.length; i++) {
		// temp[i] = veic[i];
		// }
		// temp[veic.length] = ve;
		// veic = temp;
		// JOptionPane.showMessageDialog(null, "Ve�culo cadastrado com sucesso!");
	}

	public static void cadastrarMotocicleta() {
		/*
		 * String marca = JOptionPane.showInputDialog("Marca: ");
		 * String modelo = JOptionPane.showInputDialog("Modelo: ");
		 * String anoFabricacao = JOptionPane.showInputDialog("Ano de fabrica��o: ");
		 * String anoModelo = JOptionPane.showInputDialog("Ano do modelo: ");
		 * String renavam = JOptionPane.showInputDialog("Renavam: ");
		 * String capacidadeTanque =
		 * JOptionPane.showInputDialog("Capacidade do tanque de combust�vel: ");
		 * String freiosAbs = JOptionPane.showInputDialog("Possui freios Abs? ");
		 * String controleTracao =
		 * JOptionPane.showInputDialog("Possui controle de tra��o? ");
		 * String pilotoAutomatico =
		 * JOptionPane.showInputDialog("Possui piloto autom�tico? ");
		 * String modoPilotagem = JOptionPane.showInputDialog("Modo de pilotagem: ");
		 * Motocicletas moto = new Motocicletas(marca, modelo, anoFabricacao, anoModelo,
		 * renavam, capacidadeTanque,
		 * freiosAbs, controleTracao, pilotoAutomatico, modoPilotagem);
		 * cadastrarVeiculo(moto);
		 */
	}

	public static void cadastrarVeiculosPassageiros() {
		/*
		 * String marca = JOptionPane.showInputDialog("Marca: ");
		 * String modelo = JOptionPane.showInputDialog("Modelo: ");
		 * String anoFabricacao = JOptionPane.showInputDialog("Ano de fabrica��o: ");
		 * String anoModelo = JOptionPane.showInputDialog("Ano do modelo: ");
		 * String renavam = JOptionPane.showInputDialog("Renavam: ");
		 * String capacidadeTanque =
		 * JOptionPane.showInputDialog("Capacidade do tanque de combust�vel: ");
		 * String numeroOcupantes =
		 * JOptionPane.showInputDialog("N�mero de ocupantes: ");
		 * String arCondicionado =
		 * JOptionPane.showInputDialog("Possui ar-condicionado? ");
		 * String direcaoHidraulica =
		 * JOptionPane.showInputDialog("Possui dire��o hidr�ulica? ");
		 * String tv = JOptionPane.showInputDialog("Pssui tv? ");
		 * VeiculosPassageiros veicPas = new VeiculosPassageiros(marca, modelo,
		 * anoFabricacao, anoModelo, renavam,
		 * capacidadeTanque, numeroOcupantes, arCondicionado, direcaoHidraulica, tv);
		 * cadastrarVeiculo(veicPas);
		 */
	}

	public static void cadastrarVeiculosCarga() {
		/*
		 * String marca = JOptionPane.showInputDialog("Marca: ");
		 * String modelo = JOptionPane.showInputDialog("Modelo: ");
		 * String anoFabricacao = JOptionPane.showInputDialog("Ano de fabrica��o: ");
		 * String anoModelo = JOptionPane.showInputDialog("Ano do modelo: ");
		 * String renavam = JOptionPane.showInputDialog("Renavam: ");
		 * String capacidadeTanque =
		 * JOptionPane.showInputDialog("Capacidade do tanque de combust�vel: ");
		 * String pesoMaximo = JOptionPane.showInputDialog("Peso m�ximo: ");
		 * String taraVeiculo = JOptionPane.showInputDialog("Tara do ve�culo: ");
		 * String compartimentoCarga =
		 * JOptionPane.showInputDialog("Compartimento de carga: ");
		 * String tipoCompartimento =
		 * JOptionPane.showInputDialog("Tipo do compartimento: ");
		 * VeiculosCarga veicCar = new VeiculosCarga(marca, modelo, anoFabricacao,
		 * anoModelo, renavam, capacidadeTanque,
		 * pesoMaximo, taraVeiculo, compartimentoCarga, tipoCompartimento);
		 * cadastrarVeiculo(veicCar);
		 */
	}

	public static void cadastrarCompactoLuxo() {
		/*
		 * String marca = JOptionPane.showInputDialog("Marca: ");
		 * String modelo = JOptionPane.showInputDialog("Modelo: ");
		 * String anoFabricacao = JOptionPane.showInputDialog("Ano de fabrica��o: ");
		 * String anoModelo = JOptionPane.showInputDialog("Ano do modelo: ");
		 * String renavam = JOptionPane.showInputDialog("Renavam: ");
		 * String capacidadeTanque =
		 * JOptionPane.showInputDialog("Capacidade do tanque de combust�vel: ");
		 * String arCondicionado =
		 * JOptionPane.showInputDialog("Possui ar-condicionado? ");
		 * String direcaoHidraulica =
		 * JOptionPane.showInputDialog("Possui dire��o hidr�ulica? ");
		 * String cambioAutomatico =
		 * JOptionPane.showInputDialog("Possui c�mbio autom�tico? ");
		 * CompactoLuxo compLuxo = new CompactoLuxo(marca, modelo, anoFabricacao,
		 * anoModelo, renavam, capacidadeTanque,
		 * arCondicionado, direcaoHidraulica, cambioAutomatico);
		 * cadastrarVeiculo(compLuxo);
		 */
	}

	public static void cadastrarCompacto() {
		/*
		 * String marca = JOptionPane.showInputDialog("Marca: ");
		 * String modelo = JOptionPane.showInputDialog("Modelo: ");
		 * String anoFabricacao = JOptionPane.showInputDialog("Ano de fabrica��o: ");
		 * String anoModelo = JOptionPane.showInputDialog("Ano do modelo: ");
		 * String renavam = JOptionPane.showInputDialog("Renavam: ");
		 * String capacidadeTanque =
		 * JOptionPane.showInputDialog("Capacidade do tanque de combust�vel: ");
		 * String arCondicionado =
		 * JOptionPane.showInputDialog("Possui ar-condicionado? ");
		 * String direcaoHidraulica =
		 * JOptionPane.showInputDialog("Possui dire��o hidr�ulica? ");
		 * String cambioAutomatico =
		 * JOptionPane.showInputDialog("Possui c�mbio autom�tico? ");
		 * Compacto comp = new Compacto(marca, modelo, anoFabricacao, anoModelo,
		 * renavam, capacidadeTanque, arCondicionado,
		 * direcaoHidraulica, cambioAutomatico);
		 * cadastrarVeiculo(comp);
		 */
	}

	public static void cadastrarSuvs() {
		/*
		 * String marca = JOptionPane.showInputDialog("Marca: ");
		 * String modelo = JOptionPane.showInputDialog("Modelo: ");
		 * String anoFabricacao = JOptionPane.showInputDialog("Ano de fabrica��o: ");
		 * String anoModelo = JOptionPane.showInputDialog("Ano do modelo: ");
		 * String renavam = JOptionPane.showInputDialog("Renavam: ");
		 * String capacidadeTanque =
		 * JOptionPane.showInputDialog("Capacidade do tanque de combust�vel: ");
		 * String arCondicionado =
		 * JOptionPane.showInputDialog("Possui ar-condicionado? ");
		 * String direcaoHidraulica =
		 * JOptionPane.showInputDialog("Possui dire��o hidr�ulica? ");
		 * String cambioAutomatico =
		 * JOptionPane.showInputDialog("Possui c�mbio autom�tico? ");
		 * Suvs suv = new Suvs(marca, modelo, anoFabricacao, anoModelo, renavam,
		 * capacidadeTanque, arCondicionado,
		 * direcaoHidraulica, cambioAutomatico);
		 * cadastrarVeiculo(suv);
		 */
	}

	public static void cadastrarSedan() {
		/*
		 * String marca = JOptionPane.showInputDialog("Marca: ");
		 * String modelo = JOptionPane.showInputDialog("Modelo: ");
		 * String anoFabricacao = JOptionPane.showInputDialog("Ano de fabrica��o: ");
		 * String anoModelo = JOptionPane.showInputDialog("Ano do modelo: ");
		 * String renavam = JOptionPane.showInputDialog("Renavam: ");
		 * String capacidadeTanque =
		 * JOptionPane.showInputDialog("Capacidade do tanque de combust�vel: ");
		 * String arCondicionado =
		 * JOptionPane.showInputDialog("Possui ar-condicionado? ");
		 * String direcaoHidraulica =
		 * JOptionPane.showInputDialog("Possui dire��o hidr�ulica? ");
		 * String cambioAutomatico =
		 * JOptionPane.showInputDialog("Possui c�mbio autom�tico? ");
		 * Sedan sed = new Sedan(marca, modelo, anoFabricacao, anoModelo, renavam,
		 * capacidadeTanque, arCondicionado,
		 * direcaoHidraulica, cambioAutomatico);
		 * cadastrarVeiculo(sed);
		 */

	}

	public static void cadastrarVeiculoPasseio() {
		// Implementar o m�todo cadastro de ve�culos de passeio
	}

	public static void cadastrarVeiculosUtilitarios() {
		// Implementar o m�todo cadastro de ve�culos utilit�rios
	}

	public static void imprimirLocatario() {
		/*
		 * for (int x = 0; x < veic.length; x++) {
		 * if (veic[x] instanceof Motocicletas) {
		 * Motocicletas temp = (Motocicletas) veic[x];
		 * String resposta = veic[x].getMarca() + "\n" +
		 * veic[x].getModelo() + "\n" +
		 * veic[x].getAnoFabricacao() + "\n" +
		 * veic[x].getAnoModelo() + "\n" +
		 * veic[x].getRenavam() + "\n" +
		 * veic[x].getCapacidadeTanque() + "\n" +
		 * temp.getControleTracao() + "\n" +
		 * temp.getFreiosAbs() + "\n" +
		 * temp.getPilotoAutomatico() + "\n" +
		 * temp.getModoPilotagem();
		 * JOptionPane.showMessageDialog(null, resposta);
		 * 
		 * } else if (veic[x] instanceof VeiculosPassageiros) {
		 * VeiculosPassageiros temp = (VeiculosPassageiros) veic[x];
		 * String resposta = veic[x].getMarca() + "\n" +
		 * veic[x].getModelo() + "\n" +
		 * veic[x].getAnoFabricacao() + "\n" +
		 * veic[x].getAnoModelo() + "\n" +
		 * veic[x].getRenavam() + "\n" +
		 * veic[x].getCapacidadeTanque() + "\n" +
		 * temp.getNumeroOcupantes() + "\n" +
		 * temp.getArCondicionado() + "\n" +
		 * temp.getDirecaoHidraulica() + "\n" +
		 * temp.getTv();
		 * JOptionPane.showMessageDialog(null, resposta);
		 * 
		 * } else if (veic[x] instanceof VeiculosCarga) {
		 * VeiculosCarga temp = (VeiculosCarga) veic[x];
		 * String resposta = veic[x].getMarca() + "\n" +
		 * veic[x].getModelo() + "\n" +
		 * veic[x].getAnoFabricacao() + "\n" +
		 * veic[x].getAnoModelo() + "\n" +
		 * veic[x].getRenavam() + "\n" +
		 * veic[x].getCapacidadeTanque() + "\n" +
		 * temp.getPesoMaximo() + "\n" +
		 * temp.getTaraVeiculo() + "\n" +
		 * temp.getCompartimentoCarga() + "\n" +
		 * temp.getTipoCompartimento();
		 * JOptionPane.showMessageDialog(null, resposta);
		 * 
		 * } else if (veic[x] instanceof CompactoLuxo) {
		 * CompactoLuxo temp = (CompactoLuxo) veic[x];
		 * String resposta = veic[x].getMarca() + "\n" +
		 * veic[x].getModelo() + "\n" +
		 * veic[x].getAnoFabricacao() + "\n" +
		 * veic[x].getAnoModelo() + "\n" +
		 * veic[x].getRenavam() + "\n" +
		 * veic[x].getCapacidadeTanque() + "\n" +
		 * temp.getArCondicionado() + "\n" +
		 * temp.getDirecaoHidraulica() + "\n" +
		 * temp.getCambioAutomatico() + "\n";
		 * JOptionPane.showMessageDialog(null, resposta);
		 * 
		 * } else if (veic[x] instanceof Compacto) {
		 * Compacto temp = (Compacto) veic[x];
		 * String resposta = veic[x].getMarca() + "\n" +
		 * veic[x].getModelo() + "\n" +
		 * veic[x].getAnoFabricacao() + "\n" +
		 * veic[x].getAnoModelo() + "\n" +
		 * veic[x].getRenavam() + "\n" +
		 * veic[x].getCapacidadeTanque() + "\n" +
		 * temp.getArCondicionado() + "\n" +
		 * temp.getDirecaoHidraulica() + "\n" +
		 * temp.getCambioAutomatico() + "\n";
		 * JOptionPane.showMessageDialog(null, resposta);
		 * 
		 * } else if (veic[x] instanceof Suvs) {
		 * Suvs temp = (Suvs) veic[x];
		 * String resposta = veic[x].getMarca() + "\n" +
		 * veic[x].getModelo() + "\n" +
		 * veic[x].getAnoFabricacao() + "\n" +
		 * veic[x].getAnoModelo() + "\n" +
		 * veic[x].getRenavam() + "\n" +
		 * veic[x].getCapacidadeTanque() + "\n" +
		 * temp.getArCondicionado() + "\n" +
		 * temp.getDirecaoHidraulica() + "\n" +
		 * temp.getCambioAutomatico() + "\n";
		 * JOptionPane.showMessageDialog(null, resposta);
		 * 
		 * } else if (veic[x] instanceof Sedan) {
		 * Sedan temp = (Sedan) veic[x];
		 * String resposta = veic[x].getMarca() + "\n" +
		 * veic[x].getModelo() + "\n" +
		 * veic[x].getAnoFabricacao() + "\n" +
		 * veic[x].getAnoModelo() + "\n" +
		 * veic[x].getRenavam() + "\n" +
		 * veic[x].getCapacidadeTanque() + "\n" +
		 * temp.getArCondicionado() + "\n" +
		 * temp.getDirecaoHidraulica() + "\n" +
		 * temp.getCambioAutomatico() + "\n";
		 * JOptionPane.showMessageDialog(null, resposta);
		 * }
		 * }
		 */
	}

	// public static Veiculos pesquisarVeiculosRenavam() {
	/*
	 * String strRenavam = JOptionPane.showInputDialog("Digite o renavam: ");
	 * for (int x = 0; x < veic.length; x++) {
	 * if (veic[x] instanceof Motocicletas) {
	 * Motocicletas temp = (Motocicletas) veic[x];
	 * String renavam = temp.getRenavam();
	 * if (renavam.equals(strRenavam)) {
	 * JOptionPane.showMessageDialog(null, "Est� na lista!");
	 * return veic[x];
	 * }
	 * } else if (veic[x] instanceof VeiculosPassageiros) {
	 * VeiculosPassageiros temp = (VeiculosPassageiros) veic[x];
	 * String renavam = temp.getRenavam();
	 * if (renavam.equals(strRenavam)) {
	 * JOptionPane.showMessageDialog(null, "Est� na lista!");
	 * return veic[x];
	 * }
	 * } else if (veic[x] instanceof VeiculosCarga) {
	 * VeiculosCarga temp = (VeiculosCarga) veic[x];
	 * String renavam = temp.getRenavam();
	 * if (renavam.equals(strRenavam)) {
	 * JOptionPane.showMessageDialog(null, "Est� na lista!");
	 * return veic[x];
	 * }
	 * } else if (veic[x] instanceof CompactoLuxo) {
	 * CompactoLuxo temp = (CompactoLuxo) veic[x];
	 * String renavam = temp.getRenavam();
	 * if (renavam.equals(strRenavam)) {
	 * JOptionPane.showMessageDialog(null, "Est� na lista!");
	 * return veic[x];
	 * }
	 * } else if (veic[x] instanceof Compacto) {
	 * Compacto temp = (Compacto) veic[x];
	 * String renavam = temp.getRenavam();
	 * if (renavam.equals(strRenavam)) {
	 * JOptionPane.showMessageDialog(null, "Est� na lista!");
	 * return veic[x];
	 * }
	 * } else if (veic[x] instanceof Suvs) {
	 * Suvs temp = (Suvs) veic[x];
	 * String renavam = temp.getRenavam();
	 * if (renavam.equals(strRenavam)) {
	 * JOptionPane.showMessageDialog(null, "Est� na lista!");
	 * return veic[x];
	 * }
	 * } else if (veic[x] instanceof Sedan) {
	 * Sedan temp = (Sedan) veic[x];
	 * String renavam = temp.getRenavam();
	 * if (renavam.equals(strRenavam)) {
	 * JOptionPane.showMessageDialog(null, "Est� na lista!");
	 * return veic[x];
	 * }
	 * }
	 * }
	 * JOptionPane.showMessageDialog(null, "N�o est� na lista!");
	 * return null;
	 */
	// }

	public static void pesquisarVeiculosMarcaModeloRen() {
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
