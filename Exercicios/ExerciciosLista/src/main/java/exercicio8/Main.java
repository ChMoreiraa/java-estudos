package exercicio8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Exercício 08
        //Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
        //Exemplos:
        //Entrada:
        //12
        //Saída:
        //PAR
        //Entrada:
        //-27
        //Saída:
        //ÍMPAR
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int valor = sc.nextInt();

        if (valor % 2 == 0){
            System.out.println("PAR");
        }
        else {
            System.out.println("ÍMPAR");
        }
        sc.close();
    }
}
