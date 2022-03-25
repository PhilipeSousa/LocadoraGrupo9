package gerenciaLocatarios;

public class PessoaFisica extends Locatario {
	String nomeCompleto;
	String estadoCivil;
	String cpf;

	public PessoaFisica(String nomeCompleto2, String estadoCivil2, String cpf2, String email, String celular) {
		this.nomeCompleto = nomeCompleto2;
		this.estadoCivil = estadoCivil2;
		this.cpf = cpf2;
		this.email = email;
		this.celular = celular;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
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
