package aula2;

import java.util.Scanner; 

/**
 *
 * @author Barbara
 */
public class Exercicio17Java { 
    
    public static void main(String[] args) {
        /*Leia 4 valores inteiros A, B, C e D. A seguir, se B for maior do que C e se D for maior do que A, e a soma de C
com D for maior que a soma de A e B e se C e D, ambos, forem positivos e se a variável A for par escrever a
mensagem "Valores aceitos", senão escrever "Valores não aceitos". */
        
        Scanner sc = new Scanner(System.in);
       
        double a, b, c, d;
        System.out.println("Digite o valor 1: ");
        a = sc.nextDouble();
        System.out.println("Digite o valor 2: ");
        b = sc.nextDouble();
        System.out.println("Digite o valor 3: ");
        c = sc.nextDouble();
        System.out.println("Digite o valor 4: ");
        d = sc.nextDouble();
        
        if (b > c && d > a) {
            double r1, r2;
            r1 = c + d;
            r2 = a + b;
            if (r1 > r2) {
                if (c > 0 && d > 0) {
                    if (a % 2 == 0) {
                        System.out.println("Valores aceitos.");
                    } else {
                        System.out.println("Valores não aceitos.");
                    }
                }else {
                    System.out.println("Valores não aceitos.");
                }
            } else {
                System.out.println("Valores não aceitos.");
            } 
        } else {
            System.out.println("Valores não aceitos.");
        }
            
    }
    
}
