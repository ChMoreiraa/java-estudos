package exercicio2;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Exercicio 2
        //Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
        //casas decimais conforme exemplos.
        //Fórmula da área: area = π . raio2
        //Considere o valor de π = 3.14159
        //Exemplos:
        //Entrada: 2.00 | Saída: A=12.5664
        //Entrada: 100.64 | Saída: A=31819.3103
        //Entrada: 150.00 | Saída: A=70685.7750

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        double pi = 3.14159;

        System.out.print("Digite o valor do raio do círculo: ");
        double raio = sc.nextDouble();

        double areaCirculo = pi * Math.pow(raio,2);

        System.out.printf("ÁREA DO CÍRCULO: %.4f%n",areaCirculo);

        sc.close();
    }
}
