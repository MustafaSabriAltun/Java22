package oopWithNLayeredApp;

import oopWithNLayeredApp.business.ProductManager;
import oopWithNLayeredApp.core.logging.DatabaseLogger;
import oopWithNLayeredApp.core.logging.FileLogger;
import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.core.logging.MailLogger;
import oopWithNLayeredApp.dataAccess.HibernateProductDao;
import oopWithNLayeredApp.dataAccess.jdbcProductDao;
import oopWithNLayeredApp.entities.Product;

//3. ders videosu
//kurumsal bır calısmada verı tabanı kullanmamız sart. bu veri tabanı kullanımında 3 grubu ayrıldı 1Data Access(veri erişim kodları)
//2business geliştirme ve 3uı birde sonra gorecegımız apı denılen bı grup daha var. 
//su anda package açtık orneklerdekı gıbı  isimlerle. bu gruplandırma surdurulebılırlıgı arttırır. düzenli şekilde yerlestiriyo
//bu package leri java proje klasörüne sağ tıklayarak DEĞİL. src içerisindeki packageye new package diyerek yapıyoruz
//oopWithNLayeredApp packege yi sol tık ve aynı package explorer ekranının üst kısmındaki üst üste üç noktaya bastık sonrasında package prenstation
//hiyerarşık kısmını seçtık ve gorunumu değişti.
//
//birbirinini alternetifi olan durumlarda (JDBS ve HİBERNATE) interface yapılır. inheritade gibi bu durum gelıyor daha once C# da görmüştük zaten geliyor gelmekte olan

public class Main {

	public static void main(String[] args) throws Exception {
		Product product1 = new Product(1, "IPhone Xr", 90);
//maın clası bızım arayuzumuz olsun, ve arayuzden bir urun ekleme ornegı canlandırıyoruz.
// arayuzden direl veri tabanına bağlantı yapılmaz şimdi business kısmına gidecek (arada api olmadıgı dusunulur.)	
//		ProductManager productManager = new ProductManager();
//		productManager.add(product1);
// bir katman baska bır katmanın classını kullanırken SADECE İNTERFACESINDEN erişim kurmalıdır!!		
		
		Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger() };
		
// bak coni alternatifler arasında  tür bağımlılığını azaltmak için Manager kızmadan bir alt küme oluşturduk 
// managerin bi şeyden haberi yok içinde bir new  bide hangi türse onu yazıyorsun o calısıyor herkes mutlu hayatında bir sen yoksun ahhh yanımda(ceydacey)		
		ProductManager productManager = new ProductManager(new HibernateProductDao(), loggers);
		productManager.add(product1);
		
		
	}

}
