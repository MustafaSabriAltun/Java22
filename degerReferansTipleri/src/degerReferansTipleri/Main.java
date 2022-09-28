package degerReferansTipleri;
//Java dersleri 29 Engin Demiroğ   **çok önemli
public class Main {

	public static void main(String[] args) {

        //reference type
        CustomerManager customerManager = new CustomerManager();
        CustomerManager customerManager2 = new CustomerManager();
        customerManager = customerManager2;
        customerManager.Add();
        customerManager.Remove();
        customerManager.Update();

        //value--değer 
        int sayi1 = 10;
        int sayi2 = 20;
        sayi2 = sayi1;
        sayi1 = 30;
        System.out.println(sayi2);
// instagramdan da  çok kez yapmıştım bu kolaydı.
// stack ten heap a geçmedi hiç değer tipleri.
        
        int[] sayilar1 = new int[]{1, 2, 3};
        int[] sayilar2 = new int[]{4, 5, 6};
        sayilar2 = sayilar1;
        sayilar1[0] = 10;
        System.out.println(sayilar2[0]);
//diziler de claslar gibi referans tiptir. o sebeple cevap 10 oldu.
// fakat burada new le bırlıkte heap kısmına da yazdı bunları ve (sayilar2 = sayilar1;) ile 
// aslında dizilerin içlerindekiler değil direk dizlerin referansları yani
//bilgisayarın belleğindeki numerik ismi aynı oluyor

        
        
        
	}

}