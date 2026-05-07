public class Main {
  public static void main(String[] args) {
    String[] nomes = {"Lucas", "Gina Linetti", "Rosa Diaz", " Jake Peralta", "Charles Boyle", "Laura", "Ray Holt"};
    int numeroDeFuncionarios = 0; //Isso deveria estar armazenado em Banco, mas é só para dar um número de matricula de maneira simples
    boolean ehGerente;
    Gerente gerente;
    Banco banco = new Banco("Caixa");

    for (int cont = 0; cont < nomes.length; cont++) {
      String nome = nomes[cont];
      String cpf = Gerador.gerarCPF(nomes[cont]);
      String matricula = Gerador.gerarMatricula(numeroDeFuncionarios);
      ehGerente = cont >= 5;
      banco.adicionarFuncionario(nome, cpf, matricula, ehGerente);
      numeroDeFuncionarios++;
    }

    for (int cont = 0; cont < 5; cont++) {
      gerente = cont < 3
              ? (Gerente) banco.funcionarios.get(nomes.length - 1)
              : (Gerente) banco.funcionarios.get(nomes.length - 2);
      gerente.adicionarSubordinado(banco.funcionarios.get(cont));
    }

    gerente = (Gerente) banco.funcionarios.get(nomes.length - 1);
    System.out.println(gerente.toString()+"\n");
    gerente.imprimirEquipe();
    gerente = (Gerente) banco.funcionarios.get(nomes.length - 2);
    System.out.println("\n"+gerente.toString()+"\n");
    gerente.imprimirEquipe();

    System.out.println("\n");
    banco.promoverFuncionario(banco.funcionarios.get(1));
    System.out.println("\n");
    banco.promoverFuncionario(gerente);
  }
}