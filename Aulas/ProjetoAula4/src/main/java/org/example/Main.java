// ENTRADA DE DADOS EM JAVA COM SCANNER

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /*
         * ============================================================
         * EXEMPLO 1 - LEITURA DE STRING
         * ============================================================
         */

        // String x;
        // x = sc.next();
        // System.out.println("Você digitou: " + x);

        /*
         * ============================================================
         * EXEMPLO 2 - LEITURA DE NÚMERO INTEIRO
         * ============================================================
         */

        // int y;
        // y = sc.nextInt();
        // System.out.println("Você digitou o número: " + y);

        /*
         * ============================================================
         * EXEMPLO 3 - LEITURA DE NÚMERO COM PONTO FLUTUANTE
         * ============================================================
         */

        // double x;
        // x = sc.nextDouble();
        // System.out.println("Você digitou o número decimal: " + x);
        // System.out.printf("Você digitou: %.1f%n", x);

        /*
         * ============================================================
         * EXEMPLO 4 - LEITURA DE CARACTERE (CHAR)
         * ============================================================
         */

        // char x;
        // x = sc.next().charAt(0);
        // System.out.println("Você digitou: " + x);

        /*
         * ============================================================
         * EXEMPLO 5 - LEITURA DE VÁRIOS DADOS NA MESMA LINHA
         * ============================================================
         */

        // String x;
        // int y;
        // double z;

        // x = sc.next();
        // y = sc.nextInt();
        // z = sc.nextDouble();

        // System.out.println("Dados digitados:");
        // System.out.println(x);
        // System.out.println(y);
        // System.out.println(z);

        /*
         * ============================================================
         * EXEMPLO EXTRA 1 - CADASTRO SIMPLES
         * ============================================================
         */

        // String nome;
        // int idade;

        // nome = sc.next();
        // idade = sc.nextInt();

        // System.out.printf(
        //         "Olá, Seja Bem-Vinda!!%nSeu nome é: %s%nE você tem %d anos de idade.",
        //         nome,
        //         idade
        // );

        /*
         * ============================================================
         * EXEMPLO EXTRA 2 - CADASTRO COMPLETO
         * ============================================================
         */

        String nome, mae, namorado;
        int idade, dianas, mesnas, anonas;
        double renda;
        char genero;

        // Entrada de dados
        nome = sc.next();
        mae = sc.next();
        namorado = sc.next();

        genero = sc.next().charAt(0);

        idade = sc.nextInt();
        dianas = sc.nextInt();
        mesnas = sc.nextInt();
        anonas = sc.nextInt();

        renda = sc.nextDouble();

        // Saída de dados
        System.out.printf(
                "SEJA BEM-VINDO(A)%n" +
                        "Seus dados são:%n" +
                        "NOME: %s%n" +
                        "IDADE: %d%n" +
                        "DATA DE NASCIMENTO: %d/%d/%d%n" +
                        "GENERO: %s%n" +
                        "NOME DA MÃE: %s%n" +
                        "NOME DO NAMORADO: %s%n" +
                        "RENDA: %.2f%n",
                nome,
                idade,
                dianas,
                mesnas,
                anonas,
                genero,
                mae,
                namorado,
                renda
        );

        sc.close();
    }
}