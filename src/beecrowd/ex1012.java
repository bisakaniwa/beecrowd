package beecrowd;
import java.util.Scanner;

public class ex1012 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double A = reader.nextDouble();
        double B = reader.nextDouble();
        double C = reader.nextDouble();
        double pi = 3.14159;
        double TRIANGULO = (A * C) / 2;
        double CIRCULO = pi * Math.pow(C, 2);
        double TRAPEZIO = ((A + B) / 2) * C;
        double QUADRADO = B * B;
        double RETANGULO = A * B;
        System.out.printf("TRIANGULO: %.3f\n", TRIANGULO);
        System.out.printf("CIRCULO: %.3f\n", CIRCULO);
        System.out.printf("TRAPEZIO: %.3f\n", TRAPEZIO);
        System.out.printf("QUADRADO: %.3f\n", QUADRADO);
        System.out.printf("RETANGULO: %.3f\n", RETANGULO);
    }
}
