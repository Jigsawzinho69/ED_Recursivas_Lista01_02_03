package RecursivasL01;

/*4. Crie uma função recursiva que exiba o total de elementos nega�vos de um vetor de inteiros, de N 
posições, passado como parâmetro:
O código deve trazer como comentários:
A condição de parada
Como escrever a função para o termo n em função do termo anterior*/

public class Ex04 {

    public static void main(String[] args) {
        int[] vetor = {3, -7, 1, -8, 4};
        System.out.println("Total de elementos negativos no vetor: " + ContarNegativos.contarNegativos(vetor, vetor.length));
    }

    static class ContarNegativos {
        public static int contarNegativos(int[] vetor, int tamanho) {
            if (tamanho == 0) {
                return 0;
            }
            int count = contarNegativos(vetor, tamanho - 1);
            return vetor[tamanho - 1] < 0 ? count + 1 : count;
        }
    }
}
