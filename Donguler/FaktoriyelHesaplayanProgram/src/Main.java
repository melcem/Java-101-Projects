import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* int n,fact=1;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Sayi giriniz: ");
        n = scanner.nextInt();

        for(int i=1; i<=n; i++) {
            fact*=i;
        }
        System.out.println(n + " faktoriyel: " + fact); */

        int C,n,r;
        int nFact=1;
        int rFact=1;
        int nrFact=1;

        Scanner scanner = new Scanner(System.in);

        System.out.print("n sayisini girin: ");
        n = scanner.nextInt();

        System.out.print("r sayisini girin: ");
        r = scanner.nextInt();

        for(int i=1; i<=n; i++) {
            nFact *= i;
        }
        System.out.println("n! = " + nFact);
        for(int i=1; i<=r; i++) {
            rFact *= i;
        }
        System.out.println("r! = " + rFact);
        for(int i=1; i<=n-r; i++) {
            nrFact *= i;
        }
        System.out.println("(n-r)! = " + nrFact);

        C = nFact/(rFact * nrFact);
        System.out.println("C(n,r)= " + C);
    }
}
