package com.melcem.ucakbiletifiyatihesaplama;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       int km, age, typeFlight;
       double amount,ageDiscount, rateAgeDiscount, ageDiscountAmount, rateRoundTripDiscount,
               roundTripDiscount, roundTripDiscountAmount;

       rateRoundTripDiscount = 0.20;

       Scanner scanner = new Scanner(System.in);

       System.out.print("Mesafe giriniz(km): ");
       km = scanner.nextInt();

       System.out.print("Yasinizi giriniz: ");
       age = scanner.nextInt();

       System.out.print("Yolculuk tipi giriniz(1 => Tek Yon, 2 => Gidis Donus): ");
       typeFlight = scanner.nextInt();

       if((km > 0 && age > 0) && (typeFlight == 1 || typeFlight == 2)) {
           amount = km * 0.10;

           if(age < 12) {
               rateAgeDiscount = 0.50;
               ageDiscount = amount * rateAgeDiscount;
               ageDiscountAmount = amount - ageDiscount;

               if(typeFlight == 1) {
                   System.out.println("Toplam Tutar: " + ageDiscountAmount);
               } else {
                   roundTripDiscount = ageDiscountAmount * rateRoundTripDiscount;
                   roundTripDiscountAmount = ageDiscountAmount - roundTripDiscount;
                   System.out.println("Toplam Tutar: " + roundTripDiscountAmount*2);
               }
           } else if(age >= 12 && age <= 24) {

               rateAgeDiscount = 0.10;
               ageDiscount = amount * rateAgeDiscount;
               ageDiscountAmount = amount - ageDiscount;

               if(typeFlight == 1) {
                   System.out.println("Toplam Tutar: " + ageDiscountAmount);
               } else {
                   roundTripDiscount = ageDiscountAmount * rateRoundTripDiscount;
                   roundTripDiscountAmount = ageDiscountAmount - roundTripDiscount;
                   System.out.println("Toplam Tutar: " + roundTripDiscountAmount*2);
               }
           } else if(age > 65 ) {
               rateAgeDiscount = 0.30;
               ageDiscount = amount * rateAgeDiscount;
               ageDiscountAmount = amount - ageDiscount;

               if (typeFlight == 1) {
                   System.out.println("Toplam Tutar: " + ageDiscountAmount);
               } else {
                   roundTripDiscount = ageDiscountAmount * rateRoundTripDiscount;
                   roundTripDiscountAmount = ageDiscountAmount - roundTripDiscount;
                   System.out.println("Toplam Tutar: " + roundTripDiscountAmount*2);
               }
           } else {
               if (typeFlight == 1) {
                   System.out.println("Toplam Tutar: " + amount);
               } else {
                   roundTripDiscount = amount * rateRoundTripDiscount;
                   roundTripDiscountAmount = amount - roundTripDiscount;
                   System.out.println("Toplam Tutar: " + roundTripDiscountAmount*2);
               }
           }

       } else {
           System.out.println("Hatali Veri Girdiniz!");
       }

    }
}
