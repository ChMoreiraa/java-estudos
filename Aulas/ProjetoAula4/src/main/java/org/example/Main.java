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

        // String nome, mae, namorado;
        // int idade, dianas, mesnas, anonas;
        // double renda;
        // char genero;

        // nome = sc.next();
        // mae = sc.next();
        // namorado = sc.next();

        // genero = sc.next().charAt(0);

        // idade = sc.nextInt();
        // dianas = sc.nextInt();
        // mesnas = sc.nextInt();
        // anonas = sc.nextInt();

        // renda = sc.nextDouble();

        // System.out.printf(
        //         "SEJA BEM-VINDO(A)%n" +
        //                 "Seus dados são:%n" +
        //                 "NOME: %s%n" +
        //                 "IDADE: %d%n" +
        //                 "DATA DE NASCIMENTO: %d/%d/%d%n" +
        //                 "GENERO: %s%n" +
        //                 "NOME DA MÃE: %s%n" +
        //                 "NOME DO NAMORADO: %s%n" +
        //                 "RENDA: %.2f%n",
        //         nome,
        //         idade,
        //         dianas,
        //         mesnas,
        //         anonas,
        //         genero,
        //         mae,
        //         namorado,
        //         renda
        // );

        /*
         * ============================================================
         * AULA 2 - MÉTODO nextLine()
         * ============================================================
         */

        // String s1, s2, s3;
        //
        // s1 = sc.nextLine();
        // s2 = sc.nextLine();
        // s3 = sc.nextLine();
        //
        // System.out.println("DADOS DIGITADOS:");
        // System.out.println(s1);
        // System.out.println(s2);
        // System.out.println(s3);

        /*
         * ============================================================
         * PROBLEMA COM nextLine()
         * ============================================================
         *
         * O erro acontece porque o método nextInt() lê apenas o número
         * digitado e deixa o ENTER (\n) armazenado no buffer.
         *
         * Quando o primeiro nextLine() é executado, ele consome esse
         * ENTER pendente e entende que o usuário digitou uma linha vazia.
         *
         * Como consequência, as Strings ficam deslocadas.
         */

        // EXEMPLO COM ERRO

        // int x;
        // String s1, s2, s3;
        //
        // x = sc.nextInt();
        //
        // s1 = sc.nextLine();
        // s2 = sc.nextLine();
        // s3 = sc.nextLine();
        //
        // System.out.println("DADOS DIGITADOS:");
        // System.out.println(x);
        // System.out.println(s1);
        // System.out.println(s2);
        // System.out.println(s3);

        /*
         * ============================================================
         * SOLUÇÃO DO PROBLEMA
         * ============================================================
         *
         * Sempre que utilizar nextInt(), nextDouble(), nextFloat()
         * ou métodos semelhantes antes de um nextLine(),
         * utilize um nextLine() extra para limpar o buffer.
         */

        int x;
        String s1, s2, s3;

        x = sc.nextInt();

        sc.nextLine(); // Limpa o ENTER pendente no buffer

        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println("DADOS DIGITADOS:");
        System.out.println(x);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        sc.close();
    }
}