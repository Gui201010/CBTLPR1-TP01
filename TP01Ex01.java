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
public class TP01Ex01 {
    /*
1. Entrar via teclado com a base e a altura de um retângulo, calcular e exibir sua
área.
*/
    public static void main(String[] args) {
        System.out.println("Digite a base do retangulo");
        Scanner scan= new Scanner(System.in);
        double base= scan.nextDouble();
        
        System.out.println("Digite a altura do retangulo");
        double altura= scan.nextDouble();
        
        
        double calcular = base * altura;
                
        System.out.println("A base do retangulo de lado " + base + "e altura " + altura + "é igual:" + calcular);
    }
    
}
