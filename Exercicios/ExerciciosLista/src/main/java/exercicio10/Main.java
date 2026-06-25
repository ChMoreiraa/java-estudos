package exercicio10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Exercício10
        //Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
        //começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
        //Exemplo:
        //Entrada:
        //16 2
        //Saída:
        //O JOGO DUROU 10 HORA(S)
        //Entrada:
        //0 0
        //Saída:
        //O JOGO DUROU 24 HORA(S)
        Scanner sc = new Scanner (System.in);

        int periodo = 0;

        System.out.print("Digite o horário de início: ");
        int inicio = sc.nextInt();
        System.out.print("Digite o horário do fim: ");
        int fim = sc.nextInt();
        if(inicio > fim){
            periodo = (24 - inicio) + fim;
            System.out.printf("O JOGO DUROU %d HORA(S)",periodo);
        }
        else if(inicio < fim){
            periodo = Math.abs(inicio - fim);
            System.out.printf("O JOGO DUROU %d HORA(S)",periodo);
        }
        else {
            periodo = 24;
            System.out.printf("O JOGO DUROU %d HORA(S)",periodo);
        }

        sc.close();
    }
}
