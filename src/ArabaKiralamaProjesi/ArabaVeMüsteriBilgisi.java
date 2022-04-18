package ArabaKiralamaProjesi;

import java.util.Scanner;

public class ArabaVeMüsteriBilgisi {
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
