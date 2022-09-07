package com.melcem.sayilarikucuktenbuyugesiralama;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a,b,c;

        Scanner scanner = new Scanner(System.in);

        System.out.print("1. sayi: ");
        a = scanner.nextInt();

        System.out.print("2. sayi: ");
        b = scanner.nextInt();

        System.out.print("3. sayi: ");
        c = scanner.nextInt();

        if((a<b) && (a<c)) {
            if(b<c) {
                System.out.println("Siralama: (a=" + a + ") < (b=" + b + ") < (c=" + c +")");
            } else {
                System.out.println("Siralama: (a=" + a + ") < (c=" + c + ") < (b=" + b +")");
            }
        } else if((b<a) && (b<c)) {
            if(a<c) {
                System.out.println("Siralama: (b=" + b + ") < (a=" + a + ") < (c=" + c +")");
            } else {
                System.out.println("Siralama: (b=" + b + ") < (c=" + c + ") < (a=" + a +")");
            }
        } else {
            if(a<b) {
                System.out.println("Siralama: (c=" + c + ") < (a=" + a + ") < (b=" + b +")");
            } else {
                System.out.println("Siralama: (c=" + c + ") < (b=" + b + ") < (a=" + a +")");
            }
        }
    }
}
