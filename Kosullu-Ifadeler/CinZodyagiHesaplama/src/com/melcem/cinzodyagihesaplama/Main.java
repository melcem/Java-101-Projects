package com.melcem.cinzodyagihesaplama;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int birthYear, zodiacChinese;
        String animals;

        animals = "";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Dogum yilinizi giriniz: ");
        birthYear = scanner.nextInt();

        zodiacChinese = birthYear % 12;

        switch (zodiacChinese) {
            case 0:
                animals = "Maymun";
                break;
            case 1:
                animals = "Horoz";
                break;
            case 2:
                animals = "Kopek";
                break;
            case 3:
                animals = "Domuz";
                break;
            case 4:
                animals = "Fare";
                break;
            case 5:
                animals = "Okuz";
                break;
            case 6:
                animals = "Kaplan";
                break;
            case 7:
                animals = "Tavsan";
                break;
            case 8:
                animals = "Ejderha";
                break;
            case 9:
                animals = "Yilan";
                break;
            case 10:
                animals = "At";
                break;
            case 11:
                animals = "Koyun";
                break;
            default:
                System.out.println("Bu dunyadan degilsiniz...");
        }
        System.out.println("Cin Zodyagi Burcunuz: " + animals);
    }
}
