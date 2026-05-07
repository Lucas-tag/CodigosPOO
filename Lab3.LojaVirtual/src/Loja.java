import java.util.ArrayList;

public class Loja {
    ArrayList<Produto> produtos = new ArrayList<Produto>();

    public String cadastrarProduto(float preco, String marca, String descricao){
        Produto novoProduto = new Produto(preco, marca, descricao);
        produtos.add(novoProduto);
        return "O produto foi adicionado: " + novoProduto.toString();
    }

    public String venderProduto(Produto compra){
        if(produtos.contains(compra)){
            return "Venda realizada com sucesso!";
        }
        return "Produto não cadastrado!";
    }
}
