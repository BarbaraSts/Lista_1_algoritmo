package aula2;

import java.util.Scanner;

/**
 *
 * @author Barbara
 */
public class Exercicio12Java {
    
    public static void main(String[] args) {
        /* Fazer um algoritmo que leia dois números L e R. O programa deve verificar a maior área entre um quadrado
de lado L e um círculo de raio R. Imprimir na tela qual o maior: "Quadrado" ou "Círculo". */
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número do quadrado: ");
        double l = sc.nextDouble();
        System.out.println("Digite o número do círculo: ");
        double r = sc.nextDouble();
        
        double quadrado, círculo;
        quadrado = l * l;
        círculo = (r * r) * Math.PI;
        
        if (quadrado > círculo) {
            System.out.println("O quadrado é maior.");
        }else if (quadrado < círculo) {
            System.out.println("O círculo é menor.");
        }else{ 
            System.out.println("São iguais");
        }
        
                
    }
    
}
