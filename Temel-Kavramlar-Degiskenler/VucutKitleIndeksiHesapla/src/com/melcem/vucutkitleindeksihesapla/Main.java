package com.melcem.vucutkitleindeksihesapla;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double kilo, boy, indexVucutKitle;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lutfen boyunuzu (metre cinsinden) giriniz : ");
        boy = scanner.nextDouble();

        System.out.print("Lutfen kilonuzu giriniz : ");
        kilo = scanner.nextDouble();

        indexVucutKitle = kilo/(boy * boy);

        System.out.println("Vucut Kitle Indeksiniz : " + indexVucutKitle);
    }
}
