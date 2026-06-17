import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        // =========================================================
        // PRIMEIROS TESTES DE SAÍDA DE DADOS
        // =========================================================

        // Print sem quebra de linha
        // System.out.print("Olá Mundo!");

        // Print com quebra de linha
        // System.out.println("Meu primeiro programa Java");

        // Outro exemplo simples
        // System.out.print("Javeiro");


        // =========================================================
        // EXEMPLO 1 - EXIBINDO VARIÁVEIS NO CONSOLE
        // =========================================================

        int y = 32;
        double x = 10.35784;

        System.out.println(y);
        System.out.println(x);

        // Exibindo apenas 2 casas decimais
        System.out.printf("%.2f%n", x);

        // Exibindo apenas 4 casas decimais
        System.out.printf("%.4f%n", x);


        // =========================================================
        // EXEMPLO 2 - ALTERANDO A LOCALIZAÇÃO DO PROGRAMA
        // =========================================================

        // Utilizando o padrão americano para separador decimal
        Locale.setDefault(Locale.US);

        System.out.printf("%.2f%n", x);
        System.out.printf("%.4f%n", x);


        // =========================================================
        // EXEMPLO 3 - CONCATENAÇÃO COM O OPERADOR +
        // =========================================================

        int distancia = 100;

        System.out.println("RESULTADO = " + distancia + " METROS");

        String nomeNamorada = "Isabelly Ribeiro";

        System.out.println(
                "Senhoras e Senhores, meu coração já tem dona e o nome dela é "
                        + nomeNamorada
                        + ", e eu sou completamente apaixonado por essa garota!"
        );


        // =========================================================
        // EXEMPLO 4 - FORMATAÇÃO UTILIZANDO printf
        // =========================================================

        System.out.printf("RESULTADO = %.2f metros%n", x);


        // =========================================================
        // EXEMPLO 5 - FORMATANDO DIFERENTES TIPOS DE DADOS
        // =========================================================

        String nome = "Isabelly";
        int idade = 16;
        double renda = 2000.0;

        System.out.printf(
                "%s tem %d anos e tem na conta %.2f reais%n",
                nome,
                idade,
                renda
        );


        // =========================================================
        // EXEMPLO 6 - CÁLCULO DE MÉDIA
        // =========================================================

        String aluno = "Carlos";
        int idadeAluno = 21;

        double nota1 = 9.5;
        double nota2 = 8.5;

        // Média aritmética das notas
        double media = (nota1 + nota2) / 2;

        System.out.printf(
                "O aluno %s tem %d anos e obteve %.2f na primeira prova e %.2f na segunda prova, ficando com a média %.1f ao fim do semestre.%n",
                aluno,
                idadeAluno,
                nota1,
                nota2,
                media
        );
    }
}