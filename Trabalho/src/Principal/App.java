package Principal;

import javax.swing.JOptionPane;

import gerenciaLocatorios.*;
//import gerenciaReservas.*;
//import gerenciaFrota.*;

public class App {
    public static void main(String[] args) throws Exception {

        String escolha, segundaEscolha, terceiraEscolha;

        /////////////////////////////////// INSTANCIACAO ///////////////////////////
        Locadora locadora = new Locadora();
        Locatorio locatorio = new Locatorio();

        /////////////////////////////////// MENU ///////////////////////////////////
        String nome = JOptionPane.showInputDialog(null, "Digite o nome da Empresa");
        locadora.setNome(nome);

        System.out.println("Locadora: " + locadora.getNome() + " de CNPJ: \n\n" +
                "Menu Principal\n" +
                "A) Gerenciar Locatários\n" +
                "   Menu Gerência de Locatários:\n" +
                "   A) Cadastrar Locatário\n" +
                "   B) Buscar Locatário\n" +
                "   C) Pesquisar Locatário\n" +
                "   D) Excluir locatário\n" +

                "B) Gerenciar Frota\n" +
                "   Menu Gerência de Frotas:\n" +
                "   A) Cadastrar veículos\n" +
                "       Menu de Cadastro de Veículos:\n" +
                "       A) Cadastrar veiculo de passeio\n" +
                "       B) Cadastrar veículo utilitário\n" +
                "       C) Cadastrar Motocicleta\n" +
                "   B) Pesquisar Veículo\n" +
                "      Menu de Pesquisa de Veículos:\n" +
                "      A) Pesquisar veículo pelo Renavam\n" +
                "      B) Pesquisar veículo por marca, modelo ou renavam\n" +
                "   C) Atualizar dados de um veículo\n" +
                "   D) Remover veículo da frota\n" +

                "C) Gerenciar Reservas\n" +
                "D) Sair do Programa\n");

        do {
            escolha = JOptionPane.showInputDialog(null, "Sua primeira escolha:");

            switch (escolha.toUpperCase()) {
                case "A": // GERENCIAR LOCATARIOS
                    segundaEscolha = JOptionPane.showInputDialog(null, "Sua segunda escolha:");

                    switch (segundaEscolha.toUpperCase()) {
                        case "A":
                            // CADASTRAR LOCATARIO
                            String email = JOptionPane.showInputDialog(null, "Digite o email");
                            String celular = JOptionPane.showInputDialog(null, "Digite o celular");
                            locatorio.setEmail(email);
                            locatorio.setCelular(celular);
                            locatorio.printar(); // ****So teste pode apagar****
                            break;

                        case "B":
                            // BUSCAR LOCATARIO
                            break;

                        case "C":
                            // PESQUISAR LOCATARIO
                            break;

                        case "D":
                            // EXCLUIR LOCATARIO

                            break;

                        default:
                            break;
                    }
                    break;

                case "B": // GERENCIAR FROTA
                    segundaEscolha = JOptionPane.showInputDialog(null, "Sua segunda escolha:");

                    switch (segundaEscolha.toUpperCase()) {
                        case "A": // CADASTRAR VEICULO
                            terceiraEscolha = JOptionPane.showInputDialog(null, "Sua terceira escolha:");

                            switch (terceiraEscolha.toUpperCase()) {
                                case "A":
                                    // CADASTRAR VEICULO PASSEIO

                                    break;

                                case "B":
                                    // CADASTRAR VEICULO UTILITARIO
                                    break;

                                case "C":
                                    // CADASTRAR MOTOCICLETA
                                    break;

                                default:
                                    break;
                            }
                            break;

                        case "B": // PESQUISAR VEICULO
                            terceiraEscolha = JOptionPane.showInputDialog(null, "Sua terceira escolha:");

                            switch (terceiraEscolha.toUpperCase()) {
                                case "A":
                                    // PESQUISAR VEICULO PELO RENAVAM

                                    break;

                                case "B":
                                    // PESQUISARA VEICULO POR MARCA, MODELO OU RENAVAM
                                    break;

                                default:
                                    break;
                            }
                            break;

                        case "C":
                            // ATUALIZAR DADOS DE UM VEICULO
                            break;

                        case "D":
                            // REMOVER VEICULOS DA FROTA

                            break;

                        default:
                            break;
                    }
                    break;

                case "C":
                    // GERENCIAR RESERVAS

                    break;

                case "D":
                    // SAIR DO PROGRAMA
                    System.exit(0);
                    break;

                default:
                    break;
            }

        } while (escolha != "D");

    }
}
