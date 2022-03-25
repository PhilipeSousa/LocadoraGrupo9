package Principal;

import javax.swing.JOptionPane;

import gerenciaLocatarios.*;
//import gerenciaFrota.*;
//import gerenciaReservas.*;

public class App {
    
     String nomeLocadora;
     String cnpjLocadora;
             
    
    public static void main(String[] args) {
        char opcao = 'D', opcao1 = 'E', opcao2 = 'D', opcao3 = 'D', opcao4 = 'C';

        /////////////////////////////////// INSTANCIACAO ///////////////////////////

        Locatario[] locatario = new Locatario[99];
        // Instanciar reservas
        // Instanciar veiculos

        /////////////////////////////////// MENU ///////////////////////////////////

        do {// Menu Principal
            opcao = menuPrincipal();
            switch (opcao) {
                case 'A': {// Menu Gerencia Locatario

                    do {
                        opcao1 = menuGerenciaLocatario();
                        switch (opcao1) {
                            case 'A': { // Cadastrar locat�rio
                                // Locatario.cadastrarPessoaFisica();
                                break;
                            }
                            case 'B': { // Buscar locat�rio
                                // Locatario.alterarLocatario();
                                break;
                            }
                            case 'C': { // Pesquisar locat�rio
                                // Locatario.pesquisarLocatario();
                                break;
                            }
                            case 'D': { // Remover locat�rio
                                // Locatario.removerLocatario();
                                break;
                            }
                            case 'E': { // Retornar ao menu anterior
                                break;
                            }
                            default:
                                JOptionPane.showMessageDialog(null, "Op��o inv�lida!");
                                opcao1 = 'I';
                        }
                    } while (opcao1 != 'E');
                    break;
                }

                case 'B': {// Gerencia frota
                    do {
                        opcao2 = menuGerenciaFrota();
                        switch (opcao2) {
                            case 'A': { // Cadastrar ve�culos
                                do {
                                    opcao3 = menuCadastroVeiculos();
                                    switch (opcao3) {
                                        case 'A': { // Cadastrar veiculo de passeio
                                            // Veiculos.cadastrarVeiculoPasseio();
                                            break;
                                        }

                                        case 'B': { // Cadastrar ve�culo utilit�rio
                                            // Veiculos.cadastrarVeiculosUtilitarios();
                                            break;
                                        }

                                        case 'C': { // Cadastrar motocicleta
                                            // Veiculos.cadastrarMotocicleta();
                                            break;
                                        }

                                        case 'D': { // Retornar o menu anterior
                                            break;
                                        }

                                        default:
                                            JOptionPane.showMessageDialog(null, "Op��o inv�lida!");
                                            opcao2 = 'I';
                                    }

                                } while (opcao3 != 'D');
                                break;
                            }

                            case 'B': { // Pesquisar ve�culo
                                do {
                                    opcao4 = menuPesquisaVeiculo();
                                    switch (opcao4) {
                                        case 'A': { // Pesquisar pelo Renavam
                                            // Veiculos.pesquisarVeiculosRenavam();
                                            break;
                                        }
                                        case 'B': { // Pesquisar ve�culo por marca, modelo ou renavam
                                            // Veiculos.pesquisarVeiculosMarcaModeloRen();
                                            break;
                                        }
                                        case 'C': { // Retornar ao menu anterior
                                            break;
                                        }
                                        default:
                                            JOptionPane.showMessageDialog(null, "Op��o inv�lida!");
                                            opcao2 = 'I';
                                    }
                                } while (opcao4 != 'C');
                                break;
                            }

                            case 'C': { // Atualizar dados de um ve�culo
                                break;
                            }

                            case 'D': { // Remover ve�culo da frota
                                break;
                            }

                            case 'E': { // Retornar ao menu anterior
                                break;
                            }
                            default:
                                JOptionPane.showMessageDialog(null, "Op��o inv�lida!");
                                opcao2 = 'I';
                        }
                    } while (opcao2 != 'E');
                    break;
                }

                case 'C': { // Gerenciar Reservas
                    break;
                }

                case 'D': { // Sair do Programa
                    break;
                }

                default:
                    JOptionPane.showMessageDialog(null, "Op��o inv�lida!");
                    opcao = 'W';
            }
        } while (opcao != 'D');
    }

    private static char menuPrincipal() {
        char opcao = 'D';
        String menu = "Menu Principal \n"
                + "A) Gerenciar Locat�rios \n"
                + "B) Gerenciar Frota \n"
                + "C) Gerenciar Reservas \n"
                + "D) Sair do Programa";
        String strOpcao = JOptionPane.showInputDialog(menu);
        opcao = strOpcao.charAt(0);
        return opcao;
    }

    private static char menuGerenciaLocatario() {
        char opcao1 = 'E';
        String menu = "Menu Ger�ncia de Locat�rios \n"
                + "A) Cadastrar Locat�rio \n"
                + "B) Buscar Locat�rio \n"
                + "C) Pesquisar Locat�rio \n"
                + "D) Excluir Locat�rio \n"
                + "E) Retornar ao menu anterior";

        String strOpcao1 = JOptionPane.showInputDialog(menu);
        opcao1 = strOpcao1.charAt(0);
        return opcao1;
    }

    private static char menuGerenciaFrota() {
        char opcao2 = 'E';
        String menu = "Menu Ger�ncia de Frotas \n"
                + "A) Cadastrar ve�culos \n"
                + "B) Pesquisar ve�culo\n"
                + "C) Atualizar dados de um ve�culo \n"
                + "D) Remover ve�culos da frota \n"
                + "E) Retornar ao menu anterior";
        String strOpcao2 = JOptionPane.showInputDialog(menu);
        opcao2 = strOpcao2.charAt(0);
        return opcao2;
    }

    private static char menuCadastroVeiculos() {
        char opcao3 = 'D';
        String menu = "Menu de Cadastro de Ve�culos \n"
                + "A) Cadastrar ve�culo de passeio \n"
                + "B) Cadastrar ve�culo utilit�rio \n"
                + "C) Cadastrar motocicleta \n"
                + "D) Retornar ao menu anterior";

        String strOpcao3 = JOptionPane.showInputDialog(menu);
        opcao3 = strOpcao3.charAt(0);
        return opcao3;
    }

    private static char menuPesquisaVeiculo() {
        char opcao4 = 'C';
        String menu = "Menu de Pesquisa de Ve�culos \n"
                + "A) Pesquisar ve�culo pelo Renavam \n"
                + "B) Pesquisar ve�culo por marca, modelo ou renavam \n"
                + "C) Retornar ao menu anterior";

        String strOpcao4 = JOptionPane.showInputDialog(menu);
        opcao4 = strOpcao4.charAt(0);
        return opcao4;
    }
}
