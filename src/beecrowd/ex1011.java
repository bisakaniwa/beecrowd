package beecrowd;
import java.util.Scanner;

public class ex1011 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double R = reader.nextFloat();
        double volume = ((4/3.0) * 3.14159 * Math.pow(R, 3));
        System.out.printf("VOLUME = %.3f\n", volume);
    }
}
