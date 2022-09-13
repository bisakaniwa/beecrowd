package beecrowd;

import java.util.Scanner;

public class ex1040 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double N1 = reader.nextDouble();
        double N2 = reader.nextDouble();
        double N3 = reader.nextDouble();
        double N4 = reader.nextDouble();
        double media = ((N1 * 2) + (N2 * 3) + (N3 * 4) + N4) / (2 + 3 + 4 + 1);

        System.out.printf("Media: %.1f\n", media);

        if (media >= 7) {
            System.out.println("Aluno aprovado.");
        } else if (media < 5) {
            System.out.println("Aluno reprovado.");
        } else {
            System.out.println("Aluno em exame.");

            double exame = reader.nextDouble();
            reader.close();
            System.out.printf("Nota do exame: %.1f\n", exame);
            double novaMedia = (media + exame) / 2;

            if (novaMedia >= 5) {
                System.out.println("Aluno aprovado.");
            } else System.out.println("Aluno reprovado.");
            System.out.printf("Media final: %.1f", novaMedia);
        }
    }
}
