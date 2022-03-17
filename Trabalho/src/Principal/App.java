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
                            // ****SO TESTE, PODE APAGAR****
                            email = JOptionPane.showInputDialog(null, "Digite o email");
                            celular = JOptionPane.showInputDialog(null, "Digite o celular");
                            logradouro = JOptionPane.showInputDialog(null,
                                    "    //////ENDERECO//////\nDigite o logradouro");
                            numero = JOptionPane.showInputDialog(null, "Digite o numero");
                            complemento = JOptionPane.showInputDialog(null, "Digite o complemento");
                            bairro = JOptionPane.showInputDialog(null, "Digite o bairro");
                            cidade = JOptionPane.showInputDialog(null, "Digite o cidade");
                            cep = JOptionPane.showInputDialog(null, "Digite o cep");
                            /* INSTANCIACAO */
                            locatorio[i] = new Locatorio(celular, email, logradouro, numero, complemento, bairro,
                                    cidade, cep);
                            locatorio[i].printar();
                            i++;

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

                            JOptionPane.showMessageDialog(null, "Menu de Pesquisa de Veículos:\n" +
                                    "   A) Pesquisar veículo pelo Renavam\n" +
                                    "   B) Pesquisar veículo por marca, modelo ou renavam\n");

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

        } while (escolha.toUpperCase() != "D");

    }
}
