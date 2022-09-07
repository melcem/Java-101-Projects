package com.melcem.taksimetreprogrami;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int km, ilkUcret;
        double perKm, tutar,minUcret;
        boolean minTutar;


        perKm = 2.20;
        ilkUcret = 10;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen gidilen mesafeyi girin(km): ");
        km = scanner.nextInt();

        tutar = (km * perKm) + ilkUcret;
        minTutar = tutar < 20;

        tutar = minTutar ? 20 : tutar;

        System.out.println("Odenecek tutar: " + tutar);
    }
}
