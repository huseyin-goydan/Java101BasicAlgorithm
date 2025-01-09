/**
 * @Huseyin G.
 */

import java.util.Scanner;
import java.lang.Math;

public class Java101Basic {


    public static void main(String[] arg){
        OrtHesap();
        KdvTutar();
        DikUcgen();
        TaksiMetre();
        DilimAlanHesap();
        VkIndeks();
        ManavHesap();
    }
    // Not Ortalaması
    public static void OrtHesap(){

        Scanner sc = new Scanner(System.in);

        int matematik, fizik, kimya, turkce, tarih, muzik;
        System.out.print("Mat notunu gir: ");
        matematik = sc.nextInt();

        System.out.print("Fizik notunu gir: ");
        fizik = sc.nextInt();

        System.out.print("Kimya notunu gir: ");
        kimya = sc.nextInt();

        System.out.print("Türkçe notunu gir: ");
        turkce = sc.nextInt();

        System.out.print("Tarih notunu gir: ");
        tarih = sc.nextInt();

        System.out.print("Müzik notunu gir: ");
        muzik = sc.nextInt();

        int toplam = matematik+fizik+kimya+turkce+tarih+muzik;
        double sonuc = toplam/6;
        String check = (sonuc >= 60) ? "Sınıfı Geçti" : "Sınıfta Kaldı";

        System.out.println("Ortalamanız : " +sonuc+ "\nGeçme Durumu: " +check);
    }

    // Kdv Tutar hesaplama
    public static void KdvTutar(){

        Scanner sc = new Scanner(System.in);
        double tutar;
        double kdvOrani;

        System.out.print("Ürün Fiyatini gir: ");
        tutar = sc.nextDouble();
        kdvOrani = (tutar>0 && tutar<=1000) ? 0.18 : 0.08;

        System.out.println("Kdv'siz Tutar"+tutar+"\nKdv Tutarı: "+(tutar*kdvOrani)+"\nToplam Tutar"+(tutar*kdvOrani+tutar));
    }

    public static void DikUcgen(){

        Scanner sc = new Scanner(System.in);
        double kenarBir, kenarIki, kenarUc;

        System.out.print("Kenar 1'i giriniz: ");
        kenarBir = sc.nextDouble();
        System.out.print("Kenar 2'yi giriniz: ");
        kenarIki = sc.nextDouble();
        System.out.print("Kenar 3'ü giriniz: ");
        kenarUc = sc.nextDouble();

        double u=(kenarBir+kenarIki+kenarUc)/2;
        System.out.println(Math.sqrt(u*(u-kenarBir)*(u-kenarIki)*(u-kenarUc)));
        //Karekök hesabı için Math.sqrt kullanıldı
    }

    public static void TaksiMetre(){

        Scanner sc = new Scanner(System.in);
        int km;
        double perKm = 2.2, startPrice = 10;

        System.out.println("Km degerini gir: ");
        km = sc.nextInt();

        double total = (km * perKm + startPrice)<20 ? 20:(km * perKm + startPrice) ;

        System.out.println("Ödenecek ücret: "+total);

    }


    public static void DilimAlanHesap(){
        /**
         * 𝜋 sayısını = 3.14 alınız.
         *
         * Formül : (𝜋 * (r*r) * 𝛼) / 360
         */

        Scanner sc = new Scanner(System.in);
        double pi=3.14, r, a;

        System.out.println("Dairenin yaricapini gir: ");
        r=sc.nextDouble();
        System.out.println("İlgili dilimin açisini gir: ");
        a=sc.nextDouble();
        System.out.println("Alan: "+(pi*(r*r)*a)/360);
    }

    public static void VkIndeks(){
        /**
         * Formül
         * Kilo (kg) / Boy(m) * Boy(m)
         */

        Scanner sc = new Scanner(System.in);
        double boy, kilo;

        System.out.println("Boyunuzu metre giriniz: ");
        boy = sc.nextDouble();
        System.out.println("Kilonuzu giriniz: ");
        kilo = sc.nextDouble();
        System.out.println(kilo/(Math.pow(boy,2)));
        //Karesini almak için Math.pow kullanıldı
    }

    public static void ManavHesap(){
        /**
         * Armut : 2,14 TL
         * Elma : 3,67 TL
         * Domates : 1,11 TL
         * Muz: 0,95 TL
         * Patlıcan : 5,00 TL
         */

        Scanner sc = new Scanner(System.in);
        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.0, toplam=0;

        System.out.println("Armut kaç kilo");
        toplam += armut * sc.nextDouble();
        System.out.println("Elma kaç kilo");
        toplam += elma * sc.nextDouble();
        System.out.println("Domates kaç kilo");
        toplam += domates * sc.nextDouble();
        System.out.println("Muz kaç kilo");
        toplam += muz * sc.nextDouble();
        System.out.println("Patlıcan kaç kilo");
        toplam += patlican*sc.nextDouble();

        System.out.println("Toplam Tutar: "+toplam);
    }
}
