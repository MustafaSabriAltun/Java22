package oopWithNLayeredApp.business;

import java.util.List;

import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.dataAccess.jdbcProductDao;
import oopWithNLayeredApp.entities.Product;

public class ProductManager {
	// burada bı seyler yaptık genel maksadımız bu alternatıflerın bagımlılıklarından kurtulmak onu anladım
	// burada da diğer referanslara takılmadan az bagımlılıkla ılerlemesı kodun lakın tam olarak ne yaptıgımızı 
	// çözemedım aslında çözdu de nasıl anlatacagımı bılemıyorum  dk 3. ders 100. dk karşim aç bak.
	private ProductDao productDao;
	private Logger[] loggers; // yönetim bizim aynı anda bütün logları yapmamızı istiyor. logger listesi yaptık
	
	public ProductManager(ProductDao productDao, Logger[] loggers) {
		this.productDao = productDao;
		this.loggers=loggers;
	
	//public ProductManager(ProductDao productDao) {
		//this.productDao = productDao;
		
	}
//dependent on injection -- bağımlılık  enjeksiyonu.
	
	
	
	public void add(Product product) throws Exception {
		//iş kuralları
		if (product.getUnitPrice()<10) {
//throw- fırlatmak demek- exception- istisna kuraldışılık vs demek
// velhasıl bu durumda hata fırlat demek istedik. hata fırlatıldıgında uygulama durur.			
			throw new Exception("bu devirde o kadar ucuz mal mı kaldı, batarsın bak>");
		}
// bunlar kötü kod bılgın olsun zamanla duzelecek-- ama baska bı clası cagırdık.		
//		jdbcProductDao productDao = new jdbcProductDao();
//		productDao.add(product);
		
		//		ProductDao productDao = new jdbcProductDao();
		productDao.add(product);
		
	// interface olan ProductDao  jdbc veya hibernate in verilierini newledi yanı referansını tutu. ınheritade gibi bu da fakat kuralları tutar sanırım.
//polımorfızm
		for (Logger logger : loggers) {// [db, mail]
			logger.log(product.getName());
		}
	
		}
	}

