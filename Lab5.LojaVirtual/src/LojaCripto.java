public class LojaCripto extends Loja{

    LojaCripto(Transportadora transportadora) {
        super(transportadora);
    }

    @Override
    protected boolean receberPagamento() {
        System.out.println("Pagamento recebido pela loja cripto");
        return true;
    }
}
