package Aula01;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {


        int status;

        //instancinado o objeto scanner
        Scanner scanner = new Scanner(System.in);



        System.out.println("Digite as 1 para pessoa gestante : ");
        System.out.println("digite 2 para pessoa idosa : ");
        System.out.println("Digite as 3 para pessoa PCD : ");
        System.out.println("Digite as 4 para nenhuma das anteriores : ");


        status = scanner.nextInt();



        switch (status) {
            case 1, 3, 2:
                System.out.println(" possui direito");
                break;
            case 4:
                System.out.println(" não possui  direito");
                break;

        }

    }
}
