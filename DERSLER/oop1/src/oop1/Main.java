package oop1;

// classlar PascalCase  şeklinde isimlendirir.

public class Main {

	public static void main(String[] args) {
		// oop1 nesne yönelimli demek- c# ta gordugumuz mantık.
		// classların içerisindeki isimlendirmelerde camelCase stili kullanılır!!!!

//artık bızım string gibi veri türü olark kullanabıleceğımız bir clasımız var. Product isminde

// şimdi bu yeni clasımızı Main de tanımlanın iskeletini açılayacağım.
// Classın ismi--değişkenin ismi (herhangi bir şey)  =  new -- Classın ismi () ;
//Product                 abc                        =  new       Product   () ;

// kod yaızm stillerinin veya ekollerinin her neyse önemi burada çıkıyor. Büyük küçük harf farkları.
		// not- hocayla aynı gidebilmek için abc değişkenini product1 olaradak
		// geğiştireceğim
		Product product1 = new Product();
		product1.setName("Delongi Kahve Makinesi");
		product1.setDiscount(7);
		product1.setUnitPrice(7899);
		product1.setUnitsInStock(9);
		product1.setImageUrl("bilemmne.jpg");
// şimdi Product clasının ıcerısıne tanımladıgımız product1 nin özelliklerini çağıra bılırız.
// product1. ctrl+space

		// SET VALUE değer atamak gibi
		//product1.name = "Delongi Kahve Makinesi";
		//product1.unitPrice = 7500;
		////product1.discount = 7;
		//product1.unitsInStock = 5;
		//product1.imageUrl = "bilcemne.jpg";
// buradan oluşturduğumuz clasa bir tanım yaptık ve özelliklerini girdik.
// hocam tam lafın üstüne geldi bunun ismi ** SET VALUE** değer atamak gibi		

		// GET VALUE yanı okuyoruz, cağırıyoruz her neyse
		// System.out.println(product1.name);
		Product product2 = new Product();
		//product2.name = "Smeg Kahve Makinesi";
		//product2.unitPrice = 5500;
		//product2.discount = 3;
		//product2.unitsInStock = 9;
		//product2.imageUrl = "bilcemne2.jpg";
		product2.setName("Smeg Kahve Makinesi");
		product2.setDiscount(5);
		product2.setUnitPrice(4899);
		product2.setUnitsInStock(2);
		product2.setImageUrl("bilemmne2.jpg");

		Product product3 = new Product();
		//product3.name = "Kitchen aid Kahve Makinesi";
		//product3.unitPrice = 8500;
		//product3.discount = 8;
		//product3.unitsInStock = 2;
		//product3.imageUrl = "bilcemne3.jpg";
		product3.setName("Kitchen aid Kahve Makinesi");
		product3.setDiscount(1);
		product3.setUnitPrice(9899);
		product3.setUnitsInStock(5);
		product3.setImageUrl("bilemmne3.jpg");

// class a yenı ürünler tanımladık. sımdı bu urunlerı  liste seklınde göstermeyi öğreneceğiz 
// aslında mantık aynı sadece tür olarak Product olacak
// her zzaman bu parantezleri aç kapa ; ardından içine gir kafan rahat olsun
//Class ismimiz listenin formatı     Listemize isimverdik *çoğul*   =    buraya liste formatına uygun veri girilmeili String int veya Product gibi
//Product[]                           products                      =    { };
		Product[] products = {product1, product2, product3 };
		
//biz listeleri foreach ile kullanıyorduk ödevde de var zaten... for ctrl +space iskelet gelsin
	
		
// classta private yaptın  buradakıler patladı. sağ tık + source+ generate gettin and setting yaptık yıne classta
// mainde patlayanları düzeltmek için şimdi yaptığım gibi set get kullnımı olacak.
// bu private set get muhabbetlerının olmasının sebebi yetkilendirme meselesindne ve eskılenden gelen bır durum olusu.
		
		for (Product product : products) {
			System.out.println(product.getName());
			}
		
// inherited kısmında c# ta ogrendıgın gıbı, aslında gibi fazla aynısı. tekrar göstermiş olalım.
//şu anda içi oş olan IndividualCustomer clasını biz extend ettik genişlettik. Customer clası ile. yani demiş olduk ki IdividualCustomer da bir Customer
// bu durumda içerisine generate getter setter falan yapmammış olmamıza rağmen IndividualCustomer in içerisine Customer daki gibi tanımlamalar yapabilir hale geldık
		IndividualCustomer individualCustomer = new IndividualCustomer ();
		individualCustomer.setId(2);
		individualCustomer.setPhone("0542342332");
		
		// bu kısmı IndıvıdualCustomer kısmına özel değişkenleri tanımladık get set olayı ıle.
		individualCustomer.setFirstName("Mustafa");
				
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(4);
		corporateCustomer.setCompanyName("Sabri Company");
		corporateCustomer.setPhone("0850323423423");
		corporateCustomer.setcompanyNumber("34324256");
		
		
		//ınherited ın guzellığı sımdı bırkez daha karsımıza cıkacak. normalde kendınden olmayanlara kızması gerekne bır lıste yaptığımızda
		//extendslerden yanı genışletmelerden kaynaklı kızmadan devam edebılecek
		
		Customer[] customers = {individualCustomer, corporateCustomer};
		
		
		
		
		
		
		
		
	}

}
