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
public class TP01Ex03 {
    /*
   3. Calcular e exibir a área de um quadrado a partir do valor de sua diagonal que será
digitado.
    */
    public static void main(String[] args) {
        System.out.println("Digite a Diagonal do quadrado: ");
        Scanner scan= new Scanner(System.in);
        double diagonal = scan.nextDouble();
        
        double calcular = (diagonal * diagonal) / 2;
        
        System.out.println("A area do quadrado a partir da diagonal é:" + calcular);
    }
    
}
