import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        int total = 0;
        Scanner scanner = new Scanner(System.in);

        /*
        do {
            System.out.print("Sayi giriniz: ");
            n = scanner.nextInt();

            if(n%2==1) {
                total += n;
            }
        } while(n>0);
        System.out.println("Tek sayilarin toplami: " + total);
         */
        do {
            System.out.print("Sayi giriniz: ");
            n = scanner.nextInt();

            if(n%4==0) {
                total += n;
            }
        } while (n%2==0);
        System.out.println("4'un katlari olan cift sayilarin toplami: " + total);
    }
}
