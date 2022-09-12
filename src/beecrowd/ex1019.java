package beecrowd;

import java.util.Scanner;

public class ex1019 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int tempo = reader.nextInt();
        int seg = tempo % 60;
        int min = (tempo % 3600) / 60;
        int hora = tempo / 3600;

        System.out.println(hora + ":" + min + ":" + seg);
    }
}
