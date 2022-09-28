package methods2;

public class Main {
//                                   args-- argümandan gelir.
	public static void main(String[] args) {
//void operasyon fonksiyonu veya methodu-- emir gibi yap dersın yapar.
//return operasyonlar ise çalıştığında bir şey dondurur lakin onu kullanmadıgın zaman göremezsın.
//		
		
        String mesaj = "Bugün hava çok güzel";
        String yeniMesaj = sehirVer();
        System.out.println(yeniMesaj);
        int sayi = topla(15, 7);
        System.out.println(sayi);
    }

    public static void ekle() {
        System.out.println("Eklendi");
    }

    public static void sil() {
        System.out.println("Silindi");
    }

    public static void guncelle() {
        System.out.println("Güncellendi");
    }
//                          fonksiyon parametreleri     
    public static int topla(int sayi1, int sayi2) {
        return sayi1 + sayi2; // yapılacak aksiyon.
    }

    public static String sehirVer() {
        return "Ankara";

	}
  //Java dersi 25 Engin Demiroğ
}
