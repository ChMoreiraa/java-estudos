package org.example;

/**
 * Aula sobre:
 * - Operadores Comparativos
 * - Operadores Lógicos
 * - Estruturas Condicionais em Java
 */
public class Main {

    public static void main(String[] args) {

        /*
         * ==========================================================
         * OPERADORES COMPARATIVOS
         * ==========================================================
         *
         * >   Maior que
         * <   Menor que
         * >=  Maior ou igual a
         * <=  Menor ou igual a
         * ==  Igual a
         * !=  Diferente de
         */

        // Exemplo:
        // int x = 5;
        //
        // System.out.println(x > 0);    // true
        // System.out.println(x < 0);    // false
        // System.out.println(x >= 5);   // true
        // System.out.println(x <= 10);  // true
        // System.out.println(x == 5);   // true
        // System.out.println(x != 5);   // false

        /*
         * ==========================================================
         * OPERADORES LÓGICOS
         * ==========================================================
         *
         * && -> AND (E)
         * || -> OR (OU)
         * !  -> NOT (NÃO)
         */

        // Exemplo:
        // int x = 5;
        //
        // boolean valor = x <= 20 && x != 10;
        // System.out.println(valor);
        //
        // valor = x == 10 || x <= 20;
        // System.out.println(valor);
        //
        // valor = !(x == 10 || x <= 20);
        // System.out.println(valor);

        /*
         * ==========================================================
         * ESTRUTURA CONDICIONAL SIMPLES
         * ==========================================================
         *
         * Executa o bloco apenas se a condição for verdadeira.
         */

        // int x = 5;
        //
        // System.out.println("Bom dia");
        //
        // if (x > 0) {
        //     System.out.println("Boa tarde");
        // }
        //
        // System.out.println("Boa noite");

        /*
         * ==========================================================
         * ESTRUTURA CONDICIONAL COMPOSTA
         * ==========================================================
         *
         * Utiliza if e else para executar caminhos diferentes.
         */

        // int x = 55;
        //
        // if (x > 50) {
        //     System.out.println("Bom dia a todos!");
        // } else {
        //     System.out.println("Boa noite a todos!");
        // }

        /*
         * ==========================================================
         * ENCADEAMENTO DE ESTRUTURAS CONDICIONAIS
         * ==========================================================
         *
         * Utiliza if, else if e else para avaliar múltiplas condições.
         */

        int x = 42;

        if (x <= 30) {
            System.out.println("Menor ou igual a 30");
        } else if (x <= 50) {
            System.out.println("Maior que 30 e menor ou igual a 50");
        } else if (x <= 70) {
            System.out.println("Maior que 50 e menor ou igual a 70");
        } else {
            System.out.println("Maior que 70");
        }
    }
}