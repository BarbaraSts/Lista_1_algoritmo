package aula2;

import java.util.Scanner;

public class Exercicio5Java { 
    
    public static void main(String[] args) {
        /*Fazer um algoritmo que leia um valor L e calcula a área de um quadrado de lado L.*/
         
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        double l = sc.nextDouble();
        
        l = l * l;
        
        System.out.println("A área do quadrado é " + l);        
    }    
}
