package com.melcem.kullanicigirisi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password, choose, passwordNew;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Kullanici Adiniz: ");
        userName = scanner.nextLine();

        System.out.print("Sifreniz: ");
        password = scanner.nextLine();

        if(userName.equals("patika") && password.equals("java124")) {
            System.out.println("Giris yaptiniz!");
        } else {
            System.out.println("Bilgileriniz Yanlis!\n Sifre sifirlamak istiyor musunuz? (E/H)");
            choose = scanner.nextLine();

            if(choose.equals("E")) {
                System.out.print("Yeni sifreniz: ");
                passwordNew = scanner.nextLine();

                if (passwordNew.equals(password) || passwordNew.equals("java124")) {
                    System.out.println("Sifre olusturulamadi, lutfen baska sifre giriniz.");
                } else {
                    System.out.println("Sifre olusturuldu.");
                }
            } else {
                System.out.println("Iyi gunler...");
            }
        }
    }
}
