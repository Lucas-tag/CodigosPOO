import java.util.Random;
public class Gerador {

    public static String gerarMatricula(int numeroDeFuncionario){

        return String.format("%010d", numeroDeFuncionario);
    }

    //implementado com IA, pois não era pra
    public static String gerarCPF(String entrada) {
        int[] cpf = new int[11];

        // 🔹 1. Gerar os 9 primeiros dígitos com base na entrada
        Random random = new Random(entrada.hashCode());

        for (int i = 0; i < 9; i++) {
            cpf[i] = random.nextInt(10);
        }

        // 🔹 2. Calcular primeiro dígito verificador
        int soma = 0;
        for (int i = 0; i < 9; i++) {
            soma += cpf[i] * (10 - i);
        }

        int resto = soma % 11;
        cpf[9] = (resto < 2) ? 0 : 11 - resto;

        // 🔹 3. Calcular segundo dígito verificador
        soma = 0;
        for (int i = 0; i < 10; i++) {
            soma += cpf[i] * (11 - i);
        }

        resto = soma % 11;
        cpf[10] = (resto < 2) ? 0 : 11 - resto;

        // 🔹 4. Montar string final
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < 11; i++) {
            resultado.append(cpf[i]);
        }

        return resultado.toString();
    }
}