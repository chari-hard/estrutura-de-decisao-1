//7. Desenvolva um programa que exiba na tela um menu de opções:
//        1 - Opção 1
//        2 - Opção 2
//        3 - Opção 3
//        4 - Sair
//Digite uma opção:
//Se o usuário digitar 1, exibir na tela: 'Você selecionou a opção 1'
//Se o usuário digitar 2, exibir na tela: 'Você selecionou a opção 2'
//Se o usuário digitar 3, exibir na tela: 'Você selecionou a opção 3'
//Se o usuário digitar 4, exibir na tela: 'Você selecionou sair'
//Se o usuário digitar uma opção diferente das apresentadas no menu, exibir 'Opção inválida!!!'
//Exibir no final do processamento 'Fim do programa!'
//varias_opcoes.java

import java.util.Scanner;

public class varias_opcoes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Digite alguma das seguintes opções:%n1 - opção 1%n2 - opção 2%n3 - opção 3%n4 - Sair.%nOpção selecionada: ");
        int opcao = scanner.nextInt();

        if (opcao <= 4 && opcao > 0) {
            if (opcao < 4) {
                System.out.printf("Você selecionou a opção %d.%n", opcao);
            } else {
                System.out.println("Você saiu");
            }
        } else {
            System.out.println("Opção inválida!!!");
        }

        System.out.print("Fim do programa!");
    }
}
