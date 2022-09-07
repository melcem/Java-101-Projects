package com.melcem.hesapmakinesi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double number1,number2,sonuc;
        int islem;

        sonuc = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci sayiyi giriniz: ");
        number1 = scanner.nextDouble();

        System.out.print("Ikinci sayiyi giriniz: ");
        number2 = scanner.nextDouble();

        System.out.println("1- Toplam\n2- Cikarma\n3- Carpma\n4- Bolme");
        System.out.print("Islem Seciniz: ");

        islem = scanner.nextInt();


        switch (islem) {
            case 1:
                sonuc = number1 + number2;
                break;
            case 2:
                sonuc = number1 - number2;
                 break;
            case 3:
                sonuc = number1 * number2;
                 break;
            case 4:
                if(number2 != 0) {
                    sonuc = number1 / number2;
                    break;
                } else {
                    System.out.println("Payda sifir olamaz!!!");
                    break;
                }
            default:
                System.out.println("Rakam giriniz!!!");
                break;
        }
        System.out.println("Islem sonucu: " + sonuc);
    }
}
