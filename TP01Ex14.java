/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package lpr.tp01;
import java.util.Scanner;

/*Nomes: Guilherme Silvestre de Farias e Igo Lima Borges

14. Calcular e exibir o volume livre de um ambiente que contém uma esfera de raio 
“r” inscrita em um cubo perfeito de aresta “a”. Os valores de “r “ e “a” serão 
digitados. 

*/
public class TP01Ex14 {

    public static void main(String[] args) {
        System.out.println("Digite o valor do raio da esfera em cm:");
        Scanner scan = new Scanner(System.in);
        double raio = scan.nextDouble();
        System.out.println("Digite o valor da aresta do cubo em cm:");
        double aresta = scan.nextDouble();
        double volCubo = aresta*aresta*aresta;
        double volEsfera = (4.0/3.0)*3.14*(raio*raio*raio);
        double volLivre = volCubo - volEsfera;
        System.out.println("o volume livre é igual a: "+ volLivre +" cm cubicos");
        
        
    }
}
