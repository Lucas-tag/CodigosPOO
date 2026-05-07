import java.util.ArrayList;

public class Banco {

    public final static float salario = 2000;
    public final static int TAMANHO_MAX_PRO_NOME = 10;
    private String nome;
    public ArrayList<ContaCorrente> contasCorrentes;
    public ArrayList<Funcionario> funcionarios;

    public Banco(String nome) {
        setNome(nome);
        this.contasCorrentes = new ArrayList<>();
        this.funcionarios = new ArrayList<>();
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String novoNome) {
        if (novoNome.length() > TAMANHO_MAX_PRO_NOME) {
            return;  // o correto seria lançar uma exceção
        }
        this.nome = novoNome;
    }

    public int getNumeroDeContasCorrentes() {
        return contasCorrentes.size();
    }

    public void adicionarFuncionario(String nome, String cpf, String matricula, Boolean ehGerente) {
        String nomeDoBanco = this.nome;
        if (!ehGerente) {
            funcionarios.add(new Funcionario(nome, cpf, this, matricula));
            return;
        }
        funcionarios.add(new Gerente(nome, cpf, this, matricula));
    }

    public Funcionario localizarFuncionario(String matricula){
        for(Funcionario funcionario : funcionarios){
            if(matricula.equals(funcionario.getMatricula()))
                return funcionario;
        }
        return null;
    }

    public Gerente localizarGerente(String matricula){
        Funcionario funcionario = localizarFuncionario(matricula);
        return funcionario instanceof Gerente ? (Gerente) funcionario : null;
    }

    public void promoverFuncionario(Funcionario funcionario){
        System.out.printf("O funcionário %s será promovido com sucesso!\n", funcionario.getNome());
        funcionario.setSalario(1.3*funcionario.getSalario());
        System.out.printf("%s\n", funcionario.toString());
    }
}