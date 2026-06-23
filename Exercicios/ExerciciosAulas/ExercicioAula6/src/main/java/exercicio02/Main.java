package exercicio02;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    //EXERCICIO PARA DESENVOLVIMENTO
    // Ler três notas com pesos diferentes (2, 3 e 5),
    // calcular a média ponderada e informar a situação do aluno.
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a nota 1 (Peso 2): ");
        double nota1 = sc.nextDouble();
        System.out.print("Digite a nota 2 (Peso 3): ");
        double nota2 = sc.nextDouble();
        System.out.print("Digite a nota 3 (Peso 5): ");
        double nota3 = sc.nextDouble();

        double media = (nota1 * 2 + nota2 * 3 + nota3 * 5) / 10;


        if(media >= 6) {
            System.out.printf("ALUNO APROVADO %nNOTA FINAL: %.1f",media);
        }
        else if(media >= 4) {
            System.out.printf("ALUNO DE EXAME %nNOTA FINAL: %.1f",media);
        }
        else{
            System.out.printf("ALUNO REPROVADO %nNOTA FINAL: %.1f",media);
        }

        sc.close();
    }
}
