package aula2.exercicio1java;

import java.util.Scanner;
       
/**
 *
 * @author Barbara
 */
public class Exercicio1Java {
   
    public static void main(String[] args) {
        //1.Fazer um algoritmo que leia dois números e imprima na tela o produto (multiplicação) dos dois números.
        
       Scanner sc = new Scanner (System.in);
       int v1, v2;
       System.out.println("Digite o valor 1: ");
       v1 = sc.nextInt ();
       System.out.println("Digite o valor 2: ");
       v2 = sc.nextInt ();
       
       v1 = (v1 * v2);
       
       System.out.println("O produto é: " + v1);
    }
}
