package com.melcem.KDVTutariHesaplama;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double kdv,kdvTutari,fiyat,fiyatKdv;

        kdv = 0.18;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lutfen fiyati giriniz: ");
        fiyat = scanner.nextDouble();

        kdvTutari = fiyat * kdv;
        fiyatKdv = kdvTutari + fiyat;

        System.out.println("KDV'siz Fiyat = " + fiyat);
        System.out.println("KDV'li Fiyat = " + fiyatKdv);
        System.out.println("KDV tutari = " + kdvTutari);

    }
}
