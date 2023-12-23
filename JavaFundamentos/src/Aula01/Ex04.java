package Aula01;

import java.util.Locale;
import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Quanto e o salario minimo: ");
        double salarioMinimo = scanner.nextDouble();
        System.out.print("Digite o seu salario :");
        double salarioPessoal = scanner.nextDouble();

        double quantidadesDeSlariosPessoal = salarioPessoal/salarioMinimo;

        System.out.printf("Você recebe %.2f salários mínimos\n", quantidadesDeSlariosPessoal);

    }
}
