// FUNÇÕES MATEMÁTICAS EM JAVA

public class Main {

    public static void main(String[] args) {

        /*
         * ============================================================
         * PRINCIPAIS FUNÇÕES MATEMÁTICAS DA CLASSE Math
         * ============================================================
         *
         * Math.sqrt(x) -> Retorna a raiz quadrada de x.
         *
         * Math.pow(x, y) -> Retorna x elevado a y.
         *
         * Math.abs(x) -> Retorna o valor absoluto de x.
         *                Remove o sinal negativo, caso exista.
         *
         * Exemplos:
         * Math.abs(-120) = 120
         * Math.abs(120)  = 120
         */

        double x = 3.0;
        double y = 4.0;
        double z = -5.0;

        double A, B, C;

        /*
         * ============================================================
         * EXEMPLO 1 - RAIZ QUADRADA (Math.sqrt)
         * ============================================================
         */

        A = Math.sqrt(x);
        B = Math.sqrt(y);
        C = Math.sqrt(25.0);

        System.out.println("Raiz quadrada de " + x + " = " + A);
        System.out.println("Raiz quadrada de " + y + " = " + B);
        System.out.println("Raiz quadrada de 25 = " + C);

        /*
         * ============================================================
         * EXEMPLO 2 - POTENCIAÇÃO (Math.pow)
         * ============================================================
         */

        A = Math.pow(x, y);
        B = Math.pow(x, 2.0);
        C = Math.pow(5.0, 2.0);

        System.out.println(x + " elevado a " + y + " = " + A);
        System.out.println(x + " elevado ao quadrado = " + B);
        System.out.println("5 elevado ao quadrado = " + C);

        /*
         * ============================================================
         * EXEMPLO 3 - VALOR ABSOLUTO (Math.abs)
         * ============================================================
         */

        A = Math.abs(y);
        B = Math.abs(z);

        System.out.println("Valor absoluto de " + y + " = " + A);
        System.out.println("Valor absoluto de " + z + " = " + B);
    }
}