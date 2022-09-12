package beecrowd;

import java.util.Scanner;

public class ex1021 {
    public static void main(String[] args) {

        // incompleto

        Scanner reader = new Scanner(System.in);
        float N = reader.nextInt();
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
    }
}
