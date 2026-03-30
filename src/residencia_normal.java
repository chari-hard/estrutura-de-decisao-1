//2. Desenvolver um programa que leia o consumo de água para uma residência normal e exiba o valor (R$) da conta baseado nos seguintes cálculos:
//Se o consumo for menor ou igual a 10m3, então R$ 22,38
//Se o consumo for menor ou igual a 20m3, então R$ 3,50 por m3
//Se o consumo for menor ou igual a 50m3, então R$ 8,75 por m3
//Se o consumo for acima dos 50m3, então R$ 9,64 por m3
//residencia_normal.java

import java.util.Scanner;

public class residencia_normal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva seu consumo de água(por metro cúbico): ");
        double consumoDeAgua = scanner.nextInt();
        double valorEstimado;

        if (consumoDeAgua <= 10) {
            valorEstimado = 22.38;
        } else if (consumoDeAgua <= 20) {
            valorEstimado = consumoDeAgua * 3.50;
        } else if (consumoDeAgua <= 50) {
            valorEstimado = consumoDeAgua * 8.75;
        } else {
            valorEstimado = consumoDeAgua * 9.64;
        }

        System.out.printf("Seu consumo foi de %.0fm3.%n", consumoDeAgua);
        System.out.printf("O valo a ser pago será de R$%.2f", valorEstimado);
    }
}

