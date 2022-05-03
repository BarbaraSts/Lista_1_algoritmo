package aula2;

import java.util.Scanner;

/**
 *
 * @author Barbara
 */
public class Exercicio11Java {
    
    public static void main(String[] args) {
        /* Fazer um algoritmo que lê um número e verifica se ele é negativo. Se for negativo, imprimir na tela a
mensagem "Numero negativo". */
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        double número = sc.nextDouble();
        
        if (número < 0) {
        System.out.println("Número negativo");
        
        }else {
            System.out.println("Número positivo");
        }
    }
    
}
