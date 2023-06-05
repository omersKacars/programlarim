package kelime_oyunu;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class KelimeOyunuEmreHoca {
    public static void main(String[] args) {
        String kelimeler[] = {"Elma", "Armut", "Ayva", "Kiraaz", "Kaarpuz"};

        Scanner input = new Scanner(System.in);
        Random rnd = new Random();

        int kacinciKelime = rnd.nextInt(kelimeler.length);//Rastgele bir kelime secmek icin

        // Random class'indan vereb. olusturdum

        String kelimemiz = kelimeler[kacinciKelime].toLowerCase();//Rastgele sectigim kelimeyi kucuk harfe cevirdim

        String ArrKelime[] = kelimemiz.split("");//Kelimeyi Array yaptim hiclikten boldum

        String Kontrol[] = new String[ArrKelime.length];//ArrKelime[] ile ayni uzunlukta Array tanimladim

        for (int i = 0; i < Kontrol.length; i++) {
            Kontrol[i] = "-";                            //bu Arraye uzunlugu kadar '-' yazdirdim
        }

        System.out.println(Arrays.toString(Kontrol)); // [-, -, -, -, -, -] Bunu donut olarak musteriye verdik

        System.out.println("Bu bir meyve Hadi tahmin et");

        int kalanHak = 5;

        while (kalanHak > 0) {

            System.out.print("Lutfen Bir harf giriniz :");

            String tahmin = input.next();

            int counter = 0;//lazim olacak bir tamsayi tanimladim

            for (int i = 0; i < ArrKelime.length; i++) {

                if (ArrKelime[i].equals(tahmin)) { //bildigi harfleri bulmak icin dongu olusturdum

                    Kontrol[i] = tahmin;    // bildigi harfi hangi indexte ise ona yerlestirsin istedim

                    //Orn. 2 tane harf varsa onu da yerlestirsin
                    counter++;//bilirse ve bilemezse ayrimini yapmak icin sayac koydum
                }
            }
            System.out.println(Arrays.toString(Kontrol));// Yerlesen kelimeleri yerlestirdim
            boolean isEqual = Arrays.equals(Kontrol, ArrKelime);//ilk kelime ile son kelimeyi karsilastiriyor
            if (isEqual) {                       //Dogru ise uygun mesaj versin istedim
                System.out.println("Tebrikler Oyunu kazandiniz");
                break;
            }
            System.out.println(Arrays.toString(Kontrol));
            if (counter == 0) { //Harfi bilememis ise dogru mesaji versin
                kalanHak--;// while dongusundeki kalan hakki bilemedikce azalsin istedim
                System.out.println("Yanlis Secim yaptiniz. Kalan Hakkiniz = " + kalanHak);
            } else {
                System.out.println("Bildiniz " + counter + " tane yerde " + tahmin + " var");
            }
        }
        if (kalanHak == 0) {
            System.out.println("Kaybettiniz");
            System.out.println("Dogru kelime :" + kelimemiz);
        }
    }
}
