package aula2;

import java.util.Scanner;

/**
 *
 * @author Barbara
 */
public class Exercicio3Java {
    
    public static void main(String[] args) {
        /*Fazer um algoritmo que lê dois números e imprime a soma dos quadrados dos dois números. O quadrado
de um número A é representado por A^2 = A * A.*/
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor 1: ");
        double a = sc.nextDouble();
        System.out.println("Digite o valor 2: ");
        double b = sc.nextDouble();
        
        double c = (a * a) + (b * b);
                
        System.out.println("Resultado: " + c);
        
        
        
    }
    
}
