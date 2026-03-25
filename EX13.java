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
public class EX13 {
    /*
    13. Calcular e exibir a velocidade final (em km/h) de um automóvel, a partir dos
valores da velocidade inicial (em m/s), da aceleração (m/s2) e do tempo de percurso
(em s) que serão digitados.
    */
    
    public static void main(String[] args) {
        System.out.println("Digite a velocidade inicial: ");
        Scanner scan= new Scanner(System.in);
        double velInicial = scan.nextDouble();
        
        System.out.println("Digite a aceleracao: ");
        double aceleracao = scan.nextDouble();
        
        System.out.println("Digite o tempo de percurso: ");
        double tempo = scan.nextDouble();
        
        double calcular = velInicial + aceleracao * tempo;
        
       
        System.out.println("A area de um cirrculo a partir do raio é: " + calcular);
    }
    
    
}
