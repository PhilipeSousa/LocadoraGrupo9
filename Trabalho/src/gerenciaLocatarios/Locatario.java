package gerenciaLocatarios;

public class Locatario {

     String logradouro;
     int numero;
     String complemento;
     String bairro;
     String cidade;
     String cep;

     Endereco endereco = new Endereco(logradouro, numero, complemento, bairro, cidade, cep);

     String celular;
     String email;

    public Locatario(String celular, String email, String logradouro, int numero, String complemento, String bairro,
            String cidade, String cep) {
        this.celular = celular;
        this.email = email;

        this.logradouro = endereco.getLogradouro();
        this.logradouro = logradouro;

        this.numero = endereco.getNumero();
        this.numero = numero;

        this.complemento = endereco.getComplemento();
        this.complemento = complemento;

        this.bairro = endereco.getBairro();
        this.bairro = bairro;

        this.cidade = endereco.getCidade();
        this.cidade = cidade;

        this.cep = endereco.getCep();
        this.cep = cep;
    }

    public String getEmail() {
        return email;
    }

    public String getCelular() {
        return celular;
    }

}
