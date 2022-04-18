
package ArabaKiralamaProjesi;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArabaVeMüsteriBilgisi extends AracIsteme {

    static List<AracIsteme> aracTalepListesi = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);
    static int kiralanacakGünSayisi;


    public static void aracTalepEt() {
        // aracTalep(){} ---> Kadir + Berk
    }


    public static void getAraba(String marka, String model, String yakitTürü, String vites, Integer günlükKiralamaÜcreti) {
        // getAraba(){} ---> Kadir + Berk
    }


    public static void arabaÖzellikleri() {
        // arabalar(){}  ---> Meryem + Fikriye
        //yakit arti gunluk kiralalma ucreti ekleyebiliriz, kilometre basina

        AracIsteme volvoDizelOtomatik = new AracIsteme("Volvo", "S6O", "Dizel", "Otomatik", 50);
        AracIsteme volvoDizelManuel = new AracIsteme("Volvo", "S6O", "Dizel", "Manuel", 45);
        AracIsteme volvoBenzinOtomatik = new AracIsteme("Volvo", "S4O", "Benzin", "Otomatik", 65);
        AracIsteme volvoBenzinManuel = new AracIsteme("Volvo", "S6O", "Benzin", "Manuel", 45);
        AracIsteme mercedesBenzinOtomatik = new AracIsteme("Mercedes", "A180", "Benzin", "Otomatik", 80);
        AracIsteme mercedesBenzinManuel = new AracIsteme("Mercedes", "A180", "Benzin", "Manuel", 70);
        AracIsteme mercedesDizelOtomatik = new AracIsteme("Mercedes", "Benz", "Dizel", "Otomatik", 80);
        AracIsteme mercedesDizelManuel = new AracIsteme("Mercedes", "Benz", "Dizel", "Manuel", 70);
        AracIsteme teslaXElektrikli = new AracIsteme("Tesla", "X", "Elektrikli", "Manuel", 100);
        AracIsteme teslaSElektrikli = new AracIsteme("Tesla", "S", "Elektrikli", "Manuel", 100);
        AracIsteme teslaYElektrikli = new AracIsteme("Tesla", "S", "Elektrikli", "Otomatik", 100);
        AracIsteme teslaCElektrikli = new AracIsteme("Tesla", "S", "Elektrikli", "Otomatik", 100);


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


    }


    public static void islemeDevamEtmeDöngüsü() {
        // islemeDevamDongusu(){} ---> Yusuf
    }


    public static void ödemeBilgileri() {
        // ödemeBilgileri(){}; ---> Yusuf
    }


    public static void müsteriBilgisi() {
        // müsteriBilgisi(){} ---> Yusuf
    }




    public static void aracTalep() {
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
}}

