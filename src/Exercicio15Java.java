package aula2;

import java.util.*;

/**
 *
 * @author Barbara
 */
public class Exercicio15Java {
    
    public static void main(String[] args) {
        /* Leia 3 números decimais A, B e C e efetue o cálculo das raízes da equação de Bhaskara. −B ± √B2 − 4 ∗ A ∗ C
2 ∗ A
Se não for possível calcular as raízes, ou seja, caso haja uma divisão por 0 ou raiz de número negativo, mostre
a mensagem correspondente “Impossível calcular”. */
        
        Scanner grava = new Scanner(System.in);
        double a, b, c, delta, r1, r2;
        
        
        System.out.println("Digite o valor A: ");
        a = grava.nextDouble();
        System.out.println("Digite o valor B: ");
        b = grava.nextDouble();
        System.out.println("Digite o valor C: ");
        c = grava.nextDouble(); 
        
        delta = ((b * b) - (4 * a * c));
        System.out.println("O valor de delta é: " + delta);
        
       
        if (delta < 0) {
            System.out.println("Impossível calcular");
         }else if (delta >= 0) {
             r1 = (- (-b) + Math.sqrt(delta)) / (2*a);
             r2 = (- (-b) - Math.sqrt(delta)) / (2*a);
             
             System.out.println("O valor de x1 é: " + r1);
             System.out.println("O valor de x2 é: " + r2);
        
         }
        }
}