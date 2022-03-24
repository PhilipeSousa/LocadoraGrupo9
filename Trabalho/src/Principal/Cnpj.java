package Principal;

public class Cnpj {
     int prefixo1;
     int prefixo2;
     int prefixo3;
     int sufixo;

    public Cnpj(int prefixo1, int prefixo2, int prefixo3, int sufixo) {
        this.prefixo1 = prefixo1;
        this.prefixo2 = prefixo2;
        this.prefixo3 = prefixo3;
        this.sufixo = sufixo;
    }

    public int getPrefixo1() {
        return prefixo1;
    }

    public int getPrefixo2() {
        return prefixo2;
    }

    public int getPrefixo3() {
        return prefixo3;
    }

    public int getSufixo() {
        return sufixo;
    }

}
