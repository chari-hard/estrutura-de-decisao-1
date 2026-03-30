import java.util.Scanner;

public class tipo_triangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Vamos criar um triângulo e classificar ele.%nDigite a medida do lado A: ");
        double ladoA = scanner.nextDouble();

        System.out.print("Digite a medida do lado B: ");
        double ladoB = scanner.nextDouble();

        System.out.print("Digite a medida do lado C: ");
        double ladoC = scanner.nextDouble();

        String triangulo;

        if (ladoA + ladoB > ladoC && ladoA + ladoC > ladoB && ladoB + ladoC > ladoA) {
            if (ladoA == ladoB && ladoB == ladoC) {
                triangulo = "Equilátero.";
            } else if (ladoA == ladoB || ladoB == ladoC || ladoC == ladoA) {
                triangulo = "Isósceles.";
            } else {
                triangulo = "Escaleno.";
            }
        } else {
            triangulo = "inválido. Informe valores mais próximos.";
        }

        System.out.printf("Seu triângulo é %s", triangulo);
    }
}
