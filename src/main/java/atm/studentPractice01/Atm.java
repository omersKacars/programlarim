package atm.studentPractice01;

import java.util.Scanner;

public class Atm {
    /* Q01
    Bakıye (başlangıç bakıyesi 1000 tl)
    öğrenme,
    para yatırma
    cekme,
    çıkış
    işlemlerinin yapıldıgı bir ATM app. method create ediniz.
    */
    double bakiye =1000;
    double para;
    int secenek;
    Scanner input =new Scanner(System.in);

    public void bakiyeOgren(){
        System.out.println("Bakiyeniz " +bakiye + " TL");
        start();

    }

    public double paraYatir(){
        System.out.println("lutfen yatirmak istediginiz miktari giriniz..");
        para =input.nextDouble();
        bakiye = bakiye + para;
        start();
        return bakiye;
    }

    public double paraCek(){
        System.out.println("lutfen cekmek istediginiz miktari giriniz..");

        para =input.nextDouble();
        if(bakiye>=para){
            bakiye =bakiye-para;
            start();
        } else {
            System.out.println("bakiyeniz yetersiz. lutfen ");
            start();
        }

        return bakiye;
    }

    public void cikisYap(){
        System.out.println("bizi tercih ettiginiz icin tesekkur ederiz");
    }

    public void start(){
        System.out.println("lutfen yapmak istediginiz islemi seciniz\n" +
                "Para cekmek icin           1\n" +
                "Para yatirmak icin         2\n" +
                "bakiye ogrenmek icin       3\n" +
                "Cikis yapmak icin          4");

        secenek =input.nextInt();
        switch (secenek){
            case 1:
                paraCek();
                break;
            case 2:
                paraYatir();
                break;
            case 3:
                bakiyeOgren();
                break;
            case 4:
                cikisYap();
                break;
            default:
                System.out.println("hatali tuslama... Lutfen tekrar deneyiniz");
                start();

        }

    }






}
