package methods;
//Programlamada DRY prensibi-- Dont Repeat Yourself-- kendini tekrar etme anlamına gelir.
// basit ve fonksiyonel olmalı.
public class Main {

	public static void main(String[] args) {
		
		sayiBulmaca();
        sayiBulmaca();
        sayiBulmaca();
        sayiBulmaca();
    }
// mainin dışında yine maine benzer bir metod oluşurduk phytonda ki fonksiyon gibi yanlıs anlamadıysam burada oluşturudugmuz  kod bloğunu
// başka sayfalarda da tek satırda çalıştırmak gibi. Metodla fonksiyonu eş anlamlı olarak kullnıyor hoca ıkısını de dıyor yanı
//java da kodlar mainde calısır yanı maıne yazmadıgın bır kodu calıstıramazsın fakat bız nrmal kodumuzu fonksiyon halıne getırdık sonrasında 
//maıne sadece sadece 1 satırda butün bu kodları çalıştırmasını sağladık.	
// tabıı bu durum değişiklikleri de kolaylıkla yapabılırsınız
	
	
    //camelCase
    public static void sayiBulmaca() {
        int[] sayilar = new int[]{1, 2, 5, 7, 9, 0};
        int aranacak = 9;
        boolean varMi = false;

        for (int sayi : sayilar) {
            if (sayi == aranacak) {
                varMi = true;
                break;
            }
        }

        String mesaj = "";
        if (varMi) {
            mesaj = "Sayı mevcuttur: " + aranacak;
            mesajVer(mesaj);
        } else {
            mesaj = "Sayı mevcut değildir: " + aranacak;
            mesajVer(mesaj);
        }

    }
//metodun genel yapısı    metodun ismi    (istenilen parametre türü ve ismi)       {yapılacak aksiyon }
    public static void      mesajVer           (String mesaj)                      {
        System.out.println(mesaj);
// burada farklı bır metod veya fonksiyon oluşturuyoruz sürekli yazdırma işlemimni yaparken kolaylık sağlaması için
//lakin bu farklı bir fonksiyon olduğu için değişkenleri tanımıyor. bu durumda bizde fonksiyonun ihtiyac duyduğu değişkeni istiyoruz
// buna **PARAMETRELİ METOD DENİR**---

	}

}//Java dersi 24 Engin Demiroğ
