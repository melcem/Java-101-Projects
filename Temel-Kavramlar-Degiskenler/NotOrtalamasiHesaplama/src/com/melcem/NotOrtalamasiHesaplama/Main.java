package com.melcem.NotOrtalamasiHesaplama;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double matematik,fizik,kimya,turkce,tarih,muzik,ortalama;
        String ogrenci;
        boolean gecti;


        Scanner scanner = new Scanner(System.in);

        System.out.print("Lutfen matematik notunu giriniz: ");
        matematik = scanner.nextByte();

        System.out.print("Lutfen fizik notunu giriniz: ");
        fizik = scanner.nextByte();

        System.out.print("Lutfen kimya notunu giriniz: ");
        kimya = scanner.nextByte();

        System.out.print("Lutfen turkce notunu giriniz: ");
        turkce = scanner.nextByte();

        System.out.print("Lütfen tarih notunu giriniz: ");
        tarih = scanner.nextByte();

        System.out.print("Lutfen muzik notunu giriniz: ");
        muzik = scanner.nextByte();

        ortalama = (matematik + fizik + kimya + turkce + tarih + muzik)/6;
        System.out.println("Notlarinizin ortalamasi: " + ortalama);

        gecti = ortalama > 60;
        ogrenci = gecti ? "Sinifi Gecti." : "Sinifta Kaldi.";

        System.out.println("Ogrenci " + ogrenci);
    }
}
