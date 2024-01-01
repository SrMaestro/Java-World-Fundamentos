package Aula01;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        //instancinado o objeto scanner
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a sua idade : ");
        int idade = scanner.nextInt();

        if (idade < 16){
            System.out.println("não qualificado para votar");
        } else if (idade == 16 || idade == 17) {
            System.out.println("seu voto é facultativo");
        } else if (idade >= 65) {
            System.out.println("seu voto é facultativo");
        }else {
            System.out.println("voto obrigatorio");
        }

    }
}
