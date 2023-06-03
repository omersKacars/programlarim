package kahve_makinasi.kahveMakinasi_ifelseStyle;

import java.util.Scanner;

public class Runner {


    public static void main(String[] args) {

        long startTime = System.nanoTime(); // Başlangıç zamanını kaydet

        Scanner scan = new Scanner(System.in);

        System.out.println("hangi kahveyi istersiniz\n1.Türk kahvesi\n2.Filtre Kahve\n3.Espresso");

        String hangiKahve = scan.nextLine();

        hangiKahve = hangiKahve.toLowerCase().replaceAll("\\s", "");


        if (hangiKahve.equals("turkkahvesi")) {
            System.out.println(" Tuk Kahveniz hazirlaniyor...");
        } else if (hangiKahve.equals("filtrekahve")) {
            System.out.println(" filitre kahveniz hazirlaniyor...");
        } else if (hangiKahve.equals("expresso")) {
            System.out.println(" expressonuz hazirlaniyor...");
        }


        System.out.println("Süt eklememizi ister misiniz ? (Evet veya Hayır olarak cevaplayınız):   ");
        String sut = scan.nextLine();

        sut = sut.toLowerCase().replaceAll("\\s", "");

        if (sut.equals("evet")) {
            System.out.println("Süt ekleniyor...");
        } else {
            System.out.println("Süt eklenmiyor");
        }

        System.out.println("Şeker ister misiniz ? (Evet veya hayır cevabını veriniz) : ");
        String seker = scan.nextLine();

        seker = seker.toLowerCase();

        if (seker.equals("evet")) {

            System.out.println("Kac seker olsun");
            int kacSeker = scan.nextInt();
            String bosKod = scan.nextLine();


            System.out.println(kacSeker + " seker ekleniyor...");

        } else {
            System.out.println("Şeker eklenmiyor");
        }

        System.out.println("Hangi boyutta olsun? (Büyük boy - orta boy - küçük boy olarak giriniz.");

        String boyut = scan.nextLine().toLowerCase().replaceAll("\\s", "");

        if (boyut.equals("buyukboy")) {
            System.out.println(hangiKahve + "niz " + boyut + "boy hazirlaniyor");

        } else if (boyut.equals("ortaboy")) {
            System.out.println(hangiKahve + "niz " + boyut + "boy hazirlaniyor");

        } else if (boyut.equals("kucukboy")) {
            System.out.println(hangiKahve + "niz " + boyut + "boy hazirlaniyor");
        }

        System.out.println(hangiKahve + " " + boyut + " olarak hazirdir... Afiyet olsun.. :)");

        long endTime = System.nanoTime(); // Bitiş zamanını kaydet
        long totalTime = endTime - startTime; // Toplam süreyi hesapla (nanosaniye cinsinden)

        double seconds = (double) totalTime / 1_000_000_000.0; // Saniye cinsine dönüştür

        System.out.println("Programın çalışma süresi: " + seconds + " saniye.");

    }
}
