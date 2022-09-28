package classesConstructor;
//Java dersleri 34 Engin Demiroğ
public class Product {
// overloadıng aşırı yukleme aynı ısımde fakat farklı iskelet halinde kullanabıleceğımız yapılar.
	
    //attribute / field
    private int id;
    private String name;
    private String description;
    private double price;
    private int stockAmount;
    private String renk;
    private String kod;
//*
    public Product(int id, String name, String description, double price, int stockAmount, String renk) {
        System.out.println("Yapıcı blok çalıştı");
//bu da aslında bır metod gıbı hanı clası maınde new lıyorduk ya orada aslında bunu cağırıyorsun gıbı oluyor.
// ardından parametrelı hale sokup butun bılgıyı ısteyerek calıstırmasını ıstıyoruz        
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.stockAmount = stockAmount;
        this.renk = renk;
    }
    public Product(){

    }

    //getter
    public int getId() {
        return id;
    }

    //setter
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getKod() {
        return this.name.substring(0,1) + id;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }
}
