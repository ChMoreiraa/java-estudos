import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        //System.out.print("Olá Mundo!"); //Print sem quebra de linha
        //System.out.println("Meu primeiro programa Java"); //Print com quebra de linha
        //System.out.print("Javeiro");


        //EXEMPLOS DE ESCRITA ( VALOR DE UMA VARIÁVEL INTEIRA E DECIMAL)
        int y = 32;
        double x = 10.35784;
        System.out.println(y);
        System.out.println(x);
        System.out.printf("%.2f%n",x); //Delimita 2 casas após a vírgula
        System.out.printf("%.4f%n",x); //Delimita 4 casas após a vírgula

        //EXEMPLO DE ESCRITA ( VALOR DECIMAL COM SEPARADOR US - MUDAR LOCALIZADOR DO PROGRAMA )
        Locale.setDefault(Locale.US); //Muda o formato do separador decimal ( Muda a localização do nosso programa )
        System.out.printf("%.2f%n",x);
        System.out.printf("%.4f%n",x);

        //EXEMPLO DE CONCATENAÇÃO PARA PRINT/PRINTLN
        int X = 100;
        System.out.println("RESULTADO = " + X + " METROS");

        String nome3 = "Isabelly Ribeiro";

        System.out.println("Senhoras e Senhores, meu coração ja tem Dona e o nome dela é " + nome3 + ", e eu sou completamente apaixonado por essa garota!");

        System.out.printf("RESULTADO = %.2f metros%n",x);

        //EXEMPLO CONCATENAÇÃO COM MAIS DE DOIS TIPOS DE VARIÁVEL
        String nome = "Isabelly";
        int idade = 16;
        double renda = 2000.0;
        System.out.printf("%s tem %d anos e tem na conta %.2f reais%n", nome, idade, renda);

        //MAIS EXEMPLOS
        String nome2 = "Carlos";
        int idade2 = 21;
        double nota1 = 9.5;
        double nota2 = 8.5;
        double media = (nota1 + nota2) / 2;

        System.out.printf("O Aluno %s , tem %d anos e obteve %.2f na primeira prova e %.2f na segunda prova, ficando com a média %.1f ao fim do semestre", nome2, idade2, nota1, nota2, media);

    }
}