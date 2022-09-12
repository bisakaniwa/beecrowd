package beecrowd;

import java.util.Scanner;

public class clase {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int notas[] = {100, 50, 20, 10, 5, 2, 1};
        int entrada = reader.nextInt();
        System.out.println(entrada);
        for (int i = 0; i < notas.length; i++) {
            System.out.printf("%d notas de R$ %.2f\n", (entrada/notas[i]),(double)notas[i]);
            entrada %= notas[i];
        }
    }
}
