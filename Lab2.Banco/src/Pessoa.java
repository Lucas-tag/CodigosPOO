public class Pessoa{
    private final String cpf;
    private String nome;
    private final static int tamanhMaximoDeNome = 30;

    public Pessoa(String nome, String cpf){
        this.cpf = cpf; //adicionar verificação de cpf
        if(nome.length()<tamanhMaximoDeNome){
            this.nome = nome;
        }
    }

    protected String getNome(){
        return this.nome;
    }

    @Override
    public String toString(){
        return ("Nome:" + nome +
                "\nCPF:" + cpf);
    }
}