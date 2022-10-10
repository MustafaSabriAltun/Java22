
public class CustomerManager {
	 private BaseLogger logger;
// buradaki mesele  bagımlı olmamak için  inheritance yapılmıs olan clasın  özel alanı oluşturuluyor prıvate ile
//ardından bı constructor olusturuyor new lendıgınde calısacak olan  ve parametre olarak yıne base  kullanılıyor
//ki bağım kalınmasın tek merkezden değişiklere ayak uydurabılsın.	 
	    public CustomerManager(BaseLogger logger){
	        this.logger = logger;
	    }

	    public void add(){
	        System.out.println("Müşteri eklendi");
	        logger.log("Log mesajı");
	    }
}
