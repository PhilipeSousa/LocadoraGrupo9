package Principal;

public class Locadora {

    private int prefixo1, prefixo2, prefixo3, sufixo;
    private Cnpj cnpj = new Cnpj(prefixo1, prefixo2, prefixo3, sufixo);

    private String nome;

    public Locadora(String nome, int prefixo1, int prefixo2, int prefixo3, int sufixo) {
        this.nome = nome;

        this.prefixo1 = cnpj.getPrefixo1();
        this.prefixo1 = prefixo1;
        this.prefixo2 = cnpj.getPrefixo2();
        this.prefixo2 = prefixo2;
        this.prefixo3 = cnpj.getPrefixo3();
        this.prefixo3 = prefixo3;
        this.sufixo = cnpj.getSufixo();
        this.sufixo = sufixo;
    }

    public String getNome() {
        return nome;
    }

    public String printarCnpj(int prefixo1, int prefixo2, int prefixo3, int sufixo) {
        String strCnpj = prefixo1 + "." + prefixo2 + "."
                + prefixo3 + "-"
                + sufixo;
        return strCnpj;
    }

}
