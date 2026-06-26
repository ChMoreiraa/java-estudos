package exercicio11;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        //Exercício 11
        //Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
        //seguir, calcule e mostre o valor da conta a pagar.
        //Exemplos:
        //Entradas:
        //3 2
        //Saída:
        //Total: R$ 10.00 
        Scanner sc = new Scanner (System.in);

        System.out.println("=================================================");
        System.out.println("| CODIGO | ESPECIFICAÇÃO      | PREÇO          |");
        System.out.println("=================================================");
        System.out.println("|   1    | Cachorro Quente    | R$ 4,00        |");
        System.out.println("|   2    | X-Salada           | R$ 4,50        |");
        System.out.println("|   3    | X-Bacon            | R$ 5,00        |");
        System.out.println("|   4    | Torrada Simples    | R$ 2,00        |");
        System.out.println("|   5    | Refrigerante       | R$ 1,50        |");
        System.out.println("=================================================");

        System.out.print("Digite o código do item que deseja: ");
        int codigo = sc.nextInt();
        System.out.print("Digite a quantidade que deseja: ");
        int quantidade = sc.nextInt();
        double preco = 0;
        if(codigo == 1) {
            preco = 4.00;
        } else if (codigo == 2) {
            preco = 4.50;
        } else if (codigo == 3) {
            preco = 5.00;
        } else if (codigo == 4) {
            preco = 2.00;
        } else if (codigo == 5) {
            preco = 1.50;
        }

        double total = quantidade * preco;

        sc.close();
        System.out.printf("Total: R$ %.2f %n",total);
    }
}
