import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n,k,i;
        int total=1;

        i=1;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ussu alinacak sayi: ");
        n = scanner.nextInt();

        System.out.print("Us olacak sayi: ");
        k = scanner.nextInt();

        /*
        while (i<=k) {
            total = total*n;
            i++;
        }*/

        for(;i<=k ;i++) {
            total = total*n;
        }
        System.out.println(n + " ussu " + k + " = " + total);
    }
}
