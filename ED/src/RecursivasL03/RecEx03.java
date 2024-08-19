package RecursivasL03;

import javax.swing.JOptionPane;

/* 3. Crie uma função recursiva que exiba o resultado da inversão de uma cadeia de caracteres 
(Ex.: entrada = teste ; saída = etset): 
Deve se u�lizar a função SUBSTRING da Java
O código deve trazer como comentários:
• A condição de parada
• Como escrever a função para o termo n em função do termo anterior*/

public class RecEx03 {

    public static void main(String[] args) {
        String texto = JOptionPane.showInputDialog("Digite uma palavra para inverter");
        System.out.println("Texto original: " + texto);
        System.out.println("Texto invertido: " + Inversor.inverterString(texto));
    }

    static class Inversor {
        public static String inverterString(String str) {
            // Parada: Se a string estiver vazia ou tiver apenas um caractere, não há nada para inverter
            if (str.isEmpty()) {
                return str;
            }
            // Pega o último caractere e o concatena com a inversão do restante da string
            return str.substring(str.length() - 1) + inverterString(str.substring(0, str.length() - 1));
        }
    }
}
