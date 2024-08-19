package RecursivasL03;

import javax.swing.JOptionPane;

/* 2. Criar uma aplicação em Java que tenha uma função recursiva que, recebendo um número inteiro de 10 
a 999999 e recebendo um 2º número inteiro (de 0 a 9), tenha uma função recursiva que apresente quantas 
vezes o 2º número aparece no primeiro. 
• Exemplo1: 1º. Número = 523578; 2º. Número = 5; retorno aparece 2 vezes
• Exemplo2: 1º. Número = 836363; 2º. Número = 3; retorno aparece 3 vezes
• A validação da entrada e do dígito deve ser feito na main da aplicação e não na função recursiva;
• O Código deve apresentar, em formato de comentário, como foi definida a condição de parada;
• O Código deve apresentar, em formato de comentário, como foi definida a relação de chamada 
dos passos;*/

public class RecEx02 {
	public static void main(String[] args) {
		int N1 = 0;
		int N2 = 10;
		
		while (N1<=9 || N1 >= 1000000) {
			N1= Integer.parseInt(JOptionPane.showInputDialog("Digite um numero entre 10 e 999999"));
		}
		
		while (N2 >= 10) {
			N2 = Integer.parseInt(JOptionPane.showInputDialog("Agora digite um numero entre 0 e 9"));
		}
		
		System.out.println("A quandidade de numeros "+N2+" dentro do numero "+N1+" é de "+ Numeros(N1, N2));
		
	}
	public static int Numeros (int n1, int n2) {
		if (n1 <=0) {
			return 0; // A parada se dá quando por divisão por 10, o numero for menos ou igual a zero.
		} 
		if (n1%10 == n2) { //verifica os restos com o N2
			return 1 + Numeros (n1/10, n2);	 // Se sim, soma e retorna tirando um decimal
		} else {
			return Numeros (n1/10, n2); // Senão, apenas retorna dividindo
		}
		
	}

}
