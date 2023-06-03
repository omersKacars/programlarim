package kelimeTahminOyunu;

import java.util.Arrays;
import java.util.Random;

public class KelimeTahminOyunu {

    public static void main(String[] args) {

        String words[] = {"elma", "armut", "cilek", "muz", "karpuz"};
        int wordsLenght = words.length;

        //random bir array elemani alabilmek icin randim clasini kullanarak random bir sayi istedim
        Random random = new Random();
        int rastgeleIndex = random.nextInt(4);

        System.out.println(words[rastgeleIndex]);       //kullanicinin bulunmasi gereken kelime.


        // alt tire array'i.
        String altTireArr[] = new String [words[rastgeleIndex].length()];

        Arrays.fill(altTireArr, "_");

        //kelime arrayi

        String kelimeArr[] =new String[words[rastgeleIndex].length()];

        int i =0;

        for (String w :kelimeArr){
            String kelimeChar = words[rastgeleIndex].substring(i,i+1);           //kelimenin 1 chari
            System.out.print( " "+ kelimeChar);
            w+=kelimeChar;                                               //her dongude arr icine 1 harf yazdircam

            i++;
        }

        System.out.println(Arrays.toString(kelimeArr));


    }

}


