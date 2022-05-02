package aula2;

import java.util.Scanner;

/**
 *
 * @author Barbara
 */
public class Exercicio13Java {
    
    public static void main(String[] args) {
        /* Fazer um algoritmo que leia três números e imprime o maior deles */
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o valor 1: ");
        double a = sc.nextDouble();
        System.out.println("Digite o valor 2: ");
        double b = sc.nextDouble();
        System.out.println("Digite o valor 3: ");
        double c = sc.nextDouble();
         
        if (a > b && a > c) {
            System.out.println("O valor maior é: " + a);
        }else if (b > c && b > a) {
            System.out.println("o valor maior é: " + b);
        }else if (c > b && c > a) {
            System.out.println("O valor maior é: " + c);
        }else {
            System.out.println("os valores são iguais");
        }
        
                
    }
    
}
