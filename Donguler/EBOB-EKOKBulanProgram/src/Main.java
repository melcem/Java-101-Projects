import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n1, n2;
        int ebob = 1;
        int ekok = 1;
        int min = 0;
        int i = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci sayiyi giriniz: ");
        n1 = scanner.nextInt();

        System.out.print("Ikinci sayiyi giriniz: ");
        n2 = scanner.nextInt();

        if(n1 > n2) {
            min = n2;
            System.out.println("Kucuk sayi: " + n2);
        } else if(n2 > n1) {
            min = n1;
            System.out.println("Kucuk sayi: " + n1);
        } else {
            System.out.println("Sayilar esit.");
        }

        /*for(int i = min; i>0; i--) {
            if(n1 % i == 0 && n2 % i == 0) {
                ebob = i;
                break;
            }
        }
        for(int i = 1; i < (n1 * n2); i++) {
            if(i%n1==0 && i%n2==0) {
                ekok = i;
                break;
            }
        }*/
        while(i <= min){
            if(n1 % i == 0 && n2 % i == 0) {
                ebob = i;
            }
            i++;
        }
        while(i <= (n1*n2)) {
            if(i % n1 == 0 && i % n2 == 0){
                ekok = i;
                break;
            }
            i++;
        }

        System.out.println("EBOB: " + ebob);
        System.out.println("EKOK: " + ekok);
    }
}
