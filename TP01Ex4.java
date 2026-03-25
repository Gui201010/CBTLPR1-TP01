/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package lpr.tp01;
import java.util.Scanner;
/*Nomes: Guilherme Silvestre de Farias e Igo Lima Borges

4. A partir dos valores da base e altura de um triângulo, calcular e exibir sua área.

*/
public class TP01Ex4 {

    public static void main(String[] args) {
        System.out.println("Digite o valor da base: ");
        Scanner scan = new Scanner(System.in);
        double base = scan.nextDouble();
        System.out.println("Digite o valor da altura:");
        double altura = scan.nextDouble();
        
        double area = (base * altura)/2;
        System.out.println("Area do trinagulo = " + area);
            
    }
}
