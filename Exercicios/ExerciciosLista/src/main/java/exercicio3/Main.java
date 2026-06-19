package exercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Exercício 03
        //Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
        //de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D)
        //Exemplos:
        //Entrada:
        //5
        //6
        //7
        //8
        //Saída:
        //DIFERENCA = -26
        //Entrada:
        //5
        //6
        //-7
        //8
        //Saída:
        //DIFERENCA = 86
        Scanner sc = new Scanner (System.in);

        System.out.print("Digite o valor de A: ");
        int A = sc.nextInt();
        System.out.print("Digite o valor de B: ");
        int B = sc.nextInt();
        System.out.print("Digite o valor de C:");
        int C = sc.nextInt();
        System.out.print("Digite o valor de D: ");
        int D = sc.nextInt();

        int diferenca = ( A * B - C * D);

        System.out.printf("DIFERENÇA ( A * B - C * D ): %d%n",diferenca);

        sc.close();
    }
}
