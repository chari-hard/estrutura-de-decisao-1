//11 - Desenvolva um programa que recebe o salário de um funcionário e determine o reajuste segundo o seguinte critério, baseado no salário atual:
//  salários até R$ 1000,00 (incluindo)     : aumento de 20%
//  salários até R$ 1.700,00                : aumento de 15%
//  salários até R$ 2.300,00                : aumento de 10%
//  salários acima de R$ 2.300,00 em diante : aumento de 5%

import java.util.Scanner;

public class reajuste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escreva seu salário atual: ");
        double salario = scanner.nextDouble();
        double reajuste;
        double total;

        if (salario <= 1000) {
            reajuste = salario * 0.2;
            total = salario + reajuste;
        } else if (salario <= 1700) {
            reajuste = salario * 0.15;
            total = salario + reajuste;
        } else if (salario <= 2300) {
            reajuste = salario * 0.1;
            total = salario + reajuste;
        } else {
            reajuste = salario * 0.05;
            total = salario + reajuste;
        }

        System.out.printf("Salário atual: R$%.2f%n", salario);
        System.out.printf("Aumento: R$%.2f%n", reajuste);
        System.out.printf("Salário reajustado: R$%.2f%n", total);
    }
}
