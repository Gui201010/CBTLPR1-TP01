/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lpr.tp01;
import java.util.Scanner;

/*Nomes: Guilherme Silvestre de Farias e Igo Lima Borges

16. Entrar via teclado com o valor de um ângulo em graus, calcular e exibir as 
seguintes funções trigonométricas: seno, cosseno, tangente e secante deste ângulo. 
Lembre-se que uma função trigonométrica trabalha em radianos.

*/
    public class TP01Ex16 {
            public static void main(String[] args){
            System.out.println("Digite o valor do angulo em graus:");
            Scanner scan = new Scanner(System.in);
            double angulo = scan.nextDouble();
            double radiano = (3.14/180.0)*angulo;
            double seno = Math.sin(radiano); 
            double cos = Math.cos(radiano);
            double tang = seno/cos;       
            double secan = 1.0/ cos;
            
            System.out.println("Seno: " + seno);
            System.out.println("Cosseno: " + cos);
            System.out.println("Tangente: " + tang);
            System.out.println("Secante: " + secan);
            }

    }
