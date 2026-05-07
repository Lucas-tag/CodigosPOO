public class ContaCorrente{

    long numeroDaContaCorrente;
    Pessoa correntista;
    double saldoEmReais; //Não deveria ser float, pois é dinheiro, mas tá valendo
    int limiteDoChequeEspecial; //Até quanto o saldo da conta pode ficar negativo

    public ContaCorrente(Pessoa correntista, long numeroDaContaCorrente){
        this.numeroDaContaCorrente = numeroDaContaCorrente;
        this.correntista = correntista;
    }
}