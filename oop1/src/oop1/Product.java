package oop1;
//classlar ***PascalCase**  şeklinde isimlendirir.
public class Product {
	//domain-- iş
	//field- alan - clasın alanları vs
	//class içerisinde, field larda ***camelCase*** kullanılır.
	
	
	private String name;
	private double unitPrice;
	private double discount;
	// bu urunun bır fotografı olabılır. YA DA
	private String imageUrl;
	//Birden FAZLA fotoğrafı olabilir. Tak bi anda liste oldu gördün mü yaa işte öyle.
//	String [] imageUrls;
	private int unitsInStock;
	//private sadece yazılabılsın veya sadece okuna bılsınle alakalı ozel bır sart olusturacagız sanırım gelecekte 
	//tam anlamaıdm lakin böyle bi şey. böyle yapmaya alış dedi.
	// sadece o CLASSIN İÇERİSİNDE KULLANILABİLİR DEMEKMİŞ:D şuan main patladı.
	
	
// boş bir satıra gidip sağ tıklıyorsun ardından source sonrasaında Generate getter and setter a basıyorsun 
//seçili olan class dokumanlarının hepsının okuma ve yazma iskeletlerini kendılıgınden olusturuyor.	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public int getUnitsInStock() {
		return unitsInStock;
	}
	public void setUnitsInStock(int unitsInStock) {
		this.unitsInStock = unitsInStock;
	}


	
	
	
	
}
