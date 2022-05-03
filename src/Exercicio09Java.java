package aula2;

import java.util.Scanner;

public class Exercicio9Java {
    
    public static void main(String[] args) {
        /* Escreva um programa que leia o número de cadastro de um funcionário, seu número de horas trabalhadas,
o valor que recebe por hora e calcula o salário desse funcionário. A seguir, mostre na tela o número e o
salário do funcionário. */
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o número de cadastro: ");
        int n1 = sc.nextInt();
        System.out.println("Digite o número de horas trabalhadas: ");
        double n2 = sc.nextDouble();
        System.out.println("Digite o valor que recebe por hora: ");
        double n3 = sc.nextDouble();
        
        double salário = n2 * n3;   
        System.out.println("O número de cadrastro é: " + n1 + 
                "\nO salário do funcionário é de R$: " + salário); 
    }
}
