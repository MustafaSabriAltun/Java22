package classesWithAttirbutes2;
////Java dersleri 32 Engin Demiroğ  Encapsulation ihtiyacını anlamak 
public class Main {
//C# da defauldu  private tır fakat javada publıc tir
	public static void main(String[] args) {
		Product product = new Product();
        product.name = "Laptop";
        product.id = 1;
        product.description = "Marka Laptop";
        product.price = 5000;
        product.stockAmount = 3;
        product.renk="";

        ProductManager productManager = new ProductManager();
        productManager.Add(product);
	}
}
