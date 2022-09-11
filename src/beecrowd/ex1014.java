package beecrowd;
import java.util.Locale;
import java.util.Scanner;

public class ex1014 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner reader = new Scanner(System.in);
        int X = reader.nextInt();
        double Y = reader.nextFloat();
        double consumo = X / Y;
        System.out.printf("%.3f km/l\n", consumo);
    }
}
