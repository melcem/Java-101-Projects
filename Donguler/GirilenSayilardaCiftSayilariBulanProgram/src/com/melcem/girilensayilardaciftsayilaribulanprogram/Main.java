package com.melcem.girilensayilardaciftsayilaribulanprogram;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int k,sum,count;
        double average;

        sum = 0;
        count = -1;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sayi Giriniz: ");
        k = scanner.nextInt();

        /*
        for(int i=1; i<=k; i++) {
            if(i%2==0) {
                System.out.println(i);
            }
        }*/
        for(int i=0; i<=k; i++) {
            if(i%3==0 && i%4==0) {
                sum += i;
                count++;
            }
        }
        average = sum/count;
        System.out.println("Ortalama: " + average);
    }
}
