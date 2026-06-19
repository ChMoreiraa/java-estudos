package exercicio4;

import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main (String[] args) {
        //Exercício 4
        //Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
        //hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
        //decimais
        //Exemplos:
        //Entrada:
        //25
        //100
        //5.50
        //Saída:
        //NUMBER = 25
        //SALARY = U$ 550.00
        //Entrada:
        //1
        //200
        //20.50
        //Saída:
        //NUMBER = 1
        //SALARY = U$ 4100.00
        //Entrada:
        //6
        //145
        //15.55
        //Saída:
        //NUMBER = 6
        //SALARY = U$ 2254.75

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        System.out.print("Digíte o número do funcionario: ");
        int numeroFunc = sc.nextInt();
        System.out.print("Digíte o número de horas trabalhadas: ");
        int horas = sc.nextInt();
        System.out.print("Digite o valor recebido por horas do funcionário: ");
        double valorHora = sc.nextDouble();

        double salario = horas * valorHora;

        System.out.printf("NUMERO DO FUNCIONÁRIO: %d %nSALÁRIO: R$ %.2f%n",numeroFunc,salario);

        sc.close();
    }

}
