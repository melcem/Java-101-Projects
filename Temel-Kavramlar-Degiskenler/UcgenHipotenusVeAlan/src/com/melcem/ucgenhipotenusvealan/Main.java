package com.melcem.ucgenhipotenusvealan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double dikKenarA,dikKenarB,hipotenus,cevreUcgen,alanUcgen,u;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lutfen a dik kenarini giriniz :");
        dikKenarA = scanner.nextDouble();

        System.out.print("Lutfen b dik kenarini giriniz :");
        dikKenarB = scanner.nextDouble();

        hipotenus = Math.sqrt((dikKenarA * dikKenarA) + (dikKenarB * dikKenarB));
        System.out.println("Dik ucgenin hipotenusu: " + hipotenus);

        u = (dikKenarA + dikKenarB + hipotenus)/2;
        cevreUcgen = 2 * u;

        alanUcgen = Math.sqrt(u * (u - dikKenarA) * (u - dikKenarB) * (u - hipotenus));

        System.out.println("Ucgenin alani: " + alanUcgen);
    }
}
