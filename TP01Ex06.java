/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package lpr.tp01;
import java.util.Scanner;
/*Nomes: Guilherme Silvestre de Farias e Igo Lima Borges

6. Calcular e exibir a média aritmética de quatro valores quaisquer que serão digitados.

 */
public class TP01Ex06 {

    public static void main(String[] args) {
        System.out.println("Digite o valor 1: ");
        Scanner scan = new Scanner(System.in);
        double v1 = scan.nextDouble();
        System.out.println("Digite o valor 2: ");
        double v2 = scan.nextDouble();
        System.out.println("Digite o valor 3: ");
        double v3 = scan.nextDouble();
        System.out.println("Digite o valor 4: ");
        double v4 = scan.nextDouble();
        
        double media = (v1+v2+v3+v4)/4;
        System.out.println("media = "+ media);
    }
}
