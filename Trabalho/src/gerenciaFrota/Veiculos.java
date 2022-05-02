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
		if (adicionou) {
			JOptionPane.showMessageDialog(null, "Veiculo cadastrado com sucesso!");
		}
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
		boolean repeat = true;
		String marca = "";
		String modelo = "";
		String renavam = "";

		while(repeat == true){
			try{
				marca = JOptionPane.showInputDialog("Marca: ");
				if (marca.equals(""))
					throw new CampoEmBrancoException(" - Campo em Branco");
				repeat = false; 
				
			} catch (CampoEmBrancoException e){
				String msg = "CampoEmBrancoException" + e.getMessage();
				JOptionPane.showMessageDialog(null, msg);
				repeat = true;
			}	
		}
		repeat = true; 
		while(repeat == true){
			try{
				modelo = JOptionPane.showInputDialog("Modelo: ");
				if (modelo.equals(""))
					throw new CampoEmBrancoException(" - Campo em Branco");
				repeat = false; 
				
			} catch (CampoEmBrancoException e){
				String msg = "CampoEmBrancoException" + e.getMessage();
				JOptionPane.showMessageDialog(null, msg);
				repeat = true;
			}	
		}
		
		String anoFabricacao = JOptionPane.showInputDialog("Ano de fabricacao: ");
		String anoModelo = JOptionPane.showInputDialog("Ano do modelo: ");		
		repeat = true; 
		while(repeat == true){
			try{
				renavam = JOptionPane.showInputDialog("Renavam: ");
				if (renavam.equals(""))
					throw new CampoEmBrancoException(" - Campo em Branco");
				repeat = false; 
				
			} catch (CampoEmBrancoException e){
				String msg = "CampoEmBrancoException" + e.getMessage();
				JOptionPane.showMessageDialog(null, msg);
				repeat = true;
			}	
		}
		
		String strCapacidadeTanque = JOptionPane.showInputDialog("Capacidade do tanque de combustivel: ");
		float capacidadeTanque = Float.parseFloat(strCapacidadeTanque);
		boolean freiosAbs = false;
		boolean controleTracao = false;
		boolean pilotoAutomatico = false;

		int  strFreiosAbs = JOptionPane.showConfirmDialog(null,"Possui freios Abs? ","Cadastro" ,JOptionPane.YES_NO_OPTION);
		if (strFreiosAbs == JOptionPane.YES_OPTION){
			 freiosAbs = true;
		}

		int strControleTracao = JOptionPane.showConfirmDialog(null,"Possui controle de tracao? ","Cadastro" ,JOptionPane.YES_NO_OPTION);
		if (strControleTracao == JOptionPane.YES_OPTION){
			controleTracao = true;
	   	}
		int  strPilotoAutomatico = JOptionPane.showConfirmDialog(null,"Possui piloto automatico? ","Cadastro" ,JOptionPane.YES_NO_OPTION);
		if (strPilotoAutomatico == JOptionPane.YES_OPTION){
				pilotoAutomatico = true;
		} 
		String modoPilotagem = JOptionPane.showInputDialog("Modo de pilotagem: ");
		Motocicletas moto = new Motocicletas(marca, modelo, anoFabricacao, anoModelo,
				renavam, capacidadeTanque, freiosAbs, controleTracao, pilotoAutomatico, modoPilotagem);
		cadastrarVeiculo(moto);	 
	}

	public static void cadastrarVeiculosPassageiros() {
		boolean repeat = true;
		String marca = "";
		String modelo = "";
		String renavam = "";

		while(repeat == true){
			try{
				marca = JOptionPane.showInputDialog("Marca: ");
				if (marca.equals(""))
					throw new CampoEmBrancoException(" - Campo em Branco");
				repeat = false; 
				
			} catch (CampoEmBrancoException e){
				String msg = "CampoEmBrancoException" + e.getMessage();
				JOptionPane.showMessageDialog(null, msg);
				repeat = true;
			}	
		}
		repeat = true; 
		while(repeat == true){
			try{
				modelo = JOptionPane.showInputDialog("Modelo: ");
				if (modelo.equals(""))
					throw new CampoEmBrancoException(" - Campo em Branco");
				repeat = false; 
				
			} catch (CampoEmBrancoException e){
				String msg = "CampoEmBrancoException" + e.getMessage();
				JOptionPane.showMessageDialog(null, msg);
				repeat = true;
			}	
		}
		
		String anoFabricacao = JOptionPane.showInputDialog("Ano de fabricacao: ");
		String anoModelo = JOptionPane.showInputDialog("Ano do modelo: ");		
		repeat = true; 
		while(repeat == true){
			try{
				renavam = JOptionPane.showInputDialog("Renavam: ");
				if (renavam.equals(""))
					throw new CampoEmBrancoException(" - Campo em Branco");
				repeat = false; 
				
			} catch (CampoEmBrancoException e){
				String msg = "CampoEmBrancoException" + e.getMessage();
				JOptionPane.showMessageDialog(null, msg);
				repeat = true;
			}	
		}
		String strCapacidadeTanque = JOptionPane.showInputDialog("Capacidade do tanque de combustivel: ");
		float capacidadeTanque = Float.parseFloat(strCapacidadeTanque);
		//String numeroOcupantes = JOptionPane.showInputDialog("Numero de ocupantes: ");
		boolean arCondicionado    = false;
		boolean direcaoHidraulica = false;
		boolean tv  = false;
		int strArCondicionado = JOptionPane.showConfirmDialog(null,"Possui ar-condicionado? ","Cadastro" ,JOptionPane.YES_NO_OPTION);
		if (strArCondicionado == JOptionPane.YES_OPTION){
			 arCondicionado = true;
		}
		int strDirecaoHidraulica = JOptionPane.showConfirmDialog(null,"Possui direcao hidraulica? ","Cadastro" ,JOptionPane.YES_NO_OPTION);
		if (strDirecaoHidraulica == JOptionPane.YES_OPTION){
			 direcaoHidraulica = true;
		}
		int strTv = JOptionPane.showConfirmDialog(null,"Possui tv? ","Cadastro" ,JOptionPane.YES_NO_OPTION);
		if (strTv == JOptionPane.YES_OPTION){
			tv = true;
		}
		VeiculosPassageiros veicPas = new VeiculosPassageiros(marca, modelo, anoFabricacao, anoModelo, renavam,
				capacidadeTanque, arCondicionado, direcaoHidraulica, tv);
		cadastrarVeiculo(veicPas);
	}

	public static void cadastrarVeiculosCarga() {
		boolean repeat = true;
		String marca = "";
		String modelo = "";
		String renavam = "";

		while(repeat == true){
			try{
				marca = JOptionPane.showInputDialog("Marca: ");
				if (marca.equals(""))
					throw new CampoEmBrancoException(" - Campo em Branco");
				repeat = false; 
				
			} catch (CampoEmBrancoException e){
				String msg = "CampoEmBrancoException" + e.getMessage();
				JOptionPane.showMessageDialog(null, msg);
				repeat = true;
			}	
		}
		repeat = true; 
		while(repeat == true){
			try{
				modelo = JOptionPane.showInputDialog("Modelo: ");
				if (modelo.equals(""))
					throw new CampoEmBrancoException(" - Campo em Branco");
				repeat = false; 
				
			} catch (CampoEmBrancoException e){
				String msg = "CampoEmBrancoException" + e.getMessage();
				JOptionPane.showMessageDialog(null, msg);
				repeat = true;
			}	
		}
		
		String anoFabricacao = JOptionPane.showInputDialog("Ano de fabricacao: ");
		String anoModelo = JOptionPane.showInputDialog("Ano do modelo: ");		
		repeat = true; 
		while(repeat == true){
			try{
				renavam = JOptionPane.showInputDialog("Renavam: ");
				if (renavam.equals(""))
					throw new CampoEmBrancoException(" - Campo em Branco");
				repeat = false; 
				
			} catch (CampoEmBrancoException e){
				String msg = "CampoEmBrancoException" + e.getMessage();
				JOptionPane.showMessageDialog(null, msg);
				repeat = true;
			}	
		}
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
		boolean repeat = true;
		String marca = "";
		String modelo = "";
		String renavam = "";

		while(repeat == true){
			try{
				marca = JOptionPane.showInputDialog("Marca: ");
				if (marca.equals(""))
					throw new CampoEmBrancoException(" - Campo em Branco");
				repeat = false; 
				
			} catch (CampoEmBrancoException e){
				String msg = "CampoEmBrancoException" + e.getMessage();
				JOptionPane.showMessageDialog(null, msg);
				repeat = true;
			}	
		}
		repeat = true; 
		while(repeat == true){
			try{
				modelo = JOptionPane.showInputDialog("Modelo: ");
				if (modelo.equals(""))
					throw new CampoEmBrancoException(" - Campo em Branco");
				repeat = false; 
				
			} catch (CampoEmBrancoException e){
				String msg = "CampoEmBrancoException" + e.getMessage();
				JOptionPane.showMessageDialog(null, msg);
				repeat = true;
			}	
		}
		
		String anoFabricacao = JOptionPane.showInputDialog("Ano de fabricacao: ");
		String anoModelo = JOptionPane.showInputDialog("Ano do modelo: ");		
		repeat = true; 
		while(repeat == true){
			try{
				renavam = JOptionPane.showInputDialog("Renavam: ");
				if (renavam.equals(""))
					throw new CampoEmBrancoException(" - Campo em Branco");
				repeat = false; 
				
			} catch (CampoEmBrancoException e){
				String msg = "CampoEmBrancoException" + e.getMessage();
				JOptionPane.showMessageDialog(null, msg);
				repeat = true;
			}	
		}
		String strCapacidadeTanque = JOptionPane.showInputDialog("Capacidade do tanque de combustivel: ");
		float capacidadeTanque = Float.parseFloat(strCapacidadeTanque);
		boolean arCondicionado    = false;
		boolean direcaoHidraulica = false;
		boolean cambioAutomatico  = false;
		int strArCondicionado = JOptionPane.showConfirmDialog(null,"Possui ar-condicionado? ","Cadastro" ,JOptionPane.YES_NO_OPTION);
		if (strArCondicionado == JOptionPane.YES_OPTION){
			 arCondicionado = true;
		}
		int strDirecaoHidraulica = JOptionPane.showConfirmDialog(null,"Possui direcao hidraulica? ","Cadastro" ,JOptionPane.YES_NO_OPTION);
		if (strDirecaoHidraulica == JOptionPane.YES_OPTION){
			 direcaoHidraulica = true;
		}
		int strCambioAutomatico = JOptionPane.showConfirmDialog(null, "Possui cambio Automatico? ", "Cadastro", JOptionPane.YES_OPTION);
		if (strCambioAutomatico == JOptionPane.YES_OPTION){
			cambioAutomatico = true;
	   }
		CompactoLuxo compLuxo = new CompactoLuxo(marca, modelo, anoFabricacao,
				anoModelo, renavam, capacidadeTanque, arCondicionado, direcaoHidraulica, cambioAutomatico);
		cadastrarVeiculo(compLuxo); 
	}

	public static void cadastrarCompacto() {
		boolean repeat = true;
		String marca = "";
		String modelo = "";
		String renavam = "";

		while(repeat == true){
			try{
				marca = JOptionPane.showInputDialog("Marca: ");
				if (marca.equals(""))
					throw new CampoEmBrancoException(" - Campo em Branco");
				repeat = false; 
				
			} catch (CampoEmBrancoException e){
				String msg = "CampoEmBrancoException" + e.getMessage();
				JOptionPane.showMessageDialog(null, msg);
				repeat = true;
			}	
		}
		repeat = true; 
		while(repeat == true){
			try{
				modelo = JOptionPane.showInputDialog("Modelo: ");
				if (modelo.equals(""))
					throw new CampoEmBrancoException(" - Campo em Branco");
				repeat = false; 
				
			} catch (CampoEmBrancoException e){
				String msg = "CampoEmBrancoException" + e.getMessage();
				JOptionPane.showMessageDialog(null, msg);
				repeat = true;
			}	
		}
		
		String anoFabricacao = JOptionPane.showInputDialog("Ano de fabricacao: ");
		String anoModelo = JOptionPane.showInputDialog("Ano do modelo: ");		
		repeat = true; 
		while(repeat == true){
			try{
				renavam = JOptionPane.showInputDialog("Renavam: ");
				if (renavam.equals(""))
					throw new CampoEmBrancoException(" - Campo em Branco");
				repeat = false; 
				
			} catch (CampoEmBrancoException e){
				String msg = "CampoEmBrancoException" + e.getMessage();
				JOptionPane.showMessageDialog(null, msg);
				repeat = true;
			}	
		}
		String strCapacidadeTanque = JOptionPane.showInputDialog("Capacidade do tanque de combustivel: ");
		float capacidadeTanque = Float.parseFloat(strCapacidadeTanque);
		boolean arCondicionado    = false;
		boolean direcaoHidraulica = false;
		boolean cambioAutomatico  = false;
		int strArCondicionado = JOptionPane.showConfirmDialog(null,"Possui ar-condicionado? ","Cadastro" ,JOptionPane.YES_NO_OPTION);
		if (strArCondicionado == JOptionPane.YES_OPTION){
			 arCondicionado = true;
		}
		int strDirecaoHidraulica = JOptionPane.showConfirmDialog(null,"Possui direcao hidraulica? ","Cadastro" ,JOptionPane.YES_NO_OPTION);
		if (strDirecaoHidraulica == JOptionPane.YES_OPTION){
			 direcaoHidraulica = true;
		}
		int strCambioAutomatico = JOptionPane.showConfirmDialog(null, "Possui cambio Automatico? ", "Cadastro", JOptionPane.YES_OPTION);
		if (strCambioAutomatico == JOptionPane.YES_OPTION){
			cambioAutomatico = true;
	   }
		Compacto comp = new Compacto(marca, modelo, anoFabricacao, anoModelo,
				renavam, capacidadeTanque, arCondicionado, direcaoHidraulica, cambioAutomatico);
		cadastrarVeiculo(comp);
	}

	public static void cadastrarSuvs() {
		boolean repeat = true;
		String marca = "";
		String modelo = "";
		String renavam = "";

		while(repeat == true){
			try{
				marca = JOptionPane.showInputDialog("Marca: ");
				if (marca.equals(""))
					throw new CampoEmBrancoException(" - Campo em Branco");
				repeat = false; 
				
			} catch (CampoEmBrancoException e){
				String msg = "CampoEmBrancoException" + e.getMessage();
				JOptionPane.showMessageDialog(null, msg);
				repeat = true;
			}	
		}
		repeat = true; 
		while(repeat == true){
			try{
				modelo = JOptionPane.showInputDialog("Modelo: ");
				if (modelo.equals(""))
					throw new CampoEmBrancoException(" - Campo em Branco");
				repeat = false; 
				
			} catch (CampoEmBrancoException e){
				String msg = "CampoEmBrancoException" + e.getMessage();
				JOptionPane.showMessageDialog(null, msg);
				repeat = true;
			}	
		}
		
		String anoFabricacao = JOptionPane.showInputDialog("Ano de fabricacao: ");
		String anoModelo = JOptionPane.showInputDialog("Ano do modelo: ");		
		repeat = true; 
		while(repeat == true){
			try{
				renavam = JOptionPane.showInputDialog("Renavam: ");
				if (renavam.equals(""))
					throw new CampoEmBrancoException(" - Campo em Branco");
				repeat = false; 
				
			} catch (CampoEmBrancoException e){
				String msg = "CampoEmBrancoException" + e.getMessage();
				JOptionPane.showMessageDialog(null, msg);
				repeat = true;
			}	
		}
		String strCapacidadeTanque = JOptionPane.showInputDialog("Capacidade do tanque de combustivel: ");
		float capacidadeTanque = Float.parseFloat(strCapacidadeTanque);

		boolean arCondicionado    = false;
		boolean direcaoHidraulica = false;
		boolean cambioAutomatico  = false;
		int strArCondicionado = JOptionPane.showConfirmDialog(null,"Possui ar-condicionado? ","Cadastro" ,JOptionPane.YES_NO_OPTION);
		if (strArCondicionado == JOptionPane.YES_OPTION){
			 arCondicionado = true;
		}
		int strDirecaoHidraulica = JOptionPane.showConfirmDialog(null,"Possui direcao hidraulica? ","Cadastro" ,JOptionPane.YES_NO_OPTION);
		if (strDirecaoHidraulica == JOptionPane.YES_OPTION){
			 direcaoHidraulica = true;
		}
		int strCambioAutomatico = JOptionPane.showConfirmDialog(null, "Possui cambio Automatico? ", "Cadastro", JOptionPane.YES_OPTION);
		if (strCambioAutomatico == JOptionPane.YES_OPTION){
			cambioAutomatico = true;
	   }
		
		Suvs suv = new Suvs(marca, modelo, anoFabricacao, anoModelo, renavam,
				capacidadeTanque, arCondicionado, direcaoHidraulica, cambioAutomatico);
		cadastrarVeiculo(suv);
	}

	public static void cadastrarSedan() {
		boolean repeat = true;
		String marca = "";
		String modelo = "";
		String renavam = "";

		while(repeat == true){
			try{
				marca = JOptionPane.showInputDialog("Marca: ");
				if (marca.equals(""))
					throw new CampoEmBrancoException(" - Campo em Branco");
				repeat = false; 
				
			} catch (CampoEmBrancoException e){
				String msg = "CampoEmBrancoException" + e.getMessage();
				JOptionPane.showMessageDialog(null, msg);
				repeat = true;
			}	
		}
		repeat = true; 
		while(repeat == true){
			try{
				modelo = JOptionPane.showInputDialog("Modelo: ");
				if (modelo.equals(""))
					throw new CampoEmBrancoException(" - Campo em Branco");
				repeat = false; 
				
			} catch (CampoEmBrancoException e){
				String msg = "CampoEmBrancoException" + e.getMessage();
				JOptionPane.showMessageDialog(null, msg);
				repeat = true;
			}	
		}
		
		String anoFabricacao = JOptionPane.showInputDialog("Ano de fabricacao: ");
		String anoModelo = JOptionPane.showInputDialog("Ano do modelo: ");		
		repeat = true; 
		while(repeat == true){
			try{
				renavam = JOptionPane.showInputDialog("Renavam: ");
				if (renavam.equals(""))
					throw new CampoEmBrancoException(" - Campo em Branco");
				repeat = false; 
				
			} catch (CampoEmBrancoException e){
				String msg = "CampoEmBrancoException" + e.getMessage();
				JOptionPane.showMessageDialog(null, msg);
				repeat = true;
			}	
		}
		String strCapacidadeTanque = JOptionPane.showInputDialog("Capacidade do tanque de combustivel: ");
		float capacidadeTanque = Float.parseFloat(strCapacidadeTanque);		 
		boolean arCondicionado    = false;
		boolean direcaoHidraulica = false;
		boolean cambioAutomatico  = false;
		int strArCondicionado = JOptionPane.showConfirmDialog(null,"Possui ar-condicionado? ","Cadastro" ,JOptionPane.YES_NO_OPTION);
		if (strArCondicionado == JOptionPane.YES_OPTION){
			 arCondicionado = true;
		}
		int strDirecaoHidraulica = JOptionPane.showConfirmDialog(null,"Possui direcao hidraulica? ","Cadastro" ,JOptionPane.YES_NO_OPTION);
		if (strDirecaoHidraulica == JOptionPane.YES_OPTION){
			 direcaoHidraulica = true;
		}
		int strCambioAutomatico = JOptionPane.showConfirmDialog(null, "Possui cambio Automatico? ", "Cadastro", JOptionPane.YES_OPTION);
		if (strCambioAutomatico == JOptionPane.YES_OPTION){
			cambioAutomatico = true;
	   }
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

		try {
			if (resposta == false) {
				throw new ObjetoNaoEncontradoException(" - Objeto nao encontrado!");
			}
		} catch (ObjetoNaoEncontradoException e) {
			String msg =  "ObjetoNaoEncontradoException" + e.getMessage();
			JOptionPane.showMessageDialog(null, msg);
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
				JOptionPane.showMessageDialog(null, "marca alterada com sucesso!");
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
				String capMod = JOptionPane.showInputDialog("Digite a nova Capacidade do tanque de combustivel: ");
				float capT = Float.parseFloat(capMod);
				l.setCapacidadeTanque(capT);
				JOptionPane.showMessageDialog(null, "alterada com sucesso!");
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
		return vecPesquisado;
	}

}

