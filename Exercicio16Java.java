package aula2;

import java.util.*;

/**
 *
 * @author Barbara
 */
public class Exercicio16Java {
    
    public static void main(String[] args) {
        /* Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas. Veja
abaixo alguns exemplos. Não fixe esses valores no código. Você pode usá-los para TESTAR seu algoritmo: */
        
        Scanner grava = new Scanner(System.in);
        double horaInicial, horaFinal, duracao;
        System.out.println("Digite a hora inicial do jogo: ");
        horaInicial = grava.nextDouble();
        System.out.println("Digite a hora final do jogo: ");
        horaFinal = grava.nextDouble();
        
        duracao = 24 - (24 + horaInicial - horaFinal) % 24;
        
        if (horaInicial == horaFinal) {
            System.out.println("O jogo teve a duração de 24h");
        }else {
            System.out.println("O jogo teve a duração de: " + duracao);
        }
        
  
        

    }
    
}
