//3. Desenvolver um programa que leia o consumo de água para prédios comerciais e industriais e exiba o valor (R$) da conta baseado nos seguintes cálculos:
//Se o consumo for menor ou igual a 10m3, então R$ 44,95
//Se o consumo for menor ou igual a 20m3, então R$ 8,75 por m3
//Se o consumo for menor ou igual a 50m3, então R$ 16,76 por m3
//Se o consumo for acima dos 50m3, então R$ 17,46 por m3
//comercio_industria.java


import java.util.Scanner;

public class comercio_industria {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva seu consumo de água(por metro cúbico): ");
        double consumoDeAgua = scanner.nextInt();
        double valorEstimado;

        if (consumoDeAgua <= 10) {
            valorEstimado = 44.95;
        } else if (consumoDeAgua <= 20) {
            valorEstimado = consumoDeAgua * 8.75;
        } else if (consumoDeAgua <= 50) {
            valorEstimado = consumoDeAgua * 16.76;
        } else {
            valorEstimado = consumoDeAgua * 17.46;
        }

        System.out.printf("Seu consumo foi de %.0fm3.%n", consumoDeAgua);
        System.out.printf("O valor a ser pago será de R$%.2f", valorEstimado);
    }
}
