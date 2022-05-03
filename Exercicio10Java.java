package aula2;

import java.util.Scanner;

/**
 *
 * @author Barbara
 */
public class Exercicio10Java {
    
    public static void main(String[] args) {
        /* Faça um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele
no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas,
calcular e imprimir o total a receber no final do mês. */

         Scanner sc = new Scanner(System.in);
         System.out.println("Digite um nome: ");
         String nome = sc.next(); 
         System.out.println("Digite o valor do seu salário fixo: ");
         double b = sc.nextDouble();
         System.out.println("Digite o total de vendas efetuadas no mês: ");
         double c = sc.nextDouble();
          
         double total = b + (0.15 * c);
         System.out.println(nome + " seu salário final é de R$: " + total);
    }
    
    
   
    
    
    
}
