//12. Desenvolva um programa que leia quatro notas bimestrais obtidas por um aluno numa disciplina ao longo de um semestre, e calcule a sua média final. A atribuição de conceitos obedece à tabela abaixo:
//  Média de Aproveitamento  Conceito
//  Entre 9.0 e 10.0        A
//  Entre 7.5 e 8.9         B
//  Entre 6.0 e 7.4         C
//  Entre 4.0 e 5.9         D
//  Entre zero e 3.9        E
//O programa deve exibir na tela:
//  1. As quatro notas bimestrais,
//  2. A média final,
//  3. O conceito correspondente e,
//  4. A mensagem "APROVADO" ou "Reprovado" de acordo com a regra a seguir:
//     4.1. Se o conceito       for A, B ou C    exibir "APROVADO"
//     4.2. Senão se o conceito for D ou E       exibir "REPROVADO"
//situacao_escolar.java

import java.util.Scanner;


public class situacao_escolar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a sua nota de Matemática: ");
        double notaMatematica = scanner.nextDouble();

        System.out.print("Digite a sua nota de Português: ");
        double notaPortugues = scanner.nextDouble();

        System.out.print("Digite a sua nota de Geografia: ");
        double notaGeografia = scanner.nextDouble();

        System.out.print("Digite a sua nota de História: ");
        double notaHistoria = scanner.nextDouble();

        System.out.println("Calculando média final...");

        double mediaFinal = (notaMatematica + notaPortugues + notaGeografia + notaHistoria) / 4;
        String conceito;
        String situacao;

        if (mediaFinal >= 9) {
            conceito = "Tier A";
        } else if (mediaFinal >= 7.5) {
            conceito = "Tier B";
        } else if (mediaFinal >= 6) {
            conceito = "Tier C";
        } else if (mediaFinal >= 4) {
            conceito = "Tier D";
        } else  {
            conceito = "Tier E";
        }

        if (mediaFinal >= 6) {
            situacao = "APROVADO";
        } else {
            situacao = "REPROVADO";
        }

        if (notaMatematica <= 10 && notaPortugues <= 10 && notaGeografia <= 10 && notaHistoria <= 10) {
            if (mediaFinal >= 9) {
                conceito = "Tier A";
            } else if (mediaFinal >= 7.5) {
                conceito = "Tier B";
            } else if (mediaFinal >= 6) {
                conceito = "Tier C";
            } else if (mediaFinal >= 4) {
                conceito = "Tier D";
            } else  {
                conceito = "Tier E";
            }

            if (mediaFinal >= 6) {
                situacao = "APROVADO";
            } else {
                situacao = "REPROVADO";
            }

            //nao sei o pq exibir as notas, ja que quem inseriu ja sabe, mas tudo bem

            System.out.printf("Notas:%nMatemática: %.1f%nPortuguês: %.1f%nGeografia: %.1f%nfHistória: %.1f%n", notaMatematica, notaPortugues, notaGeografia, notaHistoria);
            System.out.printf("Media final: %.1f // %s%n", mediaFinal, conceito);
            System.out.printf("Situação: %s%n", situacao);

        } else {
            System.out.print("Não é possível ter uma nota maior que 10. Tente novamente...");
        }


    }
}
