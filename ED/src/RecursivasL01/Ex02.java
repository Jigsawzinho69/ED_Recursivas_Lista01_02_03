package RecursivasL01;

/*2. Criar uma aplicação em Java que tenha uma função recursiva que, recebendo um vetor de inteiros, o 
tamanho do vetor e o valor da úl�ma posição do vetor como o primeiro menor valor, retorne o menor 
valor con�do neste vetor.
O Código deve apresentar, em formato de comentário, como foi definida a condição de parada;
O Código deve apresentar, em formato de comentário, como foi definida a relação de chamada dos passos;*/

public class Ex02 {

    public static void main(String[] args) {
        int[] vetor = {3, 7, 1, 8, 4};
        System.out.println("Menor valor no vetor: " + MenorValor.menorValor(vetor, vetor.length));
    }

    static class MenorValor {
        public static int menorValor(int[] vetor, int tamanho) {
            if (tamanho == 1) {
                return vetor[0];
            }
            int menor = menorValor(vetor, tamanho - 1);
            return Math.min(menor, vetor[tamanho - 1]);
        }
    }
}
