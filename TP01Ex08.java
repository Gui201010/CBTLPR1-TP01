/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package lpr.tp01;
import java.util.Scanner;
/*Nomes: Guilherme Silvestre de Farias e Igo Lima Borges

8. Sabendo que uma milha marítima equivale a um mil, oitocentos e cinquenta e 
dois metros e que um quilômetro possui mil metros, fazer um programa para 
converter milhas marítimas em quilômetros. 

 */
public class TP01Ex08 {

    public static void main(String[] args) {
        double milha = 1852;
        double km = 1000;
        System.out.println("Digite a(s) milha(s): ");
        Scanner scan = new Scanner(System.in);
        double valor = scan.nextDouble();
        
        double conversao = (valor * milha)/km;
        System.out.println("Igual a:" + conversao);
    }    
        
}
