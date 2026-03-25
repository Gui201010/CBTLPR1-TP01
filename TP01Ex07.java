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
public class TP01Ex07 {
    /*
    Calcular e exibir a média geométrica de dois valores quaisquer que serão
digitados.
    */
    public static void main(String[] args) {
        System.out.println("Digite o valor 1: ");
        Scanner scan= new Scanner(System.in);
        double valor1 = scan.nextDouble();
        
        System.out.println("Digite o valor 2: ");
        double valor2= scan.nextDouble();
        
        double calcular = Math.sqrt(valor1 * valor2);
        
        System.out.println("A média geométrica do dois valores é: " + calcular);
    }
}
