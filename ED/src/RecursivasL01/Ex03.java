package RecursivasL01;

/* 3. Crie uma função recursiva que exiba o resultado do fatorial de um número (Pela limitação da 
recursividade, o número de entrada deverá ser baixo para não dar estouro(limite de entrada = 12)):
O código deve trazer como comentários:
A condição de parada
Como escrever a função para o termo n em função do termo anterio*/

public class Ex03 {

    public static void main(String[] args) {
        System.out.println("Fatorial de 5: " + Fatorial.fatorial(5));
    }

    static class Fatorial {
        public static int fatorial(int n) {
            if (n == 0 || n == 1) {
                return 1;
            }
            return n * fatorial(n - 1);
        }
    }
}
