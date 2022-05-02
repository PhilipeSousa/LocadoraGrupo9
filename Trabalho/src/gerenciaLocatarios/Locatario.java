package gerenciaLocatarios;

import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;

public class Locatario {
	static String email;
	static String celular;
	Endereco endereco;
	static List<PessoaFisica> pfs = new LinkedList<PessoaFisica>();
	static List<PessoaJuridica> pjs = new LinkedList<PessoaJuridica>();
	protected static String nomeCompleto2;
	protected static String estadoCivil2;
	protected static String cpf2;
	static PessoaFisica pf = new PessoaFisica(nomeCompleto2, estadoCivil2, cpf2, email, celular);
	protected static String nome;
	protected static String estadoCivil;
	protected static String cidade1;
	protected static String estado1;
	protected static String rua1;
	protected static String complemento1;
	protected static String bairro1;
	protected static String cep1;
	protected static int numero1;
	private static int valor = 0;

	private static String cnpjPJ2;
	private static String razaoSocial2;
	static PessoaJuridica pj = new PessoaJuridica(cnpjPJ2, razaoSocial2, email, celular);

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
		String cnpjPesquisa = null;

		if (escolha.equals("F")) {
			resposta = pfs.add(pf);
			JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");

		} else if (escolha.equals("J")) {
			resposta = pjs.add(pj);
			JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");

		} else {
			JOptionPane.showMessageDialog(null, "Valor invalido");
		}

		return resposta;
	}

	public static boolean cadastrarFuncionarioLocatario(PessoaFisica pfDePJ) {
		boolean resposta = false;
		String cnpjPesquisa = null;

		cnpjPesquisa = JOptionPane.showInputDialog(null, "Digite o CNPJ da empresa: ");

		for (PessoaJuridica pj : pjs) {
			if (pj.getCnpjPJ().equals(cnpjPesquisa)) {
				JOptionPane.showMessageDialog(null, "Encontrado cadastro:\nRazao Social: " + pj.getRazaoSocial() +
						"\nCNPJ: " + pj.getCnpjPJ());
				resposta = PessoaJuridica.pfsDePJs.add(pfDePJ);
				JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
			} else {
				JOptionPane.showMessageDialog(null, "Nao cadastrado");
			}
		}

		return resposta;
	}

	public static void cadastrarPessoaFisica() {
		boolean repeat = true;

		while (repeat == true) {
			try {
				Locatario.nome = JOptionPane.showInputDialog("Nome: ");
				if (Locatario.nome.equals(""))
					throw new CampoEmBrancoException(" - Campo em Branco");
				repeat = false;

			} catch (CampoEmBrancoException e) {
				String msg = "CampoEmBrancoException" + e.getMessage();
				JOptionPane.showMessageDialog(null, msg);
				repeat = true;
			}
		}
		repeat = true;
		Locatario.estadoCivil = JOptionPane.showInputDialog("Estado Civil: ");

		while (repeat == true) {
			try {
				Locatario.cpf2 = JOptionPane.showInputDialog("CPF: ");
				if (Locatario.cpf2.equals(""))
					throw new CampoEmBrancoException(" - Campo em Branco");
				repeat = false;

			} catch (CampoEmBrancoException e) {
				String msg = "CampoEmBrancoException" + e.getMessage();
				JOptionPane.showMessageDialog(null, msg);
				repeat = true;
			}
		}
		Locatario.email = JOptionPane.showInputDialog("E-mail: ");
		Locatario.celular = JOptionPane.showInputDialog("celular: ");
		Locatario.cidade1 = JOptionPane.showInputDialog("Cidade: ");
		Locatario.estado1 = JOptionPane.showInputDialog("Estado: ");
		Locatario.rua1 = JOptionPane.showInputDialog("Rua: ");
		Locatario.numero1 = Integer.parseInt(JOptionPane.showInputDialog("Numero: "));
		Locatario.complemento1 = JOptionPane.showInputDialog("Complemento: ");
		Locatario.bairro1 = JOptionPane.showInputDialog("Bairro: ");
		Locatario.cep1 = JOptionPane.showInputDialog("CEP: ");
		pf = new PessoaFisica(nome, estadoCivil, cpf2, email, celular);
		pf.setEndereco(new Endereco(cidade1, estado1, rua1, numero1, complemento1,
				bairro1, cep1));
		cadastrarLocatario(pf, null, "F");
	}

	public static void cadastrarPessoaJuridica() {
		boolean repeat = true;

		while (repeat == true) {
			try {
				Locatario.cnpjPJ2 = JOptionPane.showInputDialog("CNPJ: ");
				if (Locatario.cnpjPJ2.equals(""))
					throw new CampoEmBrancoException(" - Campo em Branco");
				repeat = false;

			} catch (CampoEmBrancoException e) {
				String msg = "CampoEmBrancoException" + e.getMessage();
				JOptionPane.showMessageDialog(null, msg);
				repeat = true;
			}
		}
		repeat = true;
		Locatario.razaoSocial2 = JOptionPane.showInputDialog("Nome social: ");

		while (repeat == true) {
			try {
				Locatario.email = JOptionPane.showInputDialog("E-mail: ");
				if (Locatario.email.equals(""))
					throw new CampoEmBrancoException(" - Campo em Branco");
				repeat = false;
			} catch (CampoEmBrancoException e) {
				String msg = "CampoEmBrancoException" + e.getMessage();
				JOptionPane.showMessageDialog(null, msg);
				repeat = true;
			}
		}
		Locatario.celular = JOptionPane.showInputDialog("celular: ");
		pj = new PessoaJuridica(cnpjPJ2, razaoSocial2, email, celular);
		cadastrarLocatario(null, pj, "J");
	}

	// public static String mostrarCadastro() {
	// String resposta = "";
	// for (PessoaFisica pf : pfs) {
	// resposta += pf.getNomeCompleto() + '\n';
	// }

	// for (PessoaJuridica pj : pjs) {
	// resposta += pj.getRazaoSocial() + '\n';
	// }
	// return resposta;
	// }

	public static boolean alterarLocatario(String escolha) {
		boolean resposta = false;

		if (escolha.equalsIgnoreCase("F")) {
			String cpf = JOptionPane.showInputDialog(null, "Buscar por CPF o cadastro a ser alterado: ");
			for (PessoaFisica pf : pfs) {

				if (pf.getCpf().equals(cpf)) {
					JOptionPane.showMessageDialog(null, "Encontrado cadastro:\nNome: " + pf.getNomeCompleto() +
							"\nCPF: " + pf.getCpf());

					int confirmacao = JOptionPane.showConfirmDialog(null, "Deseja alterar o cadastro?",
							"Alterar cadastro",
							JOptionPane.YES_NO_OPTION);

					if (confirmacao == JOptionPane.YES_OPTION) {
						pfs.remove(pf);
						resposta = true;
						valor = 1;
					} else {
						JOptionPane.showMessageDialog(null, "Decisao revogada");
						resposta = true;
					}

				}
			}

			if (valor == 1) {
				cadastrarPessoaFisica();
			}

		} else if (escolha.equalsIgnoreCase("J")) {
			String cnpj = JOptionPane.showInputDialog(null, "Buscar por CNPJ o cadastro a ser alterado: ");
			for (PessoaJuridica pj : pjs) {
				if (pj.getCnpjPJ().equals(cnpj)) {
					JOptionPane.showMessageDialog(null, "Encontrado cadastro:\nRazao Social: " + pj.getRazaoSocial() +
							"\nCNPJ: " + pj.getCnpjPJ());

					int confirmacao = JOptionPane.showConfirmDialog(null, "Deseja alterar o cadastro?",
							"Alterar cadastro",
							JOptionPane.YES_NO_OPTION);

					if (confirmacao == JOptionPane.YES_OPTION) {
						pjs.remove(pj);
						// cadastrarPessoaJuridica();
						resposta = true;
						valor = 1;
					} else {
						JOptionPane.showMessageDialog(null, "Decisao revogada");
						resposta = true;
					}

				}
			}
			if (valor == 1) {
				cadastrarPessoaJuridica();
			}
		} else {
			JOptionPane.showMessageDialog(null, "Valor invalido");
		}

		try {
			if (resposta == false) {
				throw new ObjetoNaoEncontradoException(" - Objeto nao encontrado");
			}

		} catch (ObjetoNaoEncontradoException e) {
			String msg = "ObjetoNaoEncontradoException" + e.getMessage();
			JOptionPane.showMessageDialog(null, msg);
		}

		return resposta;
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

		try {
			if (resposta == false) {
				throw new ObjetoNaoEncontradoException(" - Objeto nao encontrado");
			}

		} catch (ObjetoNaoEncontradoException e) {
			String msg = "ObjetoNaoEncontradoException" + e.getMessage();
			JOptionPane.showMessageDialog(null, msg);
		}

		return resposta;
	}

	public static boolean removerLocatario(String escolha) {
		boolean resposta = false;

		if (escolha.equalsIgnoreCase("F")) {
			String cpf = JOptionPane.showInputDialog(null, "Buscar por CPF o cadastro a ser excluido: ");
			for (PessoaFisica pf : pfs) {
				if (pf.getCpf().equals(cpf)) {
					JOptionPane.showMessageDialog(null, "Encontrado cadastro:\nNome: " + pf.getNomeCompleto() +
							"\nCPF: " + pf.getCpf());

					int confirmacao = JOptionPane.showConfirmDialog(null, "Deseja remover o cadastro?",
							"Remover cadastro",
							JOptionPane.YES_NO_OPTION);

					if (confirmacao == JOptionPane.YES_OPTION) {
						pfs.remove(pf);
						JOptionPane.showMessageDialog(null, "Cadastro removido com sucesso!");
						resposta = true;
					} else {
						JOptionPane.showMessageDialog(null, "Decisao revogada");
						resposta = true;
					}

				}
			}

		} else if (escolha.equalsIgnoreCase("J")) {
			String cnpj = JOptionPane.showInputDialog(null, "Buscar por CNPJ o cadastro a ser excluido: ");
			for (PessoaJuridica pj : pjs) {
				if (pj.getCnpjPJ().equals(cnpj)) {
					JOptionPane.showMessageDialog(null, "Encontrado cadastro:\nRazao Social: " + pj.getRazaoSocial() +
							"\nCNPJ: " + pj.getCnpjPJ());

					int confirmacao = JOptionPane.showConfirmDialog(null, "Deseja remover o cadastro?",
							"Remover cadastro",
							JOptionPane.YES_NO_OPTION);

					if (confirmacao == JOptionPane.YES_OPTION) {
						pjs.remove(pj);
						JOptionPane.showMessageDialog(null, "Cadastro removido com sucesso!");
						resposta = true;
					} else {
						JOptionPane.showMessageDialog(null, "Decisao revogada");
						resposta = true;
					}

				}
			}
		} else {
			JOptionPane.showMessageDialog(null, "Valor invalido");
		}

		try {
			if (resposta == false) {
				throw new ObjetoNaoEncontradoException(" - Objeto nao encontrado");
			}

		} catch (ObjetoNaoEncontradoException e) {
			String msg = "ObjetoNaoEncontradoException" + e.getMessage();
			JOptionPane.showMessageDialog(null, msg);
		}

		return resposta;
	}
}