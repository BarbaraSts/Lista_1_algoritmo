package aula2;

import java.util.Scanner;

/**
 *
 * @author Barbara
 */
public class Exercicio14Java {
    
    public static void main(String[] args) {
        /* Fazer um algoritmo que leia dois números e imprime a divisão do maior pelo menor. */
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número 1: ");
        double a = sc.nextDouble();
        System.out.println("digite o número 2: ");
        double b = sc.nextDouble();
        
        if (a > b) {
            a = a/b;
            System.out.println("O resultado é: " + a);
        }else if (b > a) {
            b = b/a;
            System.out.println("O resultado é: " + b);
        }
    }
}
