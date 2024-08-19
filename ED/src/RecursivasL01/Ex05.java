package RecursivasL01;

/*5. Criar uma aplicação em Java que tenha uma função recursiva que, recebendo um número 
inteiro (N), apresente a saída da somatória (...)
• O Código deve apresentar, em formato de comentário, como foi definida a condição 
de parada;
• O Código deve apresentar, em formato de comentário, como foi definida a relação de 
chamada dos passos;*/

public class Ex05 {

    public static void main(String[] args) {
        System.out.println("Somatória harmônica de 5: " + SomatoriaHarmonica.somatoriaHarmonica(5));
    }

    static class SomatoriaHarmonica {
        public static double somatoriaHarmonica(int n) {
            if (n == 1) {
                return 1;
            }
            return 1.0 / n + somatoriaHarmonica(n - 1);
        }
    }
}
