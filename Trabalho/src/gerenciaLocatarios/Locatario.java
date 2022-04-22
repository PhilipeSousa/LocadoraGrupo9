package gerenciaLocatarios;

import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;

public class Locatario {
	String email;
	String celular;
	Endereco endereco;
	static List<PessoaFisica> pfs = new LinkedList<PessoaFisica>();
	static List<PessoaJuridica> pjs = new LinkedList<PessoaJuridica>();

	public String getEmail() {
		return email;
	}

	public String getcelular() {
		return celular;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public static boolean cadastrarLocatario(PessoaFisica pf, PessoaJuridica pj, String escolha) {
		boolean resposta = false;

		if (escolha.equals("F")) {
			resposta = pfs.add(pf);

		} else if (escolha.equals("J")) {
			resposta = pjs.add(pj);
		} else {
			JOptionPane.showMessageDialog(null, "Valor errado");
		}

		if (resposta == true) {
			JOptionPane.showMessageDialog(null, "True");
			JOptionPane.showMessageDialog(null, pj);
		}
		return resposta;
	}

	public static void cadastrarPessoaFisica() {

		String nome = JOptionPane.showInputDialog("Nome: ");
		String estadoCivil = JOptionPane.showInputDialog("Estado Civil: ");
		String cpf = JOptionPane.showInputDialog("CPF: ");
		String email = JOptionPane.showInputDialog("E-mail: ");
		String celular = JOptionPane.showInputDialog("celular: ");
		String cidade1 = JOptionPane.showInputDialog("Cidade: ");
		String estado1 = JOptionPane.showInputDialog("Estado: ");
		String rua1 = JOptionPane.showInputDialog("Rua: ");
		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("N�mero: "));
		String complemento1 = JOptionPane.showInputDialog("Complemento: ");
		String bairro1 = JOptionPane.showInputDialog("Bairro: ");
		String cep1 = JOptionPane.showInputDialog("CEP: ");
		PessoaFisica pf = new PessoaFisica(nome, estadoCivil, cpf, email, celular);
		pf.setEndereco(new Endereco(cidade1, estado1, rua1, numero1, complemento1,
				bairro1, cep1));
		cadastrarLocatario(pf, null, "F");
	}

	public static void cadastrarPessoaJuridica() {

		String cnpj = JOptionPane.showInputDialog("CNPJ: ");
		String nomeSocial = JOptionPane.showInputDialog("Nome social: ");
		String email = JOptionPane.showInputDialog("E-mail: ");
		String celular = JOptionPane.showInputDialog("celular: ");
		PessoaJuridica pj = new PessoaJuridica(cnpj, nomeSocial, email, celular);
		cadastrarLocatario(null, pj, "J");
	}

	public static String mostrarCadastro() {
		String resposta = "";
		for (PessoaFisica pf : pfs) {
			resposta += pf.getNomeCompleto() + '\n';
		}

		for (PessoaJuridica pj : pjs) {
			resposta += pj.getRazaoSocial() + '\n';
		}
		return resposta;
	}

	// public static Locatario buscarLocatario() {
	/*
	 * JOptionPane.showMessageDialog(null, "Realizar busca de locat�rio ");
	 * String nomeCpf = JOptionPane.showInputDialog("Digite um nome ou CPF: ");
	 * 
	 * for (int x = 0; x < loc.length; x++) {
	 * if (loc[x] instanceof PessoaFisica) {
	 * PessoaFisica temp = (PessoaFisica) loc[x];
	 * String nomeLocatario = temp.getNome();
	 * String cpfLocatario = temp.getCpf();
	 * if (cpfLocatario.equals(nomeCpf)| nomeLocatario.equals(nomeCpf)) {
	 * return loc[x];
	 * }
	 * }
	 * }
	 * return null;
	 */
	// }

	public static void alterarLocatario() {
		// Implementar o m�todo alterar locat�rio
	}

	public static boolean pesquisarLocatario(String escolha) {
		boolean resposta = false;

		if (escolha.equalsIgnoreCase("F")) {
			String esc = JOptionPane.showInputDialog(null, "Buscar por nome, cpf, ou email:");
			for (PessoaFisica pf : pfs) {
				if (pf.getCpf().contains(esc) || pf.getNomeCompleto().contains(esc) || pf.getEmail().contains(esc)) {
					JOptionPane.showMessageDialog(null, "Encontrado cadastro:\nNome: " + pf.getNomeCompleto() +
							"\nCPF: " + pf.getCpf());
					resposta = true;
				}
			}

		} else if (escolha.equalsIgnoreCase("J")) {
			String esc = JOptionPane.showInputDialog(null, "Buscar por Razao social, cnpj ou email:");
			for (PessoaJuridica pj : pjs) {
				if (pj.getCnpjPJ().contains(esc) || pj.getRazaoSocial().contains(esc) || pj.getEmail().contains(esc)) {
					JOptionPane.showMessageDialog(null, "Encontrado o cadastro:\nRazao social: " + pj.getRazaoSocial() +
							"\nCNPJ: " + pj.getCnpjPJ());
					resposta = true;
				}
			}

		} else {
			JOptionPane.showMessageDialog(null, "Valor invalido");
		}

		if (resposta == false) {
			JOptionPane.showMessageDialog(null, "NAO Encontrado");
		}
		return resposta;
	}

	public static boolean removerLocatario(String escolha, PessoaFisica pf, PessoaJuridica pj) {
		boolean resposta = false;
		pesquisarLocatario(escolha);
		pfs.contains(pf);
		if (escolha.equalsIgnoreCase("F")) {
			if (pfs.contains(pf)) {
				resposta = pfs.remove(pf);
			}

		} else if (escolha.equalsIgnoreCase("J")) {
			JOptionPane.showMessageDialog(null, "Valor do cnpj");

			if (pjs.contains(pj)) {
				resposta = pjs.remove(pj);
			}

		} else {
			JOptionPane.showMessageDialog(null, "Valor invalido");
		}
		return resposta;
	}
}
