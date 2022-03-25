package gerenciaLocatarios;

public class PessoaJuridica extends Locatario {
	String cnpjPJ;
	String razaoSocial;

	PessoaFisica[] funcionarios = new PessoaFisica[0];

	public PessoaJuridica(String cnpjPJ2, String razaoSocial2, String email, String celular) {
		this.cnpjPJ = cnpjPJ2;
		this.razaoSocial = razaoSocial2;
		this.email = email;
		this.celular = celular;
	}

	public static void cadastrarFuncionario(PessoaFisica pf) {

	}
}
