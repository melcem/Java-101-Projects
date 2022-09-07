package com.melcem.artikyilhesaplama;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int year;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Yili Giriniz: ");
        year = scanner.nextInt();

        if(year % 4 == 0) {
            System.out.println(year + " bir artik yildir !");
        } else {
            System.out.println(year + " bir artik yil degildir !");
        }
    }
}
