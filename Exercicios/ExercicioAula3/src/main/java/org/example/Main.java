public class Main {

    public static void main(String[] args) {

        /*
         * ============================================================
         * EXEMPLO 1 - CÁLCULO DA ÁREA DE UM TRIÂNGULO
         * ============================================================
         */

        // double b, h, area;
        //
        // b = 10.8;
        // h = 25.5;
        //
        // area = (b * h) / 2;
        //
        // System.out.printf(
        //         "A área do triângulo que tem a base %.1f e a altura %.1f é %.2f%n",
        //         b,
        //         h,
        //         area
        // );

        /*
         * ============================================================
         * EXEMPLO 2 - CÁLCULO DA ÁREA E DO PERÍMETRO DE UM RETÂNGULO
         * ============================================================
         */

        double b, h, area, perimetro;

        b = 29.0;
        h = 45.0;

        perimetro = 2 * (b + h);
        area = b * h;

        System.out.printf("Perímetro: %.1f%n", perimetro);
        System.out.printf("Área: %.1f%n", area);

        /*
         * ============================================================
         * EXEMPLO 3 - FÓRMULA DE BHASKARA
         * ============================================================
         */

        // int x1, x2, a, b, c, delta;
        //
        // a = 1;
        // b = 0;
        // c = -25;
        //
        // delta = (int) (Math.pow(b, 2) - 4 * a * c);
        //
        // x1 = (int) (-b + Math.sqrt(delta)) / 2 * a;
        // x2 = (int) ((-b - Math.sqrt(delta)) / 2 * a);
        //
        // System.out.printf(
        //         "Fórmula de Bhaskara:%n" +
        //         "a: %d | b: %d | c: %d%n",
        //         a,
        //         b,
        //         c
        // );
        //
        // System.out.printf("X1: %d%n", x1);
        // System.out.printf("X2: %d%n", x2);
    }
}