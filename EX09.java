/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.projetotp01;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class EX09 {
   /* 9. Calcular e exibir a tensão de um determinado circuito eletrônico a partir dos
valores da resistência e corrente elétrica que serão digitados. Utilize a lei de Ohm.
*/
    
public static void main(String[] args) {
        System.out.println("Digite a resistencia: ");
        Scanner scan= new Scanner(System.in);
        double resistencia = scan.nextDouble();
        
        System.out.println("Digite a corrente: ");
        double corrente = scan.nextDouble();
        
        double calcular = resistencia * corrente;
        
        System.out.println("O valor da tensão é: " + calcular);
    }
}
