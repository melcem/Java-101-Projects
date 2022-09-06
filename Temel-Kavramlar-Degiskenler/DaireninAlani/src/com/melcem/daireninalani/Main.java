package com.melcem.daireninalani;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //Dairenin cevresi ve alani.
        double r, pi, cevreDaire, alanDaire, aAcisi;

        pi = 3.14;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Dairenin yaricapini giriniz: ");
        r = scanner.nextDouble();

        cevreDaire = 2 * pi * r;
        alanDaire = pi * r * r;

        System.out.println("Dairenin cevresi: " + cevreDaire);
        System.out.println("Dairenin alani: " + alanDaire);

        //Yaricapi r, merkez acisinin olcusu a olan daire diliminin alani.

        System.out.print("r yaricapini giriniz: ");
        r = scanner.nextDouble();

        System.out.print("a acisini giriniz: ");
        aAcisi = scanner.nextDouble();

        alanDaire = (pi * (r * r) * aAcisi) / 360;
        System.out.println("Merkez acisinin olcusu " + aAcisi + " olan,\n" + r +" yaricapli dairenin alani: " + alanDaire + " metrekaredir.5");
    }
}
