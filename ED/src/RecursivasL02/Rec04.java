/* Construir uma função recursiva que receba um vetor e seu tamanho e apresente a quan�dade de
números pares existentes no vetor. Considere que a entrada deve ser, apenas de números naturais
diferentes de zero. */

package RecursivasL02;

public class Rec04 {
    public static void main(String[] args) {
        int N = 1;
        int vetor[] = new int[N];
        
        for (int i = 0; i < N; i++) {
            vetor[i] = (int) (Math.random() * 30) + 1;
            System.out.print(vetor[i] + " | ");
        }
        
        int contador = result(vetor, N);
        System.out.println("\nExistem " + contador + " números pares no vetor.");
    }

    public static int result(int vetor[], int N) {
        if (N == 0) {
            return 0;
        } else {
            int cont = result(vetor, N - 1);
            if (vetor[N-1] % 2 == 0) { 
                cont += 1;
            }
            return cont; 
        }
    }
}
