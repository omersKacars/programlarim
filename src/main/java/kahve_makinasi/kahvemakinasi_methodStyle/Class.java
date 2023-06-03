package kahve_makinasi.kahvemakinasi_methodStyle;

import java.util.Scanner;

public class Class {

    static Scanner scan = new Scanner(System.in);
    static String hangiKahve;
    static String sut;
    static int sekerSayisi;
    static String boyutTipi;
    int a;


    public static void main(String[] args) {



       kahve();
       sutluMu();
       sekerliMi();
       boyut();
       sonMesaj();


    }



    static void kahve() {
        do {
            System.out.println("Hangi Kahveyi istersiniz?\n1.Türk kahvesi  \n2.Filtre Kahve  \n3.Espresso");
            hangiKahve = scan.nextLine().toLowerCase().replaceAll("\\s", "");

            switch (hangiKahve) {
                case "turkkahvesi":

                    System.out.println("Turk kahvesi hazırlanıyor...");
                    return;
                case "filtrekahve":
                    System.out.println("filtre kahve hazrilaniyor...");
                    return;
                case "expresso":
                    System.out.println("Expresso hazirlaniyor...");
                    break;
                default:
                    System.out.println("hatali tuslama yaptiniz\nlutfen tekrar giris yapiniz");
                    kahve();

            }
        } while (true);
    }

    static void sutluMu() {
        System.out.println("Süt eklememizi ister misiniz? (Evet veya Hayır olarak cevaplayınız):");

        sut = scan.nextLine().toLowerCase().replaceAll("\\s", "");

        if (sut.equals("evet")) {
            System.out.println("sut ekleniyor...");
        } else {
            System.out.println("sut eklenmiyor");
            sutluMu();
        }

    }

    static int sekerliMi() {
        System.out.println("Şeker ister misiniz ? (Evet veya hayır cevabını veriniz) : ");
        String sekerliMi = scan.nextLine().toLowerCase().replaceAll("\\s", "");


        switch (sekerliMi) {
            case "evet":
                System.out.println("lutfen seker sayisi giriniz");
                sekerSayisi = scan.nextInt();
                break;
            case "hayir":
                System.out.println("seker eklenmiyor");
                break;
            default:
                System.out.println("lutfen uygun deger giriniz");
                sekerliMi();
        }return sekerSayisi;

    }

    static void boyut(){
        System.out.println("Hangi boyutta olsun? (Büyük boy - orta boy - küçük boy olarak giriniz.) ");
        scan.nextLine();
        boyutTipi = scan.nextLine().toLowerCase().replaceAll("\\s", "");

        if (boyutTipi.equals("buyukboy")) {
            System.out.println(hangiKahve + " buyuk boy olarak hazirlaniyor");

        } else if (boyutTipi.equals("ortaboy")) {
            System.out.println(hangiKahve + " orta boy olarak hazirlaniyor");

        } else if (boyutTipi.equals("kucukboy")){
            System.out.println(hangiKahve + " kucuk boy olarak hazirlaniyor");
        }else {
            System.out.println("lutfen uygun deger giriniz");
        }

    }

    static void sonMesaj(){
        System.out.println(hangiKahve+"niz" + boyutTipi + " olarak hazir. afiyet olsun..");
    }

}























