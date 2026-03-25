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
public class TP01Ex05 {
    /*
    4. Calcular e exibir o volume de uma esfera a partir do valor de seu diâmetro que
será digitado.
    */
    public static void main(String[] args) {
        System.out.println("Digite o valor do diametro: ");
        Scanner Scan = new Scanner(System.in);
        double diametro = Scan.nextDouble();
        
        double raio = diametro / 2;
        
        double calcular = 4/3 * 3.14 * (raio*raio*raio);
        
        System.out.println("O volume da esfera é: "+ calcular);
        
    }
    
}
