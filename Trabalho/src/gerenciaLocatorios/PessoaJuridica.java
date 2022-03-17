package gerenciaLocatorios;

import Principal.Cnpj;

public class PessoaJuridica extends Locatorio {
    // FALTA RESOLVER **FUNCIONARIOS
    private PessoaFisica[] funcionarios = new PessoaFisica[99];

    private int prefixo1, prefixo2, prefixo3, sufixo;
    private Cnpj cnpj = new Cnpj(prefixo1, prefixo2, prefixo3, sufixo);

    private String razaoSocial;

    public PessoaJuridica(String celular, String email, String logradouro, String numero, String complemento,
            String bairro, String cidade, String cep, String razaoSocial, int prefixo1, int prefixo2, int prefixo3,
            int sufixo) {

        super(celular, email, logradouro, numero, complemento, bairro, cidade, cep);
        this.razaoSocial = razaoSocial;

        this.prefixo1 = cnpj.getPrefixo1();
        this.prefixo1 = prefixo1;
        this.prefixo2 = cnpj.getPrefixo2();
        this.prefixo2 = prefixo2;
        this.prefixo3 = cnpj.getPrefixo3();
        this.prefixo3 = prefixo3;
        this.sufixo = cnpj.getSufixo();
        this.sufixo = sufixo;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void cadastrarFuncionario() {

    }
}
