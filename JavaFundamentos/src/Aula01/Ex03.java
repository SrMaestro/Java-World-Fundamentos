package Aula01;

import java.util.Locale;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // 1° Interação com o usuario
        System.out.print("Digite um número: ");
        float primeiroNumero = scanner.nextFloat();

        // 2° Interação com o usuario
        System.out.print("Digite um número: ");
        float segundoNumero = scanner.nextFloat();

        // 3° Interação com o usuario
        System.out.print("Digite um número: ");
        float terceiroNumero = scanner.nextFloat();


        //Loop para definir qual e o maior numero

        if (primeiroNumero > segundoNumero && primeiroNumero > terceiroNumero){
            System.out.println(primeiroNumero + " E seu maior numero");
        }  else if (segundoNumero > primeiroNumero && segundoNumero > terceiroNumero) {
            System.out.println(segundoNumero + " E seu maior numero");
        }else {
            System.out.println(terceiroNumero + " E seu maior numero");
        }

        //Loop para definir qual e o menor numero

        if (primeiroNumero < segundoNumero && primeiroNumero < terceiroNumero){
            System.out.println(primeiroNumero + " E seu menor numero");
        } else if (segundoNumero < primeiroNumero && segundoNumero < terceiroNumero) {
            System.out.println(segundoNumero + " E seu menor numero");
        }else {
            System.out.println(terceiroNumero + " E seu menor numero");
        }

        float mediaAritmetica = (primeiroNumero + segundoNumero+terceiroNumero)/3;
        System.out.println(mediaAritmetica + " E sua media aritmetica");

    }
}
