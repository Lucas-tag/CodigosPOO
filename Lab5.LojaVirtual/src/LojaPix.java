public class LojaPix extends Loja{

    LojaPix(Transportadora transportadora) {
        super(transportadora);
    }

    @Override
    protected boolean receberPagamento() {
        System.out.println("Pagamento recebido pela loja pix");
        return true;
    }
}