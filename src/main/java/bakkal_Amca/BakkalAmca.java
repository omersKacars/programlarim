package bakkal_Amca;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BakkalAmca {

    public static void main(String[] args) {
        //1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
        String gunler[] = {"Pazartesi", "Sali", "Carsamba", "Persembe", "Cuma", "Cumartesi", "Pazar"};

        //2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
        double gunlukKazanclar[] = new double[gunler.length];

        //3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları
        // tekek teker alıp gunlukKazanclar ArrayList'e ekle.
        Scanner input = new Scanner(System.in);
        DecimalFormat df =new DecimalFormat("0.00");
        int i = 0;
        System.out.println(" ☺ B ☺ A ☺ K ☺ K ☺ A ☺ L ☺ ☺ A ☺ M ☺ C ☺ A ☺ \n");
        while (i < gunler.length) {
            System.out.println(gunler[i] + " gunun hasilatini giriniz!!");
            gunlukKazanclar[i] = input.nextDouble();

            i++;
        }

        double ortalama = getOrtalamaKazanc(gunlukKazanclar);

        System.out.println("\nBakkal amcanin gunluk ortalama kazanci ==>\t" +"<"+ df.format(ortalama)+" TL>");

        System.out.println("\n ☺ ☺ ☺ ☺ ☺ ☺ ☺ ☺ ☺ ☺ ☺\n");

        String a[] = getOrtalamaninUstundeKazancGünleri(ortalama, gunlukKazanclar, gunler);
        System.out.println("☼ Bakkal Amcanin Ortalamanin ustu kazandigi gunler :\n");
        for (String w : a) {
            System.out.println(w);
        }
        System.out.println("\n ☺ ☺ ☺ ☺ ☺ ☺ ☺ ☺ ☺ ☺ ☺\n");
        String b[] = getOrtalamaninAltindaKazancGünleri(ortalama, gunlukKazanclar, gunler);

        System.out.println("☼ Bakkal Amcanin Ortalamanin alti kazandigi gunler :\n");
        for (String w : b) {
            System.out.println(w);
        }


    }

    //* 4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
    private static double getOrtalamaKazanc(double gunlukGelir[]) {
        double toplam = 0;
        for (double w : gunlukGelir) {

            toplam += w;


        }
        double ortalama = toplam / gunlukGelir.length;

        return ortalama;
    }

    //  5. Adım :   *getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
    //              *for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
    //		        *ortalama kazançtan yüksekse o günleri return yap.//gunluk kazanc ile ortalamayi karsilastir


    private static String[] getOrtalamaninUstundeKazancGünleri(double ortalamaKazanc, double[] gunlukKazanc, String[] gunler) {
        int counter = 0;
        for (int i = 0; i < gunler.length; i++) {
            if (gunlukKazanc[i] > ortalamaKazanc) {
                counter++;
            }
        }
        String ustGunler [] = new String[counter];
        int k = 0;
        int z = 0;
        for (String w : gunler) {

            if (gunlukKazanc[k] > ortalamaKazanc) {
                ustGunler[z] = w;
                z++;
            }
            k++;
        }
        return ustGunler;
    }

    //  6.  Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
    //      for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
    //	    ortalama kazançtan aşağıysa o günleri return yap.
//
    private static String[] getOrtalamaninAltindaKazancGünleri(double ortalamaKazanc, double[] gunlukKazanc, String[] gunler) {


        int counter = 0;
        for (int i = 0; i < 7; i++) {
            if (gunlukKazanc[i] < ortalamaKazanc) {                 //ortalamanin altinda kac adet eleman var onu buldurduk
                counter++;
            }
        }

        String[] altGunler = new String[counter];                   //ortalamanin altindaki elemanlar icin bi arrat list olusturduk ve counter'i eleman sayisi yaptik


        int k = 0;      //condition her dondugunde sayacak boylelikle her dondugunde gunluk kazanc arrayinin bie elemanini incelemis olacagiz
        int z = 0;      //ortalama kazanc gunluk kazanctan buyukse sayacak boylelikle her if icine girdiginde gune atama yapacak

        for (String w : gunler) {

            if (gunlukKazanc[k] < ortalamaKazanc) {
                altGunler[z] = w;
                z++;
            }
            k++;
        }
        return altGunler;
    }


}





