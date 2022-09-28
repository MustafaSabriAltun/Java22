package classes2;
//Java dersleri 28 Engin Demiroğ
public class Main {

	public static void main(String[] args) {
//*****claslar referans tiptir.******* reference type

// metodu çağırmayı tekrar gösteriyor.	
// new lememizin sebebi bellekte diğer clasın kodlarını oluşturmak.
//stock heap olayı.		
		CustomerManager customerManager = new CustomerManager();

		CustomerManager customerManager2 = new CustomerManager();
        customerManager =  customerManager2;
//bir nesnenin bellekte numaralarla tanımlamasını sağlayıp ardından bu numaralamaları birbirine 
//eşitlediğimizde aslında yazdığımız şeyin bellekteki karşılıklarını eşitlemiş oluyoruz.
//bellekte boşa çıkan ve kullanılmayan tanımlar ise GC garbıç collektör:D(garbage collector) çöptoplayıcı tarafından toplanır.
// bellekte bir nesneyi newlemek pahalıdır o sebeple sadece ihtiyaç esnasında newlenir.
// sürdürülebilir bu bedeli ödeyebilir.      
		customerManager.Add();
		customerManager.Remove();
		customerManager.Update();	
	}

}
