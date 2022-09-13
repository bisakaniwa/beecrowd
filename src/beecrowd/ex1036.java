package beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class ex1036 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner reader = new Scanner(System.in);
        double A = reader.nextDouble();
        double B = reader.nextDouble();
        double C = reader.nextDouble();
        reader.close();

        double delta = (Math.pow(B, 2)) - (4 * A * C);
        if (delta < 0) {
            System.out.println("Impossivel calcular");
        } else {
            if (2 * A == 0) {
                System.out.println("Impossivel calcular");
            } else {
                double R1 = ((B * -1) + (Math.sqrt(delta))) / (2 * A);
                double R2 = ((B * -1) - (Math.sqrt(delta))) / (2 * A);
                System.out.printf("R1 = %.5f\n", R1);
                System.out.printf("R2 = %.5f\n", R2);
            }
        }
    }
}
