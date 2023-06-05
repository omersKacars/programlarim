package kelimeTahminOyunu;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class KelimeTahminOyunu {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String words[] = {"cilek", "kavun", "karpuz", "havuc", "erik"};               // 5 kelimeden olusan array olusturduk
        int wordsLenght = words.length;

        Random random = new Random();                                               //random bir array elemani alabilmek icin random clasini kullanarak random bir sayi istedim
        int tahmin = random.nextInt(words.length);                                 //arrayimizin eleman sayisi kadar sayi arasinda tahmin etmesini sagladik

        //System.out.println(words[tahmin]);                                      //kullanicinin bulunmasi gereken kelime.


        String altTireliArr[] = new String[words[tahmin].length()];             // alt tire array'i olusturduk / tahmin edilen random string'in uzunlugu kadar eleman atadik

        Arrays.fill(altTireliArr, "_");                                    //array icine "_" doldurduk.

        System.out.println(Arrays.toString(altTireliArr));
        int counter = 4;                                                            //bu sayac kalan hak icin olusturuldu
        int hak = 5;                                                               //tskde varilen 5 hakki atadik
        for (int i = 1; i <= hak; i++) {                                          //butun islemler bu dongu icerisinde yapildi. //hak:
            System.out.println("bir harf giriniz");
            String ch = input.next().toLowerCase().substring(0, 1);             //kullanicidan String tipinde bir karakter aldik.

            if (i != hak) {                                                   //kullanici dogru girdiginde loop azalmasin diye hak'ki arttirdigimizdan bu sekilde bi
                                                                             // condition olusturduk 31.satir 27.satir ve  36 satir birbiriyle iliskili..

                if (words[tahmin].contains(ch)) {                                    //kullanicinin girdigi karakterin olup olmadigini kontrol ettik
                    System.out.println("☺ <_bir harf buldunuz_> ☺");               //mesaj verdik
                    int bulunduguIdx = words[tahmin].indexOf(ch);                  //words[tahmin] ==> kullanicinin  char'in indexini aldik "bulunduguIdx" variablena assing ettik
                    hak++;                                                        //"hak" olarak tanimladigimiz degisken oyun kurali geregi dogru bilinmesi durumunda bir
                                                                                 // arttirilarak loopun uzatilmasi dolayisiyla kullanim hakkinin dusmesi engellendi

                    altTireliArr[bulunduguIdx] = ch;                           //alt tireli array icine kullanicinin verdigi dogru degeri assing ettik

                    System.out.println(Arrays.toString(altTireliArr));       //kullanici girdigi dogru harfi her defasinda bu sekilde gorebilecek [a, _, _, _, _]

                    if (Arrays.equals(words[tahmin].split(""), altTireliArr)) {                 //Arrays.equals methoduyla <(words[tahmin].split("")> array listi ile  <altTireliArr> 'i her defasinda kontrol ettirdik
                        System.out.println("☺ ☺ TEBRIKLER ☺ ☺  Kelimenin tamamini buldunuz!!");   //kazandiniz mesaji verdik
                        break;                                                                      //condition calisirsa komple cikar
                    }

                } else {
                    counter--;                                                        //kalan hak sayisi dusuruldu
                    System.out.println("♠ girilen harf yok. ♠");                     //mesaj verildi
                }

                System.out.println("kalan hakkiniz < " + (counter + 1) + " >");    // kullanicinin her defasinda kalan hakki

            } else {
                System.out.println("hakkiniz bitti byes ☺");
            }
        }

        int puan = 100 - (5 - (counter + 1)) * 100 / 5;                       //puanlama yaptirdik..
        if (puan > 20) {
            System.out.println("Puaniniz = " + puan);
        } else System.out.println("Puaniniz = 0 yaziklar olsun");


    }


}








