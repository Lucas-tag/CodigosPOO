public class Livro extends Produto {
    private int numeroDePaginas;

    Livro(float preco, String marca, String descricao, int numeroDePaginas) {
        super(preco, marca, descricao);
        this.numeroDePaginas = numeroDePaginas;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }
}
