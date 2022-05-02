package gerenciaLocatarios;

import java.util.LinkedList;
import java.util.List;

import javax.swing.JOptionPane;

public class PessoaJuridica extends Locatario {
	private String cnpjPJ;
	private String razaoSocial;

	static List<PessoaFisica> pfsDePJs = new LinkedList<PessoaFisica>();
	static PessoaFisica pfDePJ = new PessoaFisica(nomeCompleto2, estadoCivil2, cpf2, email, celular);

	public PessoaJuridica(String cnpjPJ2, String razaoSocial2, String email, String celular) {
		this.cnpjPJ = cnpjPJ2;
		this.razaoSocial = razaoSocial2;
		Locatario.email = email;
		Locatario.celular = celular;
	}

	public static void cadastrarFuncionario() {
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
		pfDePJ = new PessoaFisica(nome, estadoCivil, cpf2, email, celular);
		pfDePJ.setEndereco(new Endereco(cidade1, estado1, rua1, numero1, complemento1,
				bairro1, cep1));
		Locatario.cadastrarFuncionarioLocatario(pfDePJ);
	}

	public String getCnpjPJ() {
		return cnpjPJ;
	}

	public void setCnpjPJ(String cnpjPJ) {
		this.cnpjPJ = cnpjPJ;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

}
