// PROCESSAMENTO DE DADOS EM JAVA E CASTING

public class Main {

    public static void main(String[] args) {

        /*
         * ============================================================
         * EXEMPLO 1 - PROCESSAMENTO COM NÚMEROS INTEIROS
         * ============================================================
         */

        // int x, y;
        //
        // x = 5;
        // y = 2 * x;
        //
        // System.out.println(x);
        // System.out.println(y);

        /*
         * ============================================================
         * EXEMPLO 2 - PROCESSAMENTO COM INT E DOUBLE
         * ============================================================
         */

        // int x;
        // double y;
        //
        // x = 5;
        // y = 2 * x;
        //
        // System.out.println(x);
        // System.out.println(y);

        /*
         * ============================================================
         * EXEMPLO 3 - CÁLCULO DA ÁREA DE UM TRAPÉZIO
         * ============================================================
         */

        double b, B, h, area;

        b = 6.0;
        B = 8.0;
        h = 5.0;

        area = ((b + B) / 2) * h;

        System.out.printf("A área do trapézio é: %.2f%n", area);

        /*
         * ============================================================
         * EXEMPLO 3.1 - OUTRO EXEMPLO DE ÁREA DE TRAPÉZIO
         * ============================================================
         */

        double b2, B2, h2, area2;

        b2 = 6.7;
        B2 = 12.5;
        h2 = 9.4;

        area2 = ((b2 + B2) / 2f) * h2;

        System.out.printf("A área do trapézio é: %.2f%n", area2);

        /*
         * ============================================================
         * EXEMPLO 4 - CASTING DE DIVISÃO INTEIRA PARA DOUBLE
         * ============================================================
         */

        int a, c;
        double resultado;

        a = 5;
        c = 2;

        /*
         * Sem o casting:
         * resultado = a / c;
         *
         * Como 'a' e 'c' são inteiros, o Java realiza uma divisão inteira,
         * resultando em 2.
         *
         * Utilizando o casting:
         * (double) a / c
         *
         * O valor de 'a' é convertido para double antes da divisão,
         * produzindo o resultado correto: 2.5
         */

        resultado = (double) a / c;

        System.out.println(resultado);

        /*
         * ============================================================
         * EXEMPLO 5 - CASTING DE DOUBLE PARA INT
         * ============================================================
         */

        double e;
        int f;

        e = 5.0;

        /*
         * Conversão explícita de double para int.
         * A parte decimal é descartada.
         */

        f = (int) e;

        System.out.println(f);
    }
}