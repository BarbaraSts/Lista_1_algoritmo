package aula2;

import java.util.Scanner;

/**
 *
 * @author Barbara
 */
public class Exercicio6Java {
    
    public static void main(String[] args) {
        /*Escreva um algoritmo que leia três números decimais: A, B e C. Em seguida, calcule e mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (π = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.
f) o perímetro do retângulo que tem lados A e B.*/
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número 1: ");
        double a = sc.nextDouble();
        System.out.println("Digite o número 2: ");
        double b = sc.nextDouble();
        System.out.println("Digite o número 3: ");
        double c = sc.nextDouble();
        
        /* a) a área do triângulo retângulo que tem A por base e C por altura. */
        
        double triângulo = (a * c) / 2;
        System.out.println("Área do triângulo: " + triângulo);
        
        /* b) a área do círculo de raio C. (π = 3.14159) */
        
        double círculo = (c * c) * 3.14159;
        System.out.println("Área do círculo: " + círculo); 
        
        /* c) a área do trapézio que tem A e B por bases e C por altura. */
        
        double trapézio = ((a + b) * c) / 2;
        System.out.println("Área do trapézio: " + trapézio);
        
        /* d) a área do quadrado que tem lado B. */
        
        double quadrado = (b * b) / 2;
        System.out.println("Área do quadrado: " + quadrado);
        
        /* e) a área do retângulo que tem lados A e B. */
        
        double retângulo = a * b;
        System.out.println("Área do retângulo: " + retângulo);
        
        /* f) o perímetro do retângulo que tem lados A e B. */
        
        double retânguloperímetro = (a + a) + (b + b);
        System.out.println("Perímetro do retângulo: " + retânguloperímetro);
    }
    
}
