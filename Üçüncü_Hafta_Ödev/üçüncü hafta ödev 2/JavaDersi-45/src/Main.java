
public class Main {
// bir metodu  static yaptıgında class ısmıyle dırek cağırılır ve program sıfırlanana kadar bellekten cıkarılmaz
//	
	public static void main(String[] args) {
		ProductManager manager = new ProductManager();
        Product product = new Product();
        product.price = 10;
        product.name="Mouse";
        manager.add(product);

        //inner class kullanımı. temel classlar sonradan statik yapılarak ıcerısındekılerın tamamını static yapamıyor
        //c#da yapılır lakın javada yapılmaz.  bunun ıcın clasın ıcerısınde class imzasıyla statık class olusturulur.
        //buna da inner class denir. ama kullanılması tavsıye edılmez. 
        DatabaseHelper.Connection.createConnection();

	}

}
