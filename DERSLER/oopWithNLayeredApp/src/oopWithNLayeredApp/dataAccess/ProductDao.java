package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public interface ProductDao {
	void add(Product product);
	// interfaceler sadece metod imzasını barındırabilir.
	//bunu yaptıktan sonra alternatıf claslara gıdıp burada olan metodu sileceğiz ve implements ProductDao
	//yapacagız ve buradaki metodlar o classlarda da kullanıla bılır olacak lakın butun strüktürü aynı olmak
	//zorunda. onun kullarına uymak zorunda INTERFACENIN Kurallarına
	//
	
}

