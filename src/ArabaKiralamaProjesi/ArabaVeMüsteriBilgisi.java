

package ArabaKiralamaProjesi;

import ArabaKiralamaProjesi.AracIsteme;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArabaVeMüsteriBilgisi extends AracIsteme {

    static List<AracIsteme> aracTalepListesi = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);
    static int kiralanacakGünSayisi;


    public static void aracTalepEt() {
        // aracTalep(){} ---> Kadir + Berk
        System.out.println("Lutfen araci alacaginiz sehri giriniz:");
        Scanner scan = null;
        String sehir = scan.nextLine();
        System.out.println("Lutfen teslim alacaginiz gunu giriniz: (Ornek: 12.04)");// ay ve gunu ayirmak mi yoksa string almak mi?
        String alisGunu = scan.next();
        System.out.println("Lutfen teslim alacaginiz saati giriniz: (Ornek: 15.00)");
        double alisSaati = scan.nextDouble();
        System.out.println("Lutfen teslim edeceginiz gunu giriniz: (Ornek: 12.04)");
        String teslimGunu = scan.next();
        System.out.println("Lutfen teslim edeceginiz saati giriniz: (Ornek: 15.00)");
        double teslimSaati = scan.nextDouble();

        System.out.println("****************************");
        String aGun = alisGunu.substring(0, 2);
        int intAGun = Integer.parseInt(aGun);
        String aAy = alisGunu.substring(3);
        int intAAy = Integer.parseInt(aAy);
        System.out.println("Alis tarihi : " + intAGun + "." + intAAy);

        String tGun = alisGunu.substring(0, 2);
        int intTGun = Integer.parseInt(tGun);
        String TAy = alisGunu.substring(3);
        int intTAy = Integer.parseInt(TAy);
        System.out.println("Teslim tarihi : " + intTGun + "." + intTAy);

        if (intAAy > intTAy) {
            System.out.println("Araci aldiginiz gün teslim edeceginiz günden sonra olamaz");
            aracTalepEt();
        } else if (intAGun > intTGun) {
            System.out.println("Araci aldiginiz gün teslim edeceginiz günden sonra olamaz");
            aracTalepEt();
        } else System.out.println("Hatali giris yaptiniz.");

        kiralanacakGünSayisi = (intTAy - intAAy) * 30 + (intTGun - intAGun);
        System.out.println("Arac toplam " + kiralanacakGünSayisi + " gün kiralanmistir.");
        System.out.println("****************************");


    }


    public static void getAraba(String marka, String model, String yakitTürü, String vites, Integer günlükKiralamaÜcreti) {

    }


    public static void arabaÖzellikleri() {

        //arabalar(){}  ---> Meryem + Fikriye
        //yakit arti gunluk kiralalma ucreti ekleyebiliriz, kilometre basina

        AracIsteme volvoDizelOtomatik = new AracIsteme("Volvo", "S6O", "Dizel", "Otomatik", 50);
        AracIsteme volvoDizelManuel = new AracIsteme("Volvo", "S6O", "Dizel", "Manuel", 45);
        AracIsteme volvoBenzinOtomatik = new AracIsteme("Volvo", "S60", "Benzin", "Otomatik", 65);
        AracIsteme volvoBenzinManuel = new AracIsteme("Volvo", "S6O", "Benzin", "Manuel", 45);
        AracIsteme mercedesBenzinOtomatik = new AracIsteme("Mercedes", "A180", "Benzin", "Otomatik", 80);
        AracIsteme mercedesBenzinManuel = new AracIsteme("Mercedes", "A180", "Benzin", "Manuel", 70);
        AracIsteme mercedesDizelOtomatik = new AracIsteme("Mercedes", "Benz", "Dizel", "Otomatik", 80);
        AracIsteme mercedesDizelManuel = new AracIsteme("Mercedes", "Benz", "Dizel", "Manuel", 70);
        AracIsteme teslaXElektrikli = new AracIsteme("Tesla", "X", "Elektrikli", "Manuel", 100);
        AracIsteme teslaSElektrikli = new AracIsteme("Tesla", "S", "Elektrikli", "Manuel", 100);
        AracIsteme teslaYElektrikli = new AracIsteme("Tesla", "Y", "Elektrikli", "Otomatik", 100);
        AracIsteme teslaCElektrikli = new AracIsteme("Tesla", "C", "Elektrikli", "Otomatik", 100);


        //Yukaridaki arabalari olusturdugumuz arac list'ine ekliyoruz
        aracTalepListesi.add(volvoDizelOtomatik);
        aracTalepListesi.add(volvoDizelManuel);
        aracTalepListesi.add(volvoBenzinOtomatik);
        aracTalepListesi.add(volvoBenzinManuel);
        aracTalepListesi.add(mercedesBenzinOtomatik);
        aracTalepListesi.add(mercedesBenzinManuel);
        aracTalepListesi.add(mercedesDizelOtomatik);
        aracTalepListesi.add(mercedesDizelManuel);
        aracTalepListesi.add(teslaXElektrikli);
        aracTalepListesi.add(teslaSElektrikli);
        aracTalepListesi.add(teslaYElektrikli);
        aracTalepListesi.add(teslaCElektrikli);

        System.out.println("*****Arac Talep Secimi****" + "\nLutfen talep ettiginiz arac icin secim yapin " +
                "\nVolvo Dizel Otomatik icin : 1" + "\nVolvo Dizel Manuel icin : 2" + "\n Volvo Benzin Otomatik icin : 3" +
                "\nVolvo Benzin Manuel icin : 4" + "\nMercedes Benzin Otomatik  icin: 5" +
                " \nMercedes Benzin Manuel icin : 6" + " \nMercedes Dizel Otomatik icin : 7" +
                " \nMercedes Dizel Manuel icin : 8" + "\nTesla X Elektrikli icin : 9" +
                "\nTesla S Elektrikli icin : 10" + "\nTesla Y Elektrikli icin : 11" + "\nTesla C Elektrikli icin : 12'yi secin");
        int secim = scan.nextInt();


        //String alinacakSehir, String alinacakGün, double alisSaati, String teslimGünü, double teslimSaati)
        switch (secim) {
            case 1:
                getAraba("Volvo", "S60", "Dizel", "otomatik", 50);
                int odenecekMiktar1=kiralanacakGünSayisi*50;
                System.out.println("odenecekMiktar = " + odenecekMiktar1);
                islemeDevamEtmeDöngüsü();
                //odenecek tutar hesaplanıp sout ile musteriye bildirilecek
                break;
            case 2:
                getAraba("Volvo", "S6O", "Dizel", "Manuel", 45);
                int odenecekMiktar2=kiralanacakGünSayisi*45;
                System.out.println("odenecekMiktar = " + odenecekMiktar2);
                islemeDevamEtmeDöngüsü();
                break;
            case 3:
                getAraba("Volvo", "S60", "Benzin", "Otomatik", 65);
                int odenecekMiktar3=kiralanacakGünSayisi*65;
                System.out.println("odenecekMiktar = " + odenecekMiktar3);
                islemeDevamEtmeDöngüsü();
                break;
            case 4:
                getAraba("Volvo", "S6O", "Benzin", "Manuel", 45);
                int odenecekMiktar4=kiralanacakGünSayisi*45;
                System.out.println("odenecekMiktar = " + odenecekMiktar4);
                islemeDevamEtmeDöngüsü();
                break;
            case 5:
                getAraba("Mercedes", "A180", "Benzin", "Otomatik", 80);
                int odenecekMiktar5=kiralanacakGünSayisi*80;
                System.out.println("odenecekMiktar = " + odenecekMiktar5);
                islemeDevamEtmeDöngüsü();
                break;
            case 6:
                getAraba("Mercedes", "A180", "Benzin", "Manuel", 70);
                int odenecekMiktar6=kiralanacakGünSayisi*70;
                System.out.println("odenecekMiktar = " + odenecekMiktar6);
                islemeDevamEtmeDöngüsü();
                break;
            case 7:
                getAraba("Mercedes", "Benz", "Dizel", "Otomatik", 80);
                int odenecekMiktar7=kiralanacakGünSayisi*80;
                System.out.println("odenecekMiktar = " + odenecekMiktar7);
                islemeDevamEtmeDöngüsü();
                break;
            case 8:
                getAraba("Mercedes", "Benz", "Dizel", "Manuel", 70);
                int odenecekMiktar8=kiralanacakGünSayisi*70;
                System.out.println("odenecekMiktar = " + odenecekMiktar8);
                islemeDevamEtmeDöngüsü();
                break;
            case 9:
                getAraba("Tesla", "X", "Elektrikli", "Manuel", 100);
                int odenecekMiktar9=kiralanacakGünSayisi*100;
                System.out.println("odenecekMiktar = " + odenecekMiktar9);
                islemeDevamEtmeDöngüsü();
                break;
            case 10:
                getAraba("Tesla", "S", "Elektrikli", "Manuel", 100);
                int odenecekMiktar10=kiralanacakGünSayisi*100;
                System.out.println("odenecekMiktar = " + odenecekMiktar10);
                islemeDevamEtmeDöngüsü();
                break;
            case 11:
                getAraba("Tesla", "Y", "Elektrikli", "Otomatik", 100);
                int odenecekMiktar11=kiralanacakGünSayisi*100;
                System.out.println("odenecekMiktar = " + odenecekMiktar11);
                islemeDevamEtmeDöngüsü();
                break;
            case 12:
                getAraba("Tesla", "C", "Elektrikli", "Otomatik", 100);
                int odenecekMiktar12=kiralanacakGünSayisi*100;
                System.out.println("odenecekMiktar = " + odenecekMiktar12);
                islemeDevamEtmeDöngüsü();
                break;
            default:
                System.out.println("Talep ettiğiniz arac bizde bulunmamaktadır");
        }
    }


    public static void islemeDevamEtmeDöngüsü() {

        System.out.println("Isleme devam etmek icin E´ye \nIslemi sonlandirmak icin H´ye basiniz.");
        String devamMi = scan.nextLine();
        if (devamMi.equalsIgnoreCase("E")) {
            müsteriBilgisi();
        } else if (devamMi.equalsIgnoreCase("H")) {
            arabaÖzellikleri();
        } else {
            System.out.println("Hatali giris yaptiniz.");
            islemeDevamEtmeDöngüsü();
        }
    }


    public static void ödemeBilgileri() throws InterruptedException {

        System.out.println("Kart numaranizi giriniz.");
        String kartNumarasi = scan.nextLine();
        int kartNumarasiUzunluk = 12;
        if (kartNumarasiUzunluk==12){
            System.out.println("Gecerli bir kart numarasi girildi.");
        }else {
            System.out.println("Gecersiz bir kart numarasi girdiniz.\nTekrar deneyiniz.");
            Thread.sleep(3);
            ödemeBilgileri();
        }
        System.out.println("Ödemeniz basarili ile gerceklestirildi. \nBizi tercih ettiginiz icin tesekkür ederiz.");
    }


    public static void müsteriBilgisi() {
              // müsteriBilgisi(){} ---> Yusuf
        System.out.println("************************************");
        System.out.println("Lutfen adinizi ve soyadinizi giriniz: ");
        String adSoyad= scan.nextLine();
        scan.next();
        System.out.println("Lutfen id'nizi giriniz: ");
        String id = scan.next();
        scan.next();
        System.out.println("Lutfen telefon numaranizi giriniz: ");
        String tlf = scan.nextLine();
        scan.next();
        System.out.println("Lutfen yasinizi giriniz: ");
        int yas = scan.nextInt();

        System.out.println("************************************");

        System.out.println("Ad Soyad: "+adSoyad+"\nid: "+id+"\n Telefon: "+tlf+"\nYas: "+yas);

    }


}
