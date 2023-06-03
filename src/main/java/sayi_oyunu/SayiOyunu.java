package sayi_oyunu;

import java.util.Random;
import java.util.Scanner;

public class SayiOyunu {

    public static void main(String[] args) {
        start();
    }

    private static void cikisYap() {
        System.out.println("☺ tekrar calistiracaginiz gunu sabirsizlikla beliyorum ☺");
        cikisaGit();
    }

    private static void cikisaGit() {
    }

    private static void start() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomSayi = random.nextInt(100);
        //System.out.println(randomSayi);
        int puan = 100;
        int counter = 9;
        do {
            System.out.println("lutfen 1-100 arasinda bir sayi giriniz");
            int kullaniciSayi = scanner.nextInt();
            if (counter == 0) {
                System.out.println("Hakkınız bitti,oyunu kaybettiniz. bulunmasi gereken sayi (" + randomSayi + ")  Tekrar oynamak için 1'e ☺ , çıkmak için herhangi bir sayıya basın.");
                int sec = scanner.nextInt();
                if (sec == 1) {
                    start();
                    break;
                } else if (randomSayi > 1) {
                    cikisYap();
                    break;
                }
            } else if (randomSayi == kullaniciSayi) {
                System.out.println("Tebrikler ☺, puaniniz " + puan + ".  " + (10 - counter) + ". tahminde sayıyı buldunuz!♫♫♫ \nTekrar oynamak için 1'e, çıkmak için herhangi bir sayıya basın.");
                int sec = scanner.nextInt();
                if (sec == 1) {
                    start();
                    break;
                } else if (randomSayi > 1) {
                    cikisYap();
                    break;
                }
            } else if (randomSayi < kullaniciSayi) {
                System.out.println("Bilemediniz, tahmin için < " + counter + " > hakkınız kaldı! Daha <KUCUK> bir sayı giriniz:");
            } else if (counter == 0) {
            } else {
                System.out.println("Bilemediniz, tahmin için < " + counter + " > hakkınız kaldı! Daha <BUYUK> bir sayı giriniz:");
            }
            counter--;
            puan = puan - 10;
        } while (true);
        cikisaGit();
    }


}
