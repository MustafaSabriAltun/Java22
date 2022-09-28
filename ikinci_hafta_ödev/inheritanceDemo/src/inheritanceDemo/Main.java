package inheritanceDemo;
//Java dersleri 37 Engin Demiroğ İNHERİTANCE-- MİRAS önemli
//inheritance nin en önemli özelliği daha çnceki örnekte gördüğümüz gibi kodun dinamizmini arttırmasıdır
//kllanıcının değişen taleblerini karşılayabilmek önemlidir.
public class Main {
// bir class sadece 1 clası inherite edebilir.
	public static void main(String[] args) {
		 KrediUI krediUI = new KrediUI();
	        krediUI.KrediHesapla(new AskerKrediManager());
//krediUI.KrediHesapla(new AskerKrediManager()); bu koda TarımKrediManager veya OgretmenKrediManager dediğimizde
// sıkıntı cıkmaması olayıne POLİMORFİZM denir. çokçok şekilli falan demek türkçesi.
	        
	}

}
