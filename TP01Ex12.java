/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package lpr.tp01;
import java.util.Scanner;

/*Nomes: Guilherme Silvestre de Farias e Igo Lima Borges

12. Calcular e exibir o volume de um cone a partir dos valores da altura e do raio da base que serão digitados.

*/
public class TP01Ex12 {

    public static void main(String[] args) {
        System.out.println("Digite o valor da altura em cm:");
        Scanner scan = new Scanner(System.in);
        double alt = scan.nextDouble();
        System.out.println("Digite o valor do raio da base em cm:");
        double raio = scan.nextDouble();
        
        double area = 3.14 * (raio*raio);
        double vol = 1.0/3.0 * area * alt;
        
        
        System.out.println("O volume e igual a:"+ vol + "cm cubicos");
        
    }
}
