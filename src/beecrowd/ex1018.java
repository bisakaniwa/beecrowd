package beecrowd;

import java.util.Scanner;

public class ex1018 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int N = reader.nextInt();
        int valor = N;
        int cem = ((N - (N % 100))/100);
        N = N % 100;
        int cinq = ((N - (N % 50))/50);
        N = N % 50;
        int vint = ((N - (N % 20))/20);
        N = N % 20;
        int dez = ((N - (N % 10))/10);
        N = N % 10;
        int cinco = ((N - (N % 5))/5);
        N = N % 5;
        int dois = ((N - (N % 2))/2);
        N = N % 2;
        int um = N;


        System.out.println(valor);
        System.out.println(cem + " nota(s) de R$ 100,00");
        System.out.println(cinq + " nota(s) de R$ 50,00");
        System.out.println(vint + " nota(s) de R$ 20,00");
        System.out.println(dez + " nota(s) de R$ 10,00");
        System.out.println(cinco + " nota(s) de R$ 5,00");
        System.out.println(dois + " nota(s) de R$ 2,00");
        System.out.println(um + " nota(s) de R$ 1,00");
    }
}
