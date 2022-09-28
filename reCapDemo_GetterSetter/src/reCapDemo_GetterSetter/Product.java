package reCapDemo_GetterSetter;
//Java dersleri 33 Engin Demiroğ
public class Product {
	 //attribute / field
    private int id;
    private String name;
    private String description;
    private double price;
    private int stockAmount;
    private String renk;
    private String kod;

    //getter
    public int getId() {
        return id;
    }

    //setter
    public void setId(int id) {
        this.id = id;
//this demek şu an içerisinde bulunduğun class demek
// Fakat bu unutulabiliyor ve id ler karışabiliyor bunu önlemek için fieldlarda tanımlanan değişkenlerie 
// alt tire (_id) ekleriz ve this kullanımına gerek kalmadan  karışıklığa mahal vermeden ilerleriz.
    }
//bizim 2. derste sağ tık +source+ generate getter setter ile yaptıklarımızı farklı ıde lerde 
//sağ tık+ refactor+ encapsulate fields seklinde ulasılabılır olayı aynı  
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
