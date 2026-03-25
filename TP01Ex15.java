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
public class TP01Ex15 {
        
     /*
    15.Entrar via teclado com o valor da cotação do dólar e uma certa quantidade de
dólares. Calcular e exibir o valor correspondente em Reais (R$).
    */
    
    public static void main(String[] args) {
        System.out.println("Digite a cotacao do dolar: ");
        Scanner scan= new Scanner(System.in);
        double dolar = scan.nextDouble();
        
        System.out.println("Digite a quantidade: ");
        double qtd = scan.nextDouble();
        
        double calcular = dolar * qtd;
        
       
        System.out.println("O valor em reais é: " + calcular);
    }
    
}
