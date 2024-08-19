/* Criar uma fun��o recursiva que receba o dividendo e o divisor de uma opera��o de divis�o e, por
subtra��es, exiba o resto da divis�o.*/
package RecursivasL02;

public class Rec02 {
	public static void main (String [ ] args) {
		int dvs = 3;
		int dvd = 12;
		
		int resultado = Divisao(dvs, dvd);
		System.out.println("A divis�o � " + resultado);
	}
	
	public static int Divisao(int dvs, int dvd) {
		if (dvd == 0) {
			return 0;
		} else {
			return dvd - Divisao(dvs, dvd - dvs);
		}
	}

}
