//8. Desenvolva um calculadora que receba dois números e efetue uma das seguintes operações aritméticas:
//
//   1 - Adição
//   2 - Subtração
//   3 - Multiplicação
//   4 - Divisão
//   5 - Potência
//   6 - Raiz quadrada
//   7 - Número par
//   8 - Número ímpar
//calculadora_basica.java

import java.util.Scanner;

public class calculadora_basica {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Calculadora básica!!!%nPrimeiro, digite o tipo de operação que deseja efetuar:%n");
        System.out.printf("1 - Adição%n2 - Subtração%n3 - Multiplicação%n4 - Divisão%n5 - Potência%n6 - Raiz quadrada%n7 - Número par ou ímpar%n");
        System.out.print("Digite aqui: ");
        int opcao = scanner.nextInt();
        double resultado;
        String operacao;

        if (opcao <= 4 && opcao > 0) {
            System.out.print("Digite seu primeiro número: ");
            double numero1 = scanner.nextDouble();

            System.out.print("Digite seu segundo número: ");
            double numero2 = scanner.nextDouble();

            if (opcao == 1) {
                resultado = numero1 + numero2;
                operacao = "+";
            } else if (opcao == 2) {
                resultado = numero1 - numero2;
                operacao = "-";
            } else if (opcao == 3) {
                resultado = numero1 * numero2;
                operacao = "x";
            } else {
                resultado = numero1 / numero2;
                operacao = ":";
            }

            System.out.printf("O resultado da operação %.0f %s %.0f é [%.2f]", numero1, operacao, numero2, resultado);
            
        } else if (opcao == 5) {

            System.out.print("Digite o número base: ");
            int base = scanner.nextInt();

            System.out.print("Digite o número expoente: ");
            int expoente = scanner.nextInt();

            resultado = Math.pow(base, expoente);

            System.out.printf("%d elevado a %d resulta em [%.0f]", base, expoente, resultado);

        } else if (opcao == 6) {

            System.out.print("De qual número você deseja obter a raíz quadrada? Digite: ");
            double raizQuadrada = scanner.nextDouble();

            resultado = Math.sqrt(raizQuadrada);

            System.out.printf("A raíz quadrada de %.0f é [%.2f]", raizQuadrada, resultado);

        } else if (opcao == 7) {

            System.out.print("Qual número deseja verificar se é impar ou par?(apenas inteiros) Digite: ");
            int parOuImpar = scanner.nextInt();
            String verificacao;

            if (parOuImpar % 2 == 0) {
                verificacao = "par";
            } else {
                verificacao = "ímpar";
            }

            System.out.printf("O número %d é um número %s", parOuImpar, verificacao);

        } else {
            System.out.print("Selecione uma opção válida!!!");
        }

        System.out.printf("%nPrograma encerrado.");
    }
}
