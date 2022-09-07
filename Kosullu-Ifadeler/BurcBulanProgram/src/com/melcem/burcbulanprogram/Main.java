package com.melcem.burcbulanprogram;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int day, month;
        String horoscope;
        horoscope = "";


        Scanner scanner = new Scanner(System.in);

        System.out.print("Dogdugunuz ayi giriniz: ");
        month = scanner.nextInt();

        System.out.print("Dogdugunuz gunu giriniz: ");
        day = scanner.nextInt();

        if(month >=1 && month <= 12) {
            if(day >= 1 && day <=31) {
                if(month == 1) {
                    if (day <= 21) {
                        horoscope = "Oglak";
                    } else {
                        horoscope = "Kova";
                    }
                } else if(month == 2) {
                    if (day <= 19) {
                        horoscope = "Kova";
                    } else {
                        horoscope = "Balik";
                    }
                } else if(month == 3) {
                    if (day <= 20) {
                        horoscope = "Balik";
                    } else {
                        horoscope = "Koc";
                    }
                } else if(month == 4) {
                    if (day <= 20) {
                        horoscope = "Koc";
                    } else {
                        horoscope = "Boga";
                    }
                } else if(month == 5) {
                    if (day <= 21) {
                        horoscope = "Boga";
                    } else {
                        horoscope = "Ikizler";
                    }
                } else if(month == 6) {
                    if (day <= 22) {
                        horoscope = "Ikizler";
                    } else {
                        horoscope = "Yengec";
                    }
                } else if(month == 7) {
                    if (day <= 22) {
                        horoscope = "Yengec";
                    } else {
                        horoscope = "Aslan";
                    }
                } else if(month == 8) {
                    if (day <= 22) {
                        horoscope = "Aslan";
                    } else {
                        horoscope = "Basak";
                    }
                } else if(month == 9) {
                    if (day <= 22) {
                        horoscope = "Basak";
                    } else {
                        horoscope = "Terazi";
                    }
                } else if(month == 10) {
                    if (day <= 22) {
                        horoscope = "Terazi";
                    } else {
                        horoscope = "Akrep";
                    }
                } else if(month == 11) {
                    if (day <= 21) {
                        horoscope = "Akrep";
                    } else {
                        horoscope = "Yay";
                    }
                } else {
                    if (day <= 21) {
                        horoscope = "Yay";
                    } else {
                        horoscope = "Oglak";
                    }
                }
            } else {
                System.out.println("Gun 1-31 arasi bir sayi olmali!!!");
            }
        } else {
            System.out.println("Ay; 1-12 arasi bir sayi olmali!!!");
        }

        System.out.println("Burcunuz: " + horoscope);
    }
}
