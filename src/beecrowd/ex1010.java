package beecrowd;
import java.util.Scanner;

public class ex1010 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int produto1codigo = reader.nextInt();
        int produto1unidades = reader.nextInt();
        float produto1preco = reader.nextFloat();
        int produto2codigo = reader.nextInt();
        int produto2unidades = reader.nextInt();
        float produto2preco = reader.nextFloat();
        float total = ((produto1unidades * produto1preco) + (produto2unidades * produto2preco));
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);
    }
}
