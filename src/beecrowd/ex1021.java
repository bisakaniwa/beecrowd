package beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class ex1021 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner reader = new Scanner(System.in);
        float N = reader.nextFloat();
        reader.close();
        float cem = ((N - (N % 100))/100);
        N = N % 100;
        float cinq = ((N - (N % 50))/50);
        N = N % 50;
        float vint = ((N - (N % 20))/20);
        N = N % 20;
        float dez = ((N - (N % 10))/10);
        N = N % 10;
        float cinco = ((N - (N % 5))/5);
        N = N % 5;
        float dois = ((N - (N % 2))/2);
        N = N % 2;
        float moedaUm = N - (N % 1);
        N = N % 1;
        float moeda50 = (N - (N % 0.50f))/0.50f;
        N = N % 0.50f;
        float moeda25 = (N - (N % 0.25f))/0.25f;
        N = N % 0.25f;
        float moeda10 = (N - (N % 0.1f))/0.1f;
        N = N % 0.1f;
        float moeda5 = (N - (N % 0.05f))/0.05f;
        N = N % 0.05f;
        float moeda1 = (N - (N % 0.01f))/0.01f;

        System.out.println("NOTAS:");
        System.out.println((int)cem + " nota(s) de R$ 100.00");
        System.out.println((int)cinq + " nota(s) de R$ 50.00");
        System.out.println((int)vint + " nota(s) de R$ 20.00");
        System.out.println((int)dez + " nota(s) de R$ 10.00");
        System.out.println((int)cinco + " nota(s) de R$ 5.00");
        System.out.println((int)dois + " nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println((int)moedaUm + " moeda(s) de R$ 1.00");
        System.out.println((int)moeda50 + " moeda(s) de R$ 0.50");
        System.out.println((int)moeda25 + " moeda(s) de R$ 0.25");
        System.out.println((int)moeda10 + " moeda(s) de R$ 0.10");
        System.out.println((int)moeda5 + " moeda(s) de R$ 0.05");
        System.out.println((int)Math.ceil(moeda1) + " moeda(s) de R$ 0.01");
    }
}
