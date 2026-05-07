import java.util.ArrayList;

public class Gerente extends Funcionario{

    public ArrayList<Funcionario> subordinados;

    public Gerente(String nome, String cpf, Banco banco, String matricula){
        super(nome, cpf, banco, matricula);
        super.setSalario(2*Banco.salario);
        this.subordinados = new ArrayList<>();
    }

    @Override
    public String toString(){
        return(super.toString() + "Tamanho da equipe: " + subordinados.size());
    }

    public void adicionarSubordinado(Funcionario novoSubordinado){
        Banco banco = getBanco();

        if(!banco.funcionarios.contains(novoSubordinado)){
            throw new IllegalArgumentException(
                "Essa pessoa não é um funcionário válido do banco do gerente!!"
            );
        }
        subordinados.add(novoSubordinado);
    }

    public void imprimirEquipe(){
        int contador = 0;
        while (subordinados.size()-contador > 0){
            Funcionario subordinado = subordinados.get(contador);
            System.out.println(subordinado.toString());
            contador++;
        }
    }
}
