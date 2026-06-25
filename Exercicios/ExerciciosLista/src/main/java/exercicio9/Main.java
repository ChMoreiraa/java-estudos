package exercicio9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //Exercicio 09
        //Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
        //Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
        //ordem crescente ou decrescente.
        //Exemplos:
        //Entrada:
        //6 24
        //Saída:
        //Sao Multiplos
        //Entrada:
        //6 25
        //Saída:
        //Nao sao Multiplos
        Scanner sc = new Scanner (System.in);

        System.out.print("Digite um número: ");
        int num1 = sc.nextInt();
        System.out.print("Digite um número: ");
        int num2 = sc.nextInt();

        if (num1 % num2 == 0 || num2 % num1 == 0){
            System.out.println("São Multíplos");
        }
        else {
            System.out.println("Não são Multíplos");
        }
        sc.close();
    }
}
