package calismalarimSorular.Multidimantions;

import java.util.Arrays;
import java.util.Scanner;

public class MultidimantionArrays {

    /*
    //Soru: Bir çok boyutlu dizideki(Multidimensional Array ) elemanları toplayan ve bu toplamı return eden bir Metod yazmak istiyoruz.

        // Program, kullanıcıdan bir çok boyutlu dizinin boyutunu ve elemanlarını girmesini isteyecek.
        // Ardından, dizideki tüm elemanları toplayacak ve bu toplamı ekrana yazdıracaktır. Nasıl bir çözüm önerirsiniz?

     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("arrray dis eleman sayisini giriniz");
        int arrDisElemanSayisi = scan.nextInt();

        System.out.println("arrray icindeki array olan eleman sayisini giriniz");

        int arrIcElemanSayisi = scan.nextInt();
        int[][] md = new int[arrDisElemanSayisi][arrIcElemanSayisi];

        for (int i = 0; i < arrDisElemanSayisi; i++) {

            for (int j = 0; j < arrIcElemanSayisi; j++) {

                System.out.println("dis arrayin " + i + ". elemanina ==> ic arrayin " + j + ". elamanini giriniz");
                int sayi = scan.nextInt();
                md [i][j] =sayi;
            }
        }
        System.out.println(Arrays.deepToString(md));


       int result = multiDemantionArrayleriTopla(md);
        System.out.println(result);


    }

    private static int multiDemantionArrayleriTopla(int arr[][]) {
        int toplam = 0;
        for (int[] w : arr) {

            for (int k : w) {
                toplam += k;


            }


        }
        return toplam;
    }



}
