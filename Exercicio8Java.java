package aula2;

import java.util.Scanner;

/**
 *
 * @author Barbara
 */
public class Exercicio8Java {
    
    public static void main(String[] args) {
        /* Fazer um algoritmo que leia quatro números e imprime a média aritmética dos quatro números */
        
        Scanner sc = new Scanner(System.in);
        double va1, va2, va3, va4; 
        
        System.out.println("Digite o número 1: ");
        va1 = sc.nextDouble();
        System.out.println("Digite o número 2: ");
        va2 = sc.nextDouble();
        System.out.println("Digite o número 3: ");
        va3 = sc.nextDouble();
        System.out.println("Digite o número 4: ");
        va4 = sc.nextDouble();
        
        double média = (va1 + va2 + va3 + va4) / 4;
        System.out.println("A média aritmética é: " + média);
    }
    
}
