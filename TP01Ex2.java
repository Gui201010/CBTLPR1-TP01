/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package lpr.tp01;
import java.util.Scanner;
/*Nomes: Guilherme Silvestre de Farias e Igo Lima Borges

2. Calcular e exibir a área de um quadrado, a partir do valor de sua aresta que será digitado.

*/
public class TP01Ex2 {

    public static void main(String[] args) {
        System.out.println("Digite o valor da aresta: ");
        Scanner scan = new Scanner(System.in);
        double aresta = scan.nextDouble();
        double area = aresta * aresta;
        System.out.println("Area do quadrado = " + area);
       
    }
}
