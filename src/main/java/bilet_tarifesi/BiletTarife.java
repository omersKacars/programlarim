package bilet_tarifesi;

import java.util.Scanner;

public class BiletTarife {
    /*
     /*
   A şehrinden uçmak isteyen bir yolcu B şehrine 500km C şehrine  700km  D şehrine  900 km mesafededir.
   Bilet tarifesi:
   km birim fiyati : 0.10$
   yolcu 12 yasindan kucukse toplam fiyat %50 indirim,
   12 ve 24 yas arasindaysa 10% indirim,
   65 yasindan buyukse 30% indirim,
   bilet gidis donus alinirrsa 20% indirim uygulayan bi app create ediniz
*/

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Adin ne bakayim senin?");
        String name = scan.nextLine();

        System.out.print("Yolculuk nereye " + name + " ????☺\nbizde 3 secenek var. Su anda a noktasindasin..\n♠a--->b\t(1)\n♠a--->c\t(2)\n♠a--->d\t(3)\ngitmek icin giris yap...\nEnter :");

        System.out.println();
        int sehir = scan.nextInt();


        System.out.print("donus bileti de satin alcak misin " + name + "? \n♠(1)\tevet\n♠(2)\thayir\nEnter ");
        int yolculukTipi = scan.nextInt();
        System.out.println();

        sehirVeYolculukTipiSec(sehir, yolculukTipi);
        double yolculukTutari = sehirVeYolculukTipiSec(sehir, yolculukTipi);

        System.out.println("Mutevellit kac?? De bakayim bana???");
        int yas = scan.nextInt();

        yasaGoreHesapYap(yas, yolculukTutari);
        double yasIndirimliYolculukTutari = yasaGoreHesapYap(yas, yolculukTutari);

        if (yolculukTipi == 1) {
            double result = yasIndirimliYolculukTutari;
            System.out.println(name + " kardesim.. Odemen gereken tutar ==>" + result + " $'dir. gidis-donus biletin hayirli olsun.. ☺ Hayirli yolculuk...");
        } else {
            double result = yasIndirimliYolculukTutari;
            System.out.println(name + " kardesim.. Odemen gereken tutar ==>" + result + " $'dir. tek yon binmen uzdu.. ☺ Hayirli yolculuk...");

        }


    }

    private static double sehirVeYolculukTipiSec(int sehir, int yolculukTipi) {
        Scanner scanner = new Scanner(System.in);

        double kmYeGoreFiyat = 0;
        double price = 0.10;
        switch (sehir) {

            case 1:
                kmYeGoreFiyat = 500 * price;
                break;

            case 2:
                kmYeGoreFiyat = 700 * price;
                break;

            case 3:
                kmYeGoreFiyat = 900 * price;
                break;

            default:
                System.out.println("yanlis giris takrar sec");
                sehirVeYolculukTipiSec(sehir, yolculukTipi);         //??????

        }
        if (yolculukTipi == 1) {
            kmYeGoreFiyat = kmYeGoreFiyat;

        } else if (yolculukTipi == 2) {
            kmYeGoreFiyat = kmYeGoreFiyat * 2 * (1 - 0.2);
        }
        return kmYeGoreFiyat;
    }

    private static double yasaGoreHesapYap(int yas, double yolculukTutari) {
        double result = 0;
        double indirim1 = 0.5;
        double indirim2 = 0.1;
        double indirim3 = 0.3;

        if (yas < 0) {
            System.out.println(" DALGA GECME BENIMLE!!! ");


        } else if (yas <= 12) {
            result = yolculukTutari * (1 - indirim1);

        } else if (yas > 13 && yas <= 24) {
            result = yolculukTutari * (1 - indirim2);

        } else if (yas >= 65) {
            result = yolculukTutari * (1 - indirim3);
        } else {
            result = yolculukTutari;
        }

        return result;
    }


}
