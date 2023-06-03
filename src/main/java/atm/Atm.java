package atm;

import java.util.Scanner;

public class Atm {

    /* Q01
    Bakıye (başlangıç bakıyesi 1000 tl)
    öğrenme,
    para yatırma
    cekme,
    çıkış işlemlerinin yapıldıgı bir
    ATM app. method create ediniz
    */

    
    double bakiye = 1000;
    double para;
    int secim;
    Scanner input = new Scanner(System.in);


    public void bakiyeOgren() {
        System.out.println("bakiyeniz           : " + bakiye + " TL");
        anaMenuGit();

    }

    public void ilkGirisMesaji() {
        System.out.println("Bankamiza hosgeldiniz");


    }


    public void girisMesajiVer() {
        System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz:\n" +
                "Para yatırmak için        --------->     (1)\n" +
                "Para çekmek için          --------->     (2)\n" +
                "Bakiye sorgulamak için    --------->     (3)\n" +
                "Çıkış yapmak için         --------->     (4)");
    }

    public double paraYatir() {

        System.out.println("lutfen Yatirmak istediginiz tutari giriniz");

        para = input.nextDouble();

        bakiye = bakiye + para;
        anaMenuGit();
        return bakiye;

    }

    public double paraCek() {
        System.out.println("lutfen Cekmek istediginiz tutari giriniz");

        para = input.nextDouble();
        if (bakiye >= para) {
            bakiye = bakiye - para;
            anaMenuGit();

        } else {
            System.out.println("bakiyeniz yetersiz. Lutfen ayaginizi yorganiniza gore uzatiniz");
            anaMenuGit();
        }


        return bakiye;
    }


    public void cik() {
        System.out.println("Bizi tercih ettiğiniz için teşekkür ederiz. İyi günler!");
    }

    public void calistir() {
        girisMesajiVer();
        secim = input.nextInt();

        switch (secim) {
            case 1:
                paraYatir();

                break;
            case 2:
                paraCek();

                break;
            case 3:
                bakiyeOgren();

                break;
            case 4:
                cik();                                                                    //cikisi cagirdik
                break;
            default:                                                                            //tanimlanmayan deger icin
                System.out.println("Geçersiz seçenek!\n");
                calistir();
                //tekrar secim yapmaya dondurduk
                break;
        }

    }

    public void anaMenuGit() {
        System.out.println("cikis icin (1)\n" +
                "Ana menu icin (2)");
        secim = input.nextInt();

        if (secim == 1) {
            cik();
        } else if (secim == 2) {
            calistir();

        } else {
            System.out.println("suygun deger giriniz");
            anaMenuGit();
        }

    }


}
