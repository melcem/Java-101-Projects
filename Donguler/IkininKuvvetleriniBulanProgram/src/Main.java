import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Sayi giriniz: ");
        n = scanner.nextInt();

        System.out.print("4'un katlari: ");
        for(int i=1; i<n; i*=4) {
            System.out.print(i+"\t");
        }
        System.out.print("\n5'in katlari: ");
        for(int i=1; i<n; i*=5) {
            System.out.print(i+"\t");
        }
    }
}
