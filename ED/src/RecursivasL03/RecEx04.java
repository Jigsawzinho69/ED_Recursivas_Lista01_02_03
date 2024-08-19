package RecursivasL03;

/* 4. Criar uma aplicação em Java que tenha uma função recursiva que, recebendo um número 
inteiro, converta para binário. Entrada limitada a 2000.
• O Código deve apresentar, em formato de comentário, como foi definida a condição de 
parada;
• O Código deve apresentar, em formato de comentário, como foi definida a relação de 
chamada dos passos*/

public class RecEx04 {

    public static void main(String[] args) {
        int numero = 19;
        System.out.println("O número " + numero + " em binário é: " + ConverterParaBinario.converter(numero));
    }

    static class ConverterParaBinario {
        public static String converter(int n) {
            // Quando o número for 0, a conversão termina
            if (n == 0) {
                return "";
            }
            // Concatena o resultado da divisão por 2 à direita da chamada recursiva
            return converter(n / 2) + (n % 2);
        }
    }
}
