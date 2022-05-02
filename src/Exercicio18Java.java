package aula2;

import java.util.*;

/**
 *
 * @author Barbara
 */
public class Exercicio18Java {
    
    public static void main(String[] args) {
        /* Leia 3 números decimais A, B e C e ordene-os em ordem decrescente, de modo que o lado A representa o
maior dos 3 lados. A seguir, determine o tipo de triângulo que estes três lados formam, com base nos
seguintes casos, sempre escrevendo uma mensagem adequada:
● se A ≥ B+C, apresente a mensagem: NAO FORMA TRIÂNGULO
● se A2 = B2 + C2
, apresente a mensagem: TRIÂNGULO RETÂNGULO
● se A2 > B2 + C2
, apresente a mensagem: TRIÂNGULO OBTUSÂNGULO
● se A2 < B2 + C2
, apresente a mensagem: TRIÂNGULO ACUTÂNGULO
● se os três lados forem iguais, apresente a mensagem: TRIÂNGULO EQUILÁTERO
● se apenas dois dos lados forem iguais, apresente a mensagem: TRIÂNGULO ISÓSCELES
Veja abaixo alguns exemplos. Não fixe esses valores no código. Você pode usá-los para TESTAR seu algoritmo: */

        
        Scanner grava = new Scanner(System.in);
        
        double a, b, c, aux;
        System.out.println("Digite o número 1: ");
        a = grava.nextDouble();
        System.out.println("Digite o número 2: ");
        b = grava.nextDouble();
        System.out.println("Digite o número 3: ");
        c = grava.nextDouble();
        
        if (b > a) {
            aux = a;
            a = b;
            b = aux;           
        }
        if (c > a) {
            aux = a;
            a = c;
            c = aux;
        }
        if (c > b) {
            aux = b;
            b = c;  
            c = aux;
        }
        System.out.println(" "+ a +" "+ b +" " + c);
        
        if (a >= b + c){
        System.out.println("NÂO FORMA TRIÂNGULO.");
        
        }else if ((a * a) == (b * b) + (c * c)) {
        System.out.println("TRIÂNGULO RETÂNGULO.");
        
        }else if ((a * a) > (b * b) + (c * c)) {
        System.out.println("TRIÂNGULO OBTUSÂNGULO.");
        
        }else if ((a * a) < (b * b) + (c * c)) {
        System.out.println("TRIÂNGULO ACUTÂNGULO.");
        
        }
        
        if (a >= b + c){
        
        }else if (a == b && a == c) {
        System.out.println("TRIÂNGULO EQUILÁTERO.");
        
        }else if (a == b || b == c || c == a)
        System.out.println("TRIÂNGULO ISÓSCELES.");
    
}
}
