/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetotp01;

import java.util.Scanner;

/**
 *
 * Nomes: Guilherme Silvestre de Farias e Igo Lima Borges
 */
public class TP01Ex11 {
 /*
    11. A partir do diâmetro de um círculo que será digitado, calcular e exibir sua área.
    */
    
    public static void main(String[] args) {
        System.out.println("Digite o valor do diametro: ");
        Scanner scan= new Scanner(System.in);
        double diametro = scan.nextDouble();
        
        double raio = diametro / 2;
        
        double calcular = Math.PI * Math.pow(raio, 2);
        
       
        System.out.println("A area de um cirrculo a partir do raio é: " + calcular);
    }
    
}
