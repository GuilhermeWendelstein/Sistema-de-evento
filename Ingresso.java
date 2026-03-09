package evento;

public class Ingresso {

    private int codigo;
    private double valor;

    public Ingresso(int codigo, double valor) {
        this.codigo = codigo;
        this.valor = valor;
    }

    public int getCodigo() {
        return codigo;
    }

    public String resumo() {
        return "Ingresso #" + codigo + " | Valor: R$" + valor;
    }
}
