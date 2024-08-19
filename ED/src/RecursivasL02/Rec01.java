package RecursivasL02;

/* 1. Criar uma função recursiva que receba 2 valores A e B e, por somas, apresente o resultado da multiplica��o de A por B. */

public class Rec01 {
    public static void main(String[] args) {
        int A = 4;
        int B = 3;
        int resultado = mult(A, B);
        
        System.out.println("O resultado da multiplica��o �: " + resultado);
    }

    public static int mult(int A, int B) {

        if (B == 0) {
            return 0;
        }

        return A + mult(A, B - 1);
    }
}
