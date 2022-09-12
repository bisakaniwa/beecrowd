package beecrowd;

import java.util.Scanner;

public class ex1017 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int hours = reader.nextInt();
        int speed = reader.nextInt();
        double distance = speed * hours;
        double fuel = distance / 12;
        System.out.printf("%.3f\n", fuel);
    }
}
