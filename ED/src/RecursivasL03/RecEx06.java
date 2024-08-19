package RecursivasL03;

public class RecEx06 {

    public static void main(String[] args) {
        int N = 5;
        System.out.println("A somatória até " + N + " é: " + Somatoria.calcularSoma(N));
    }

    static class Somatoria {
        public static double calcularSoma(int n) {
            // Parada: Se n for 1, a soma é 1 (correspondendo ao termo 1/1!)
            if (n == 1) {
                return 1.0;
            }
            // Soma atual é 1/n! + soma dos termos anteriores
            return 1.0 / fatorial(n) + calcularSoma(n - 1);
        }

        private static int fatorial(int n) {
            // Condição de parada para o fatorial: Se n for 0 ou 1, o fatorial é 1
            if (n == 0 || n == 1) {
                return 1;
            }
            // Relação de chamada para o fatorial: n! = n * (n-1)!
            return n * fatorial(n - 1);
        }
    }
}
