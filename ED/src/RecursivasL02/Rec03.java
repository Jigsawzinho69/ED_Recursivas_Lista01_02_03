/* Faça uma função recursiva que receba um número inteiro posi�vo ímpar N e retorne o fatorial duplo
desse número (A entrada deve ser validada fora da função recursiva). O fatorial duplo é definido como o
produto de todos os números naturais ímpares de 1 até algum número natural ímpar N. Assim, o fatorial
duplo de 5 é: 5!! = 1 *3 * 5 = 15 */

package RecursivasL02;

import javax.swing.JOptionPane;

public class Rec03 {
	public static void main (String []args) {
		int N = 0;
		while (N%2==0) {
			N = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira um numero impar"));
		}
		int resultado = Dupfat(N);
		System.out.println("O resultado é " + resultado);
		
	}
	
	public static int Dupfat (int N) {
		if(N == 1) {
			return 1;
		} else {
			return N * Dupfat(N - 2);
		}
	}

}
