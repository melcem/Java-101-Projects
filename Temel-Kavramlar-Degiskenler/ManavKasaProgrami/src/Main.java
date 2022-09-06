package com.melcem.manavkasaprogrami;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double armut, elma, domates, muz, patlican, armutKilo, elmaKilo, domatesKilo,
                muzKilo, palicanKilo,tutar;

        armutKilo = 2.14;
        elmaKilo = 3.67;
        domatesKilo = 1.11;
        muzKilo = 0.95;
        palicanKilo = 5.00;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Armut Kac Kilo ? : ");
        armut = scanner.nextDouble();

        System.out.print("Elma Kac Kilo ? : ");
        elma = scanner.nextDouble();

        System.out.print("Domates Kac Kilo ? : ");
        domates = scanner.nextDouble();

        System.out.print("Muz Kac Kilo ? : ");
        muz = scanner.nextDouble();

        System.out.print("Patlican Kac Kilo ? : ");
        patlican = scanner.nextDouble();

        tutar = ((armut * armutKilo) + (elma * elmaKilo) + (domates * domatesKilo) + (muz * muzKilo) + (patlican * palicanKilo));

        System.out.println("Toplam Tutar : " + tutar + " TL");
    }
}
