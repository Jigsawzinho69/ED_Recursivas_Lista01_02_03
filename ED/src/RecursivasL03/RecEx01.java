package RecursivasL03;

/* 1. Crie uma função recursiva que exiba a quan�dade de dígitos de um número inteiro passado como 
parâmetro:
O código deve trazer como comentários:
A condição de parada
Como escrever a função para o termo n em função do termo anterior*/

public class RecEx01 {

    public static void main(String[] args) {
        int N = 12345; 
        System.out.println("Quantidade de dígitos em " + N + ": " + ContagemDigitos.contaDigitos(N));
    }

    static class ContagemDigitos {
        public static int contaDigitos(int n) {
            // Quando o número é menor que 10, possui apenas 1 dígito
            if (n < 10 && n > -10) {
                return 1;
            }
            // Chamada: contarDigitos(n) = 1 + contarDigitos(n/10)
            return 1 + contaDigitos(n / 10);
        }
    }
}
