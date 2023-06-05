package birim_donusturucu;

import java.util.Scanner;

public class Converter {

    double mil;
    double km;

    double c;
    double f;

    double saat;
    double saniye;

    String secenek;

    public static void main(String[] args) {
        /*
        Mili km'ye, saniyeyi saate, fahrenhaytı santigrata çeviren bir dönüştürücü oluşturmak için
        kod yazınız. Google'dan dönüşümler için formülleri bulunuz.

        a) Kullanıcı mile değerini 10 ve operatorü mildenKmye olarak girdiğinde, konsolda kodu￾nuz "16 km" yazmalıdır (sayı dinamik olacak)

        b) Kullanıcı saniye değerini 7200 ve operatorü saniyedenSaate olarak girdiğinde, konsolda
        kodunuz "2" yazmalıdır (sayı dinamik olacak)

        c) Kullanıcı fahrenheit değerini 83 ve operatorü fahrenaytdanSantigarata olarak girdiğin￾de, konsolda kodunuz "28.3333 santigrat" yazmalıdır (sayı dinamik olacak)

         */
        Converter s = new Converter();
        s.start();


    }

    public void start() {
        System.out.println("converter programina hosgeldiniz\n" +
                "kmden mil icin-------------------------(1)\n" +
                "milden km icin-------------------------(2)\n" +
                "saniyeyi saate cevirmek icin-----------(3)\n" +
                "saati saniyeye cevirmek icin-----------(4)\n" +
                "fahrenhaytı santigrata cevirmek icin---(5)\n" +
                "santigrati fahrenhayta cevirmek icin---(6)\n ");


        Scanner scan = new Scanner(System.in);
        Converter s = new Converter();

        String secenek = scan.nextLine().toLowerCase().trim();

        switch (secenek) {
            case "1":
                System.out.println("lutfen km degeri giriniz");
                km = scan.nextDouble();
                convertKilometerToMile(km);
                break;

            case "2":
                System.out.println("lutfen mil degeri giriniz");
                mil = scan.nextDouble();
                convertMileToKilometer(mil);
                break;

            case "3":
                System.out.println("lutfen saniye degeri giriniz");
                saniye = scan.nextDouble();
                convertSecondToHour(saniye);
                break;
            case "4":
                System.out.println("lutfen saat degeri giriniz");
                saat = scan.nextDouble();
                convertHourToSecond(saat);
                break;
            case "5":
                System.out.println("lutfen santigrat degeri giriniz");
                c = scan.nextDouble();
                convertCelsiusToFahrenheit(c);
                break;

            case "6":
                System.out.println("lutfen fahrenhayta degeri giriniz");
                f = scan.nextDouble();
                convertFahrenheitToCelsius(f);
                break;

            default:
                System.out.println("uygun secenek giriniz");
                start();
        }


    }


    public double convertFahrenheitToCelsius(double f) {
        c = (f - 32) * 5 / 9;
        System.out.println(c);
        return c;

    }

    public double convertCelsiusToFahrenheit(double c) {
        f = (c * 9 / 5) + 32;
        System.out.println(f);
        return f;
    }

    public double convertMileToKilometer(double mil) {
        km = mil * 1.60934;
        System.out.println(km);
        return km;
    }

    public double convertKilometerToMile(double km) {
        mil = km / 1.60934;
        System.out.println(mil);
        return mil;
    }

    public double convertHourToSecond(double saat) {
        saniye = saat * 3600;
        System.out.println(saniye);
        return saniye;
    }

    public double convertSecondToHour(double saniye) {
        saat = saniye / 3600.0;
        System.out.println(saat);
        return saat;
    }


}
