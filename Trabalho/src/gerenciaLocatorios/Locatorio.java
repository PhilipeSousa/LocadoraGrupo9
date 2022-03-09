package gerenciaLocatorios;

public class Locatorio {

    private Endereco endereco;

    private String celular;
    private String email;

    public void printar() { // ****So teste pode apagar****
        System.out.println("Cadastro de " + this.getCelular() + " " + this.getEmail() + " efetuado com sucesso.");
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

}
