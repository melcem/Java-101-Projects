import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {
        int n;
        double total=0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Sayi giriniz: ");
        n = scanner.nextInt();

        for(double i=1; i<=n; i++) {
            total += (1/i);
        }
        System.out.println("Harmonik sayi: " + total);
    }
}
