import java.util.Scanner;

public class TP01 {
	

    public static void main(String[] args) {
           
    }
}
class excutarEx01 {
	 /*
	1. Entrar via teclado com a base e a altura de um retângulo, calcular e exibir sua
área.
*/
System.out.println("Digite a base do retangulo");
        Scanner scan= new Scanner(System.in);
        double base= scan.nextDouble();
        
        System.out.println("Digite a base do retangulo");
        double altura= scan.nextDouble();
        
        
        double calcular = base * altura;
                
        System.out.println("A base do retangulo de lado " + base + "e altura " + altura + "é igual:" + calcular);
}

class executarEx02 {
/*
   2 Calcular e exibir a área de um quadrado a partir do valor de sua diagonal que será
digitado.
    */
    public static void() {
        System.out.println("Digite a Diagonal do quadrado: ");
        Scanner scan= new Scanner(System.in);
        double diagonal = scan.nextDouble();
        
        double calcular = (diagonal * diagonal) / 2;
        
        System.out.println("A area do quadrado a partir da diagonal é:" + calcular);
    }
}
