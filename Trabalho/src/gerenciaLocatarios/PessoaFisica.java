package gerenciaLocatarios;

public class PessoaFisica extends Locatario {
    private String nomeCompleto;
    private String cpf;
    private String estadoCivil;

    public PessoaFisica(String celular, String email, String logradouro, int numero, String complemento,
            String bairro, String cidade, String cep, String nomeCompleto, String cpf, String estadoCivil) {

        super(celular, email, logradouro, numero, complemento, bairro, cidade, cep);
        this.nomeCompleto = nomeCompleto;
        this.cpf = cpf;
        this.estadoCivil = estadoCivil;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

}
