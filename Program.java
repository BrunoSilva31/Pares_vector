import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantidade de números a serem digitados: ");
        int n = sc.nextInt();

        int[] vect = new int[n];

        for(int i = 0; i < n; i++) {
            System.out.println("Digite um número: ");
            vect[i] = sc.nextInt();
        }

        System.out.println();
        System.out.println("Números pares: ");
        for(int i = 0; i < n; i++) {
            if(vect[i] % 2 == 0) {
                System.out.println(vect[i]);
            }
        }  

        double count = 0;
        for(int i = 0; i < n; i++) {
            if(vect[i] % 2 == 0) {
                count = count + 1;
            }
        }
        System.out.println();
        System.out.printf("Quantidade de pares: %.0f", count);

        sc.close();
    }
}
