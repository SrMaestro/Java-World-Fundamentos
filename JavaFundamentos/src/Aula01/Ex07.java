package Aula01;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        //instancinado o objeto scanner
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe sua idade : ");
        int idade = scanner.nextInt();

        System.out.print("Inform seu salario : ");
        double salario = scanner.nextDouble();

        if (idade >= 18 && salario >= 2000){
            System.out.println("Voce esta apto a efetuar a compra");
        }else {
            System.out.println("compra negada");
        }
    }
}
