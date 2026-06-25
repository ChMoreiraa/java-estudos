package calculadora_simples;

import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        System.out.println("=========================");
        System.out.println("|      CALCULADORA      |");
        System.out.println("|                       |");
        System.out.println("=========================");

        System.out.print("Digite o primeiro valor: ");
        double num1 = sc.nextDouble();
        System.out.println("Escolha a operação: ");
        System.out.println("1- (+)");
        System.out.println("2- (-)");
        System.out.println("3- (*)");
        System.out.println("4- (/)");

        //Finalizar após assistir a aula de swicth

    }
}