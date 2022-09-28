package classesWithAttributes;
////Java dersleri 31 Engin Demiroğ- Field ve Attribute-- özellik
//bir class aynı zamanda özellik varındıra bilir. 

public class Main {

	public static void main(String[] args) {
		Product product = new Product();
		product.name ="laptop";
		product.id = 6;
        product.description = "Mamoli Marka Laptop";
        product.price = 3000;
        product.stockAmount = 5;

        ProductManager productManager = new ProductManager();
        productManager.Add(product);

	}

}
