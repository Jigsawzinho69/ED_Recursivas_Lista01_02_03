package RecursivasL03;

public class RecEx05 {

    public static void main(String[] args) {
        int posicao = 10;
        if (posicao <= 20 && posicao > 0) {
            System.out.println("O valor na posição " + posicao + " da série de Fibonacci é: " + Fibonacci.calcular(posicao));
        } else {
            System.out.println("A posição deve ser entre 1 e 20.");
        }
    }

    static class Fibonacci {
        public static int calcular(int n) {
            // Se a posição for 1 ou 2, o valor é 1
            if (n == 1 || n == 2) {
                return 1;
            }
            // Fibonacci(n) = Fibonacci(n-1) + Fibonacci(n-2)
            return calcular(n - 1) + calcular(n - 2);
        }
    }
}
