package exercicio003;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int num1 = sc.nextInt();
        System.out.print("Digite outro valor: ");
        int num2 = sc.nextInt();

        int soma = num1 + num2;

        System.out.printf("A soma entre %d e %d é igual a %d!%n",num1,num2,soma);

        sc.close();
    }
}