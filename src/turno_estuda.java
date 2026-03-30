//10 - Desenvolva um programa que pergunte em que turno você estuda.
//        Peça para digitar: M-Matutino ou V-Vespertino ou N- Noturno.
//        Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor Inválido!", conforme o caso.
//        Obs.: Somente letras maiúsculas para M, V ou N.
//        turno_estuda_java

import java.util.Scanner;

public class turno_estuda {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.printf("Qual turno você estuda? opções:%n- M ou Matutino%n- V ou Vespertino%n- N ou Noturno%n");
        System.out.print("Digite aqui: ");
        char turno = scanner.next().toUpperCase().charAt(0);

        switch (turno) {
            case 'M':
                System.out.println("Bom dia!");
                break;
            case 'V':
                System.out.println("Boa tarde");
                break;
            case 'N':
                System.out.println("Boa noite");
                break;
            default:
                System.out.println("Valor inválido");
                break;
        }

    }
}
