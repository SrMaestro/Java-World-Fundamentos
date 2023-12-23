package Aula01;

import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {
        //instanciei um objeto scanner
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero : ");
        int primeiroNumero = scanner.nextInt();
        System.out.print("digite outro numero : ");
        int segundoNumero = scanner.nextInt();
        System.out.println("Primeiro número: " + primeiroNumero + "\nSegundo número: " + segundoNumero);

    }

}
