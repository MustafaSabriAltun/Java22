package methods3;
//varible argümans-- hoca genelde kolaksiyonlarla calısmayı tercih edermiş.
// sebebi daha kontrollu test edilebilir yapıda olmasıymış.
public class Main {

	public static void main(String[] args) {

        String mesaj = "Bugün hava çok güzel";
        String yeniMesaj = sehirVer();
        System.out.println(yeniMesaj);
        int sayi = topla(15, 7);
        System.out.println(sayi);
        int toplam = topla2(2,3,4);
        System.out.println(toplam);
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

    public static int topla(int sayi1, int sayi2) {
        return sayi1 + sayi2;
    }
// bir önceki derste toplama işlemini 2 parametre isteyerek yapmıştık şimdi sınırsız paramtretle işlem yapmayı öğreneceğiz
//bu sınırsız parametreye **VARİABLE ARGUMENTS** denir. değişken argüman demektir.
// genel meted yapısı ismi  ( tür... ismi   ) {alınacak aksiyon } bu durumda3 nokta burayı sınırsız parametrelı yapar.
    public static int topla2( int...   sayilar) {
        int toplam = 0;
        for (int sayi : sayilar) {
            toplam += sayi;
        }
        return toplam;
// teknik olarak sayılar diye bi array oluşturuyor arka planda bu ... 3 nokta onun oluşmasını sağlıyor.
// sonrasında alınan aksiyonlara aynı bi liste döner gibi for döngüsüyle dönüyoruz        
    }

    public static String sehirVer() {
        return "Ankara";

	}

}//Java dersi 26 Engin Demiroğ
