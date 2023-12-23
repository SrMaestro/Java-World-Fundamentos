package Aula01;

import java.util.Locale;
import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Informe as horas: ");
        int hora = scanner.nextInt();
        // Convertendo hora em segundos
        hora = (hora * 60) * 60;

        System.out.print("Informe os minutos: ");
        int minutos = scanner.nextInt();
        // Convertendo minutos em segundos
        minutos = minutos * 60;

        System.out.print("Informe os segundos: ");
        int segundos = scanner.nextInt();

        int totalEmSegundos = hora + minutos + segundos;

        if (totalEmSegundos < 86400) {
            int segundoAteMeiaNoite = 86400 - totalEmSegundos;

            // Convertendo segundos para horas, minutos e segundos
            int horasRestantes = segundoAteMeiaNoite / 3600;
            int minutosRestantes = (segundoAteMeiaNoite % 3600) / 60;
            int segundosRestantes = segundoAteMeiaNoite % 60;

            System.out.println("Faltam " + horasRestantes + " horas, " + minutosRestantes + " minutos e "
                    + segundosRestantes + " segundos até meia-noite");
        } else {
            System.out.println("Erro desconhecido, aguarde alguns minutos e tente novamente");
        }

        if (totalEmSegundos < 86400) {


            // Convertendo segundos para horas, minutos e segundos
            int horasPassadas = totalEmSegundos / 3600;
            int minutosPassados = (totalEmSegundos % 3600) / 60;
            int segundosPassados = totalEmSegundos % 60;

            System.out.println("Já se passaram " + horasPassadas + " horas, " + minutosPassados + " minutos e "
                    + segundosPassados + " segundos após a meia-noite");
        }
    }
}
