//1. Desenvolver um programa que leia o consumo de água para uma residência social e exiba o valor (R$) da conta baseado nos seguintes cálculos:
//Se o consumo for menor ou igual a 10m3, então R$ 7,59
//Se o consumo for menor ou igual a 20m3, então R$ 1,31 por m3
//Se o consumo for menor ou igual a 30m3, então R$ 4,64 por m3
//Se o consumo for menor ou igual a 50m3, então R$ 6,62 por m3
//Se o consumo for acima dos 50m3, então R$ 7,31 por m3

import java.util.Scanner;

public class residencia_social {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva seu consumo de água(por metro cúbico): ");
        double consumoDeAgua = scanner.nextInt();
        double valorEstimado;

        if (consumoDeAgua <= 10) {
            valorEstimado = 7.59;
        } else if (consumoDeAgua <= 20) {
            valorEstimado = consumoDeAgua * 1.31;
        } else if (consumoDeAgua <= 30) {
            valorEstimado = consumoDeAgua * 4.64;
        } else if (consumoDeAgua <= 50) {
            valorEstimado = consumoDeAgua * 6.62;
        } else {
            valorEstimado = consumoDeAgua * 7.31;
        }

        System.out.printf("Seu consumo foi de %.0fm3.%n", consumoDeAgua);
        System.out.printf("O valor a ser pago será de R$%.2f", valorEstimado);
    }
}

