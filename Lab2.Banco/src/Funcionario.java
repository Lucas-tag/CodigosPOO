public class Funcionario extends Pessoa{
    private final String matricula;
    private double salario;
    private final Banco banco;

    public Funcionario(String nome, String cpf, Banco banco, String matricula){
        super(nome, cpf);
        this.banco = banco;
        this.matricula = matricula;
        this.salario = Banco.salario;
    }

    protected String getMatricula(){
        return this.matricula;
    }

    public Banco getBanco(){
        return banco;
    }

    protected double getSalario(){
        return this.salario;
    }

    protected void setSalario(double salario){
        this.salario = salario;
    }


    public void imprimirContracheque(){
        System.out.printf("Contracheque:\n  salário atual: %f", salario);
    }

    @Override
    public String toString (){
        return(super.toString() +
                "\nMatricula:" + matricula +
                "\nSalario:" + salario);
    }
}