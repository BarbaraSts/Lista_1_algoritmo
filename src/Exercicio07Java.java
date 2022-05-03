package aula2;

import java.util.Scanner;

public class Exercicio7Java {
    
    public static void main(String[] args) {
        /* Fazer um algoritmo que leia os dois lados A e B de um triângulo retângulo e calcula a hipotenusa do triângulo.
Para esse caso, considere que h = √A2 + B2. Dica: nesse programa, você deve usar a
função matemática Math.sqrt(). Por exemplo, a raiz de 121 ficaria Math.sqrt(121). */
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número 1: ");
        double a = sc.nextDouble();
        System.out.println("Digite o número 2: ");
        double b = sc.nextDouble();
        
        double resultado = (a * a) + (b * b);
        System.out.println("A hipotenusa do triângulo é: " + Math.sqrt(resultado));
    }   
}
