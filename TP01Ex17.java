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
public class TP01Ex17 {
    /*
    17.Entrar via teclado com o valor de cinco produtos. Após as entradas, digitar um
valor referente ao pagamento da somatória destes valores. Calcular e exibir o troco
que deverá ser devolvido.
    */
    
    public static void main(String[] args) {
        System.out.println("Digite o valor do produto 1: ");
        Scanner scan= new Scanner(System.in);
        double p1 = scan.nextDouble();
        System.out.println("Digite o valor do produto 2: ");
        double p2 = scan.nextDouble();
        System.out.println("Digite o valor do produto 3: ");
        double p3 = scan.nextDouble();
        System.out.println("Digite o valor do produto 4: ");
        double p4 = scan.nextDouble();
        System.out.println("Digite o valor do produto 5: ");
        double p5 = scan.nextDouble();
        
        System.out.println("Digite o valor pago: ");
        double pagamento = scan.nextDouble();
        
        double soma = p1 + p2 +p3 +p4 +p5;
        
        if (soma > pagamento){
            System.out.println("Valor de pagamento insuficiente");
        }
        else{
            double calcular = pagamento - soma;
            System.out.println("O valor do troco é: " + calcular);
        }
    }
}
