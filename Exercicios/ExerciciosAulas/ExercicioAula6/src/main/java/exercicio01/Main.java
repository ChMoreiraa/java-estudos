package exercicio01;

import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Problema exemplo
        //Uma operadora de telefonia cobra R$ 50.00 por um plano básico que
        //dá direito a 100 minutos de telefone. Cada minuto que exceder a
        //franquia de 100 minutos custa R$ 2.00. Fazer um programa para ler a
        //quantidade de minutos que uma pessoa consumiu, daí mostrar o valor
        //a ser pago.
        //Entrada
        //22
        //Saída
        //Valor a pagar: R$ 50.00
        //Entrada
        //103
        //Saída
        //Valor a pagar: R$ 56.00
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        double multa = 2.00;
        double conta = 50.00;

        System.out.print("Informe os minutos consumidos: ");
        int minutos = sc.nextInt();
        if (minutos > 100){
            conta += (minutos - 100) * multa;
        }

        System.out.printf("Valor a pagar: R$ %.2f %n",conta);

        sc.close();
    }
}