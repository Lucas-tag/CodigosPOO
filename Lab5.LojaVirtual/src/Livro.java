import java.math.BigDecimal;

public class Livro extends Produto implements Transportavel {
    private int numeroDePaginas;
    private float peso;

    Livro(BigDecimal preco, String marca, String descricao, int numeroDePaginas, float peso) {
        super(preco, marca, descricao);
        this.numeroDePaginas = numeroDePaginas;
        this.peso = peso;
    }

    @Override
    public float getPeso() {return peso;}
    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }
}
