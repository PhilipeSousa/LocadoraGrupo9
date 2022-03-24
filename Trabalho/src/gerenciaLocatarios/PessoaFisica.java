package GerenciadorLocatario;

public class PessoaFisica extends Locatario {
	String nome;
	String estadoCivil;
	String cpf;
	
	public PessoaFisica(String nome2, String estadoCivil2, String cpf2, String email, String telefone) {
		this.nome = nome2;
		this.estadoCivil = estadoCivil2;
		this.cpf = cpf2;
		this.email = email;
		this.telefone = telefone;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	public String getEstadoCivil() {
		return estadoCivil;
	}
}
