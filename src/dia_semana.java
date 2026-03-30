//4. Desenvolver um programa que leia um número de 1 a 7 e exiba o dia da semana:
//        1 - 'Domingo'
//        2 - 'Segunda'
//        3 - 'Terça'
//        4 - 'Quarta'
//        5 - 'Quinta'
//        6 - 'Sexta'
//        7 - 'Sábado'

import java.util.Scanner;

public class dia_semana {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva um número de 1 a 7: ");
        int numero = scanner.nextInt();
        String diaDaSemana;

        if (numero == 1) {
            diaDaSemana = "Domingo";
        } else if (numero == 2) {
            diaDaSemana = "Segunda";
        } else if (numero == 3) {
            diaDaSemana = "Terça";
        } else if (numero == 4) {
            diaDaSemana = "Quarta";
        } else if (numero == 5) {
            diaDaSemana = "Quinta";
        } else if (numero == 6) {
            diaDaSemana = "Sexta";
        } else if (numero == 7) {
            diaDaSemana = "Sábado";
        } else {
            diaDaSemana = "Opção inválida";
        }

        System.out.printf("%s.", diaDaSemana);
    }
}
