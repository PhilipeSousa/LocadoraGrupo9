package gerenciaLocatarios;

//import javax.swing.JOptionPane;

public class Locatario {
	String email;
	String celular;
	Endereco endereco;

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

	private static void cadastrarLocatario(Locatario locat) {
		/*
		 * Locatario[] temp = new Locatario[loc.length + 1];
		 * for (int i = 0; i < loc.length; i++) {
		 * temp[i] = loc[i];
		 * }
		 * temp[loc.length] = locat;
		 * loc = temp;
		 * JOptionPane.showMessageDialog(null, "Locat�rio cadastrado com sucesso!");
		 */
	}

	public static void cadastrarPessoaFisica() {
		/*
		 * String nome = JOptionPane.showInputDialog("Nome: ");
		 * String estadoCivil = JOptionPane.showInputDialog("Estado Civil: ");
		 * String cpf = JOptionPane.showInputDialog("CPF: ");
		 * String email = JOptionPane.showInputDialog("E-mail: ");
		 * String celular = JOptionPane.showInputDialog("celular: ");
		 * String cidade1 = JOptionPane.showInputDialog("Cidade: ");
		 * String estado1 = JOptionPane.showInputDialog("Estado: ");
		 * String rua1 = JOptionPane.showInputDialog("Rua: ");
		 * String numero1 = JOptionPane.showInputDialog("N�mero: ");
		 * String complemento1 = JOptionPane.showInputDialog("Complemento: ");
		 * String bairro1 = JOptionPane.showInputDialog("Bairro: ");
		 * String cep1 = JOptionPane.showInputDialog("CEP: ");
		 * PessoaFisica pfs = new PessoaFisica(nome, estadoCivil, cpf, email, celular);
		 * pfs.setEndereco(new Endereco(cidade1, estado1, rua1, numero1, complemento1,
		 * bairro1, cep1));
		 * cadastrarLocatario(pfs);
		 */
	}

	public static void cadastrarPessoaJuridica() {
		/*
		 * String cnpj = JOptionPane.showInputDialog("CNPJ: ");
		 * String nomeSocial = JOptionPane.showInputDialog("Nome social: ");
		 * String email = JOptionPane.showInputDialog("E-mail: ");
		 * String celular = JOptionPane.showInputDialog("celular: ");
		 * PessoaJuridica pjs = new PessoaJuridica(cnpj, nomeSocial, email, celular);
		 * cadastrarLocatario(pjs);
		 */
	}

	public static void imprimirLocatario() {
		/*
		 * for (int x = 0; x < loc.length; x++) {
		 * if (loc[x] instanceof PessoaFisica) {
		 * PessoaFisica temp = (PessoaFisica) loc[x];
		 * String resposta = temp.getNome() + "\n" +
		 * temp.estadoCivil + "\n" +
		 * temp.cpf + "\n" +
		 * loc[x].getEmail() + "\n" +
		 * loc[x].getcelular() + "\n" +
		 * loc[x].endereco.getCidade() + "\n" +
		 * loc[x].endereco.getEstado() + "\n" +
		 * loc[x].endereco.getRua() + "\n" +
		 * loc[x].endereco.getNumero() + "\n" +
		 * loc[x].endereco.getComplemento() + "\n" +
		 * loc[x].endereco.getBairro() + "\n" +
		 * loc[x].endereco.getCep();
		 * JOptionPane.showMessageDialog(null, resposta);
		 * }
		 * }
		 */
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

	public static void pesquisarLocatario() {
		/*
		 * String nomeCpf = JOptionPane.showInputDialog("Digite um nome ou CPF: ");
		 * boolean indicador = false;
		 * for (int x = 0; x < loc.length; x++) {
		 * if (loc[x] instanceof PessoaFisica) {
		 * PessoaFisica temp = (PessoaFisica) loc[x];
		 * String nomeLocatario = temp.getNome();
		 * String cpfLocatario = temp.getCpf();
		 * if (cpfLocatario.equals(nomeCpf)| nomeLocatario.equals(nomeCpf)) {
		 * JOptionPane.showMessageDialog(null, "Est� na lista!");
		 * indicador = true;
		 * }
		 * }
		 * }
		 * if (indicador == false) {
		 * JOptionPane.showMessageDialog(null, "N�o est� na lista!");
		 * }
		 */
	}

	public static void removerLocatario() {
		/*
		 * Locatario elementoASerRemovido = buscarLocatario();
		 * Locatario[] newLoc = null;
		 * if (elementoASerRemovido instanceof PessoaFisica) {
		 * for (int i = 0; i < loc.length-1; i++) {
		 * if (loc[i] == elementoASerRemovido) {
		 * newLoc = new Locatario[loc.length - 1];
		 * for (int index = 0; index < i; index++) {
		 * newLoc[index] = loc[index];
		 * }
		 * for (int j = i; j < loc.length - 1; j++) {
		 * newLoc[j] = loc[j+1];
		 * }
		 * loc = newLoc;
		 * break;
		 * }
		 * }
		 * JOptionPane.showMessageDialog(null, "Locat�rio removido!");
		 * } else if (elementoASerRemovido == null) {
		 * JOptionPane.showMessageDialog(null, "Locatario n�o encontrado!");
		 * }
		 */
	}
}
