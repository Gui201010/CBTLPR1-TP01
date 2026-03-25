/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package lpr.tp01;
import java.util.Scanner;

/*Nomes: Guilherme Silvestre de Farias e Igo Lima Borges

10. Entrar via teclado com o valor de uma temperatura em graus Celsius, calcular e exibir sua temperatura equivalente em Fahrenheit.

*/
public class TP01Ex10 {

    public static void main(String[] args) {
        System.out.println("Digite a Temperatura em Celsius:");
        Scanner scan = new Scanner(System.in);
        double cel = scan.nextDouble();
        double fah = (cel*1.8)+32;
        
        System.out.println(cel + " graus Celsius, equivale a " + fah + " Fahrenheit");
    }
}
