package beecrowd;

import java.util.Scanner;

public class ex1020 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int tempo = reader.nextInt();
        int anos = tempo / 365;
        int meses = (tempo - (365 * anos)) / 30;
        int dias = tempo - (365 * anos) - (30 * meses);
        System.out.println(anos + " ano (s)");
        System.out.println(meses + " mes (es)");
        System.out.println(dias + " dia (s)");
    }
}
