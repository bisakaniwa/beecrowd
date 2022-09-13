package beecrowd;

import java.util.Scanner;

public class ex1035 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int A = reader.nextInt();
        int B = reader.nextInt();
        int C = reader.nextInt();
        int D = reader.nextInt();
        reader.close();

        if (B > C && D > A) {
            if ((C + D) > (A + B)) {
                if (C > 0 && D > 0) {
                    if (A % 2 == 0) {
                        System.out.println("Valores aceitos");
                    } else System.out.println("Valores nao aceitos");
                } else System.out.println("Valores nao aceitos");
            } else System.out.println("Valores nao aceitos");
        } else System.out.println("Valores nao aceitos");
    }
}
