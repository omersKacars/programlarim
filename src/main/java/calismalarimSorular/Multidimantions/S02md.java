package calismalarimSorular.Multidimantions;

import java.util.Arrays;
import java.util.Scanner;

public class S02md {
    //Kullanıcıdan bir array (dizi) boyutu girmesini isteyin.
//array (dizi) boyutunu kullanarak bir array (dizi) oluşturun.
//Kullanıcıdan array (dizi) elemanlarını girmesini isteyin.
//array (dizi) içindeki en büyük ve en küçük sayıları bulun
//en büyük ve en küçük sayılarının toplamını dizideki tek eleman sayısına bölün

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("eleman sayisini giriniz");

        int elemanSayisi = scan.nextInt();

        int tekArray[] = new int[elemanSayisi];
        int i = 0;
        for (int w : tekArray) {

            System.out.println("sayi giriniz");
            w = scan.nextInt();
            tekArray[i] = w;        //array'a atadik.
            i++;
        }

        System.out.println(Arrays.toString(tekArray));

        Arrays.sort(tekArray);
        int min = tekArray[0];
        int max = tekArray[tekArray.length - 1];

        int toplam = min + max;
        int counter = 0;
        for (int w : tekArray) {

            if (w % 2 == 0) {
                counter++;
            }

        }

        System.out.println("tek sayi adedi                  ==> " + counter);
        System.out.println("Girilen Sayilarin En Kucugu     ==> " + min);
        System.out.println("Girilen Sayilarin En Kucugu     ==> " + max);


        int result = toplam / counter;
        System.out.println("en kucuk sayi + en buyuk sayi   ==> " + "/" + counter + " " + result);


    }


}



