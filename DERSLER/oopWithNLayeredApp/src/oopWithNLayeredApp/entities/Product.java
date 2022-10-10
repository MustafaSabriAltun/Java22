package oopWithNLayeredApp.entities;

public class Product {
	private int id;
	private  String name;
	private double unitPrice;
	
	//sağ tık source generate construcktion field dedik tıklerı kaldırdık ve yapıcı block oluşturuldu
	
	public Product() {
		super();
	}
// tikleri kadırmadan  oluşturduk aşağıdakı gıbı oluştu
	public Product(int id, String name, double unitPrice) {
		super();
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
	}
	
	// getter setter zaten maalum
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	
	
	
	
	
	
}
