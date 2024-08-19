package RecursivasL03;

/* 7. Escreva uma função recursiva que calcule a soma dos dígitos de um número inteiro. Por 
exemplo, se a entrada for 123, portanto 1+2+3, logo, a saída deverá ser 6.*/

public class RecEx07 {

    public static void main(String[] args) {
        int numero = 123; 
        System.out.println("A soma dos dígitos de " + numero + " é: " + SomaDigitos.somarDigitos(numero));
    }

    static class SomaDigitos {
        public static int somarDigitos(int n) {
            // Quando o número for 0, a soma dos dígitos termina
            if (n == 0) {
                return 0;
            }
            // Parada: Soma o dígito atual (n % 10) e chama a função para o restante dos dígitos (n / 10)
            return (n % 10) + somarDigitos(n / 10);
        }
    }
}
