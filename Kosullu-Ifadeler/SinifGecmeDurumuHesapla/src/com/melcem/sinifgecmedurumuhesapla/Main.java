package com.melcem.sinifgecmedurumuhesapla;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat,fizik,turkce,kimya,muzik;
        double ort;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Matematik Notunuz: ");
        mat = scanner.nextInt();

        System.out.print("Fizik Notunuz: ");
        fizik = scanner.nextInt();

        System.out.print("Turkce Notunuz: ");
        turkce = scanner.nextInt();

        System.out.print("Kimya Notunuz: ");
        kimya = scanner.nextInt();

        System.out.print("Muzik Notunuz: ");
        muzik = scanner.nextInt();


        if(mat < 0 || mat > 100) {
            mat = 0;
        }
        if(fizik < 0 || fizik > 100) {
            fizik = 0;
        }
        if(turkce < 0 || turkce > 100) {
            turkce = 0;
        }
        if(kimya < 0 || kimya > 100) {
            kimya = 0;
        }
        if(muzik < 0 || muzik > 100) {
            muzik = 0;
        }

        ort = (mat + fizik + turkce + kimya + muzik)/5;

        if(ort < 55) {
            System.out.println("Sinifta kaldiniz, seneye tekrar gorusmek uzere!!!");
        } else {
            System.out.println("Tebrikler sinifi gectiniz.");
        }
        System.out.println("Ortalamaniz: " + ort);
    }
}
