import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       int number,tempNumber;
       int counter = 0;
       int numberValue;
       int numberTotal;
       int result = 0;


       Scanner scanner = new Scanner(System.in);

       System.out.print("Sayi giriniz: ");
       number = scanner.nextInt();

       /*
       tempNumber = number;
       while(tempNumber != 0) {
           tempNumber /= 10;
           counter++;
       }

       tempNumber = number;
       while (tempNumber != 0) {
           numberValue = tempNumber%10;
           numberTotal = 1;
           for(int i = 0; i<counter; i++) {
                numberTotal *= numberValue;
           }
           tempNumber/=10;
       result += numberTotal;
       }
       System.out.println("Sonuc: " + result);
       if(result == number) {
           System.out.println(result + " sayisi bir Armstrong sayidir.");
       } else {
           System.out.println(result + " sayisi bir Armstrong sayi degildir.");
       }
        */
       tempNumber = number;
       numberTotal = 0;
       while (tempNumber != 0) {
           numberValue = tempNumber % 10;
           numberTotal += numberValue;
           tempNumber /= 10;
       }
        System.out.println(number + " sayisinin basamak sayilarinin toplami= " + numberTotal);
    }
}
