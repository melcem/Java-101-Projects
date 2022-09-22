import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password;
        int choose,price;
        int right = 3;
        int balance = 1500;

        Scanner scanner = new Scanner(System.in);

        while (right > 0) {
            System.out.print("Kullanici adini giriniz: ");
            userName = scanner.nextLine();

            System.out.print("Parola giriniz: ");
            password = scanner.nextLine();

            if(userName.equals("patika") && (password.equals("dev123"))) {
                System.out.println("Sisteme giris yaptiniz...");

                do {
                    System.out.println("1- Para Cekme\n" +
                            "2- Para Yatirma\n" +
                            "3- Bakiye sorma\n" +
                            "4- Cikis yap");
                    System.out.print("Yapmak istediginiz islemi seciniz: ");
                    choose = scanner.nextInt();
                    /*if (choose == 1) {
                        System.out.print("Cekmek istediginiz tutari giriniz: ");
                        int price = scanner.nextInt();
                        if(price > 0 && price <= balance) {
                            balance -= price;
                        } else {
                            System.out.println("Bakiyeniz yetersiz!!!");
                        }
                    } else if(choose == 2) {
                        System.out.print("Yatirilacak miktari giriniz: ");
                        int price = scanner.nextInt();
                        balance += price;
                    } else if(choose == 3) {
                        System.out.println("Bakiyeniz: " + balance);
                    }*/

                    switch (choose) {
                        case 1:
                            System.out.print("Cekmek istediginiz tutari giriniz: ");
                            price = scanner.nextInt();
                            if(price > 0 && price <= balance) {
                                balance -= price;
                            } else {
                                System.out.println("Bakiyeniz yetersiz!!!");
                            }
                            break;

                        case 2:
                            System.out.print("Yatirilacak miktari giriniz: ");
                            price = scanner.nextInt();
                            balance += price;
                            break;
                        case 3:
                            System.out.println("Bakiyeniz: " + balance);
                            break;
                    }
                } while (choose != 4);
                System.out.println("Iyi gunler...");
                break;

            } else {
                right--;
                if(right!=0) {
                    System.out.println("Kullanici adi veya sifre hatali, tekrar deneyiniz!");
                    System.out.println("Kalan hakkiniz: " + right);
                } else {
                    System.out.println("Hesabiniz bloke oldu, bankaniz ile iletisime geciniz!!!");
                }
            }
        }
    }
}
