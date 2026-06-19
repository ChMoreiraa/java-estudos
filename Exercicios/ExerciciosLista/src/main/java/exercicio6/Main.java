package exercicio6;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        //Exercício 6
        //Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
        //mostre:
        //a) a área do triângulo retângulo que tem A por base e C por altura.
        //b) a área do círculo de raio C. (pi = 3.14159)
        //c) a área do trapézio que tem A e B por bases e C por altura.
        //d) a área do quadrado que tem lado B.
        //e) a área do retângulo que tem lados A e B

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        double A = sc.nextDouble();
        System.out.print("Digite o valor de B: ");
        double B = sc.nextDouble();
        System.out.print("Digite o valor de C: ");
        double C = sc.nextDouble();

        //a) a área do triângulo retângulo que tem A por base e C por altura.
        double areaTriangulo = ( A * C ) / 2;

        //b) a área do círculo de raio C. (pi = 3.14159)
        double pi = 3.14159;
        double areaCirculo = pi *  Math.pow(C,2);

        //c) a área do trapézio que tem A e B por bases e C por altura.
        double areaTrapezio = (( A + B ) * C) / 2;

        //d) a área do quadrado que tem lado B.
        double areaQuadrado = Math.pow(B,2);

        //e) a área do retângulo que tem lados A e B.
        double areaRetangulo = A * B;

        System.out.printf("%nTRIANGULO: %.3f " +
                "%nCIRCULO: %.3f" +
                "%nTRAPEZIO: %.3f" +
                "%nQUADRADO: %.3f" +
                "%nRETANGULO: %.3f",
                areaTriangulo,
                areaCirculo,
                areaTrapezio,
                areaQuadrado,
                areaRetangulo);
    }
}
