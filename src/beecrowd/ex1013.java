package beecrowd;
import java.util.Scanner;

public class ex1013 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int A = reader.nextInt();
        int B = reader.nextInt();
        int C = reader.nextInt();

        if (A > B && A > C) {
            System.out.println(A + " eh o maior");
        }
        else if (B > C) {
            System.out.println(B + " eh o maior");
        }
        else {
            System.out.println(C + " eh o maior");
        }
    }
}
