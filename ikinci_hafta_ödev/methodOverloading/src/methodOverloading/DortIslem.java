package methodOverloading;
//Java dersleri 35 Engin Demiroğ
public class DortIslem {
	public int Topla(int sayi1, int sayi2){
        return sayi1 + sayi2;
    }
//iki sayı toplayabiliyorum herhangi bir sayfada
//fakat kullanıcılar artık 3 sayıyı da toplamak istiyor. aslında bi değişiklik yok sadece özellik eklenecek
//ve fark ettiysenız isimleri birebir aynı  fakat kızmıyor bunun sebebi tamamen aynı işi yapıyor almaları
//bu olaya OverLoading denir.-- ve kullanım esnasında biri 2 biri 3 parametre ister dilediğini seçer calışırsın
	
    public int Topla(int sayi1, int sayi2, int sayi3){
        return sayi1 + sayi2 + sayi3;
    }
}
