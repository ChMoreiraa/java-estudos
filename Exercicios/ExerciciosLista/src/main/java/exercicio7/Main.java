package exercicio7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Exercício 07
        //Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
        //Exemplo:
        //
        //Entrada
        // - 10
        //Saída
        //NEGATIVO
        //Entrada
        //8
        //Saída
        //NÃO NEGATIVO
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int valor = sc.nextInt();

        if (valor < 0){
            System.out.println("Número NEGATIVO");
        }
        else{
            System.out.println("Número POSITIVO");
        }

        sc.close();
    }
}
