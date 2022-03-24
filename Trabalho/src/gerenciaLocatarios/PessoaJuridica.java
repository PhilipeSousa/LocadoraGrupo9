package GerenciadorLocatario;

public class PessoaJuridica extends Locatario {
	String cnpj;
	String nomeSocial;
	
	public PessoaJuridica(String cnpj2, String nomeSocial2, String email, String telefone) {
		this.cnpj = cnpj2;
		this.nomeSocial = nomeSocial2;
		this.email = email;
		this.telefone = telefone;
	}
}
