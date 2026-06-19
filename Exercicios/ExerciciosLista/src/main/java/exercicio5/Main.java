package exercicio5;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        //Exercício 5
        //Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
        //código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
        //Exemplo:
        //Entrada:
        //12 1 5.30
        //16 2 5.10
        //Saída:
        //VALOR A PAGAR: R$ 15.50
        //Entrada:
        //13 2 15.30
        //161 4 5.20
        //Saída:
        //VALOR A PAGAR: R$ 51.40
        //Entrada:
        //1 1 15.10
        //2 1 15.10
        //Saída:
        //VALOR A PAGAR: R$ 30.20

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o código da peça 1: ");
        int codigoP1 = sc.nextInt();
        System.out.print("Digite a quantidade de peças 1: ");
        int quantidadeP1 = sc.nextInt();
        System.out.print("O valor unitário da peça 1: ");
        double precoP1 = sc.nextDouble();

        System.out.print("Digite o código da peça 2: ");
        int codigoP2 = sc.nextInt();
        System.out.print("Digite a quantidade de peças 2: ");
        int quantidadeP2 = sc.nextInt();
        System.out.print("O valor unitário da peça 2: ");
        double precoP2 = sc.nextDouble();

        double valorTotalP1 = quantidadeP1 * precoP1;
        double valorTotalP2 = quantidadeP2 * precoP2;
        double valorTotal = valorTotalP1 + valorTotalP2;
        System.out.printf("%nValor total Peça 1: R$ %.2f%n" +
                "Valor total Peça 2: R$ %.2f%n" +
                "TOTAL: R$ %.2f%n",valorTotalP1,valorTotalP2,valorTotal);

    }
}
