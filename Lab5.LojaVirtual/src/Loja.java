import java.util.ArrayList;

public abstract class Loja {
    private Transportadora transportadora;
    private ArrayList<Vendavel> cadastrados;

    Loja(Transportadora transportadora){
        this.transportadora = transportadora;
        cadastrados = new ArrayList<Vendavel>();
    }

    public String cadastrar(Vendavel novo){
        cadastrados.add(novo);
        return "Novo cadastro: " + novo.toString();
    }

    public String vender(Vendavel compra, String endereco){
        if(cadastrados.contains(compra) && receberPagamento()){
            if(compra instanceof Transportavel){
                transportadora.transportar((Transportavel) compra, endereco);
            }
            return "Venda realizada com sucesso! " + compra.toString();
        }
        return "Falha na venda! " + compra.toString();
    }

    protected abstract boolean receberPagamento();
}
