//9 - Desenvolva um programa que leia o valor (R$) de um salário qualquer e calcule e exiba o desconto com IRRF e INSS;
//fonte: https://impostoderenda2023.com.br/tabela-do-imposto-de-renda-2023/
//imposto.java

import java.util.Scanner;

public class imposto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu salário: ");
        double salario = scanner.nextDouble();
        double inss;

        if(salario == 0){
            System.out.println("Por favor, insira um salário válido.");
        }

        if(salario <= 1412.00){
            inss = salario * 0.075;
        } else if (salario <= 2666.68) {
            inss = salario * 0.09;
        } else if (salario <= 4000.03 ) {
            inss = salario * 0.12;
        } else {
            inss = salario * 0.14;
        }

        double baseIRRF = salario - inss;
        double irrf;

        if(baseIRRF <= 2259.20){
            irrf = 0;
        } else if (baseIRRF <= 2826.65) {
            irrf = (baseIRRF * 0.075) - 169.44;
        } else if (baseIRRF <= 3751.05) {
            irrf = (baseIRRF * 0.15) - 381.44;
        }else if (baseIRRF <= 4664.68) {
            irrf = (baseIRRF * 0.225) - 662.77;
        } else{
            irrf = (baseIRRF * 0.275) - 896.00;
        }

        double roubado = inss + irrf;
        double salarioLiquido = salario - roubado;


        System.out.printf("Salário = R$ %.2f%nDesconto INSS = R$ %.2f%nDesconto IRRF = R$ %.2f%nParte roubada = %.2f%nSalário líquido = R$ %.2f%n" , salario, inss, irrf, roubado, salarioLiquido);
    }
}
