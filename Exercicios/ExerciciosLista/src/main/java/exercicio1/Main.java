package exercicio1;

import java.util.Scanner;
import java.util.Locale;

public class Main {

    //EXERCICIO RESOLVIDO PELO PROFESSOR
    public static void main(String[] args) {
    //    Locale.setDefault(Locale.US);
    //    Scanner sc = new Scanner (System.in);

    //    double largura = sc.nextDouble();
    //    double comprimento = sc.nextDouble();
    //    double valorMetroQua = sc.nextDouble();
    //    double area = largura * comprimento;
    //    double precoArea = valorMetroQua * area;

    //    System.out.printf("ÁREA: %.2f%n",area);
    //    System.out.printf("PREÇO TERRENO: %.2f%n",precoArea);

    //    sc.close();

    //Exercício 01
    //Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
    //mensagem explicativa, conforme exemplos. Exemplos:
        // Entrada:
        //10
        //30
        //Saída
        //SOMA = 40
        //Entrada:
        //-30
        //10
        //Saída:
        //SOMA = -20
        //Entrada: Saída:
        //0
        //0
        //Saída:
        //SOMA = 0

    Scanner sc = new Scanner (System.in);

    System.out.print("Digite o primeiro número: ");
    int num1 = sc.nextInt();

    System.out.print("Digite o segundo número: ");
    int num2 = sc.nextInt();

    int soma = num1 + num2;

    System.out.printf("SOMA = %d%n",soma);

    sc.close();

    }
}