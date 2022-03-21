package Principal;

import javax.swing.JOptionPane;

import gerenciaLocatorios.*;
//import gerenciaReservas.*;
//import gerenciaFrota.*;

public class App {
    public static void main(String[] args) throws Exception {
        /////////////////////////////////// VARIAVEIS ///////////////////////////
        String escolha, segundaEscolha, terceiraEscolha, celular, email, logradouro, complemento, bairro, cidade, cep,
                numero;
        int i = 0;

        /////////////////////////////////// INSTANCIACAO ///////////////////////////
        Locatorio[] locatorio = new Locatorio[99];

        /////////////////////////////////// MENU ///////////////////////////////////
        String nome = JOptionPane.showInputDialog(null, "Digite o nome da Empresa");
        int prefixo1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o primeiro prefixo do CNPJ"));
        int prefixo2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o segundo prefixo do CNPJ"));
        int prefixo3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o terceiro prefixo do CNPJ"));
        int sufixo = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o sufixo do CNPJ"));

        /* INSTANCIACAO */
        Locadora locadora = new Locadora(nome, prefixo1, prefixo2, prefixo3, sufixo);
        // Cnpj cnpj = new Cnpj(prefixo1, prefixo2, prefixo3, sufixo);
        // Colocar LOCADORA como main??

        do {
            JOptionPane.showMessageDialog(null,
                    "Locadora: " + locadora.getNome() + " de CNPJ: "
                            + locadora.printarCnpj(prefixo1, prefixo2, prefixo3, sufixo) + "\n\n" +
                            "Menu Principal\n" +
                            "A) Gerenciar Locatários\n" +
                            "B) Gerenciar Frota\n" +
                            "C) Gerenciar Reservas\n" +
                            "D) Sair do Programa\n");

            escolha = JOptionPane.showInputDialog(null, "Sua primeira escolha:");

            switch (escolha.toUpperCase()) {
                case "A": // GERENCIAR LOCATARIOS

                    JOptionPane.showMessageDialog(null, "Menu Gerência de Locatários:\n" +
                            "   A) Cadastrar Locatário\n" +
                            "   B) Buscar Locatário\n" +
                            "   C) Pesquisar Locatário\n" +
                            "   D) Excluir locatário\n");

                    segundaEscolha = JOptionPane.showInputDialog(null, "Sua segunda escolha:");

                    switch (segundaEscolha.toUpperCase()) {
                        case "A":
                            // CADASTRAR LOCATARIO
                        	 cadastrarLocatario();
                            break;

                        case "B":
                            // BUSCAR LOCATARIO
                        	 filtroDeBusca();
                            break;

                        case "C":
                            // PESQUISAR LOCATARIO
                        	pesquisarLocatarioNome();
                            break;

                        case "D":
                            // EXCLUIR LOCATARIO
                        	excluirLocatario();

                            break;

                        default:
                            break;
                    }
                    break;

                case "B": // GERENCIAR FROTA

                    JOptionPane.showMessageDialog(null, "Menu Gerência de Frotas:\n" +
                            "   A) Cadastrar veículos\n" +
                            "   B) Pesquisar Veículo\n" +
                            "   C) Atualizar dados de um veículo\n" +
                            "   D) Remover veículo da frota\n");

                    segundaEscolha = JOptionPane.showInputDialog(null, "Sua segunda escolha:");

                    switch (segundaEscolha.toUpperCase()) {
                        case "A": // CADASTRAR VEICULO

                            JOptionPane.showMessageDialog(null, "Menu de Cadastro de Veículos:\n" +
                                    "   A) Cadastrar veiculo de passeio\n" +
                                    "   B) Cadastrar veículo utilitário\n" +
                                    "   C) Cadastrar Motocicleta\n");

                            terceiraEscolha = JOptionPane.showInputDialog(null, "Sua terceira escolha:");

                            switch (terceiraEscolha.toUpperCase()) {
                                case "A":
                                    // CADASTRAR VEICULO PASSEIO
                                	cadastrarVeiculo();
                                    break;

                                case "B":
                                    // CADASTRAR VEICULO UTILITARIO
                                	cadastrarVeiculo();
                                    break;

                                case "C":
                                    // CADASTRAR MOTOCICLETA
                                	cadastrarVeiculo();
                                    break;

                                default:
                                    break;
                            }
                            break;

                        case "B": // PESQUISAR VEICULO

                            JOptionPane.showMessageDialog(null, "Menu de Pesquisa de Veículos:\n" +
                                    "   A) Pesquisar veículo pelo Renavam\n" +
                                    "   B) Pesquisar veículo por marca, modelo ou renavam\n");

                            terceiraEscolha = JOptionPane.showInputDialog(null, "Sua terceira escolha:");

                            switch (terceiraEscolha.toUpperCase()) {
                                case "A":
                                    // PESQUISAR VEICULO PELO RENAVAM
                                	pesquisarRENAVAN();

                                    break;

                                case "B":
                                    // PESQUISARA VEICULO POR MARCA, MODELO OU RENAVAM
                                	pesquisarMMR();
                                    break;

                                default:
                                    break;
                            }
                            break;

                        case "C":
                            // ATUALIZAR DADOS DE UM VEICULO
                        	editarDadosVeiculo();
                            break;

                        case "D":
                            // REMOVER VEICULOS DA FROTA
                        	excluirVeiculo();

                            break;

                        default:
                            break;
                    }
                    break;

                case "C":
                    // GERENCIAR RESERVAS
                	 emitirRelatorio();
                	 emitirRelatorioConsolidado();

                    break;

                case "D":
                    // SAIR DO PROGRAMA
                    System.exit(0);
                    break;

                default:
                    break;
            }

        } while (escolha.toUpperCase() != "D");

    }


	private static void emitirRelatorioConsolidado() {
		
	}


	private static void emitirRelatorio() {
		
	}


	private static void excluirVeiculo() {
		
	}


	private static void editarDadosVeiculo() {	
		
	}


	private static void pesquisarRENAVAN() {
		
	}


	private static void pesquisarMMR() {
		
	}


	private static void cadastrarVeiculo() {
		
		
	}


	private static void excluirLocatario() {
		
	}

	private static void pesquisarLocatarioNome() {
	
	}

	private static void filtroDeBusca() {
		
		
	}

	private static void cadastrarLocatario() {
		
	}
}
