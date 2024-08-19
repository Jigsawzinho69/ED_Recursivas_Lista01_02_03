package RecursivasL01;

/* 1. Criar uma aplicação em Java que tenha uma função recursiva que calcule o somatório do N primeiros 
número NATURAIS (a função deve retornar zero para números nega�vos)
O Código deve apresentar, em formato de comentário, como foi definida a condição de parada;
O Código deve apresentar, em formato de comentário, como foi definida a relação de chamada dos passos;*/

public class Ex01 {

    public static void main(String[] args) {
        System.out.println("Somatório de 10: " + SomaN.somando(10));
    }

    static class SomaN {
        public static int somando(int n) {
            if (n < 0) {
                return 0;
            }
            if (n == 0) {
                return 0;
            }
            return n + somando(n - 1);
        }
    }
}
