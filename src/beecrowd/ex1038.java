package beecrowd;

import java.util.Scanner;

public class ex1038 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int code = reader.nextInt();
        int amount = reader.nextInt();
        reader.close();
        double pagar;

        if (code == 1) {
            pagar = 4.00 * amount;
            System.out.printf("Total: R$ %.2f\n", pagar);
        } else if (code == 2) {
            pagar = 4.5 * amount;
            System.out.printf("Total: R$ %.2f\n", pagar);
        } else if (code == 3) {
            pagar = 5 * amount;
            System.out.printf("Total: R$ %.2f\n", pagar);
        } else if (code == 4) {
            pagar = 2 * amount;
            System.out.printf("Total: R$ %.2f\n", pagar);
        } else if (code == 5) {
            pagar = 1.5 * amount;
            System.out.printf("Total: R$ %.2f\n", pagar);
        }
    }
}
