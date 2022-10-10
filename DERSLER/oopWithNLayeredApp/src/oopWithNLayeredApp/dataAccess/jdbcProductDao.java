package oopWithNLayeredApp.dataAccess;
//interface çokomelli bır konudu mülakatlarda en çok sorulan sorulardan bırıdır.
import oopWithNLayeredApp.entities.Product;

//jdbc bir databaseye erişim yöntemi en eskılerden hala bunların kullanıldıgı projeler mevcut..
// Dao ise Data acces obje nın kısaltması bu da kullanılan bır isimlendirme verı tabanı objesı

public class jdbcProductDao implements ProductDao  {
// bu katmana sadece db erişim  kodları buraya yazılır. SQL
	public void add (Product product) {
		System.out.println("JDBC ile veritabanından eklendi ");
//şimdi hadi diyelım ürün ekledık aynı ürünü tekrar eklememe olaşına DOMAİN diyorlarmıs. aynı bankaya aynı tc ıle bır kez daha kayıt olamamak gibi
//	domain aslında iş alanı falan demek ama buradakı maksat iş kuralları.
// orneğin işin doğasına göre bazı kurallar koymak istersin bunlar değişiklik gösterir projeden projeye veya aynı projede zamanla 
//bu durumdaki kuralları ise İŞ kısmına yanı business packagesinin içerisine yazıyoruz.		
	}
	
}
//Hibernate gelldii daha yeni bir yöntem diyelim jdbc eskı olan yöntem
