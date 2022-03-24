package GerenciadorLocatario;

public class Endereco {
	String cidade,
	estado,
	rua, 
	numero,
	complemento,
	bairro,
	cep;
	
	public Endereco (String cid, String est, String r, String n, String comp, String ba, String ce) {
		this.cidade = cid;
		this.estado = est;
		this.rua = r;
		this.numero = n;
		this.complemento = comp;
		this.bairro = ba;
		this.cep = ce;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}
}
