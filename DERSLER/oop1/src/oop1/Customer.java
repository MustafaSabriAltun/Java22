package oop1;

//inherit yanı miras mantığını anlatacak..
//ve bir önceki getter setterları da kullanıyor.
public class Customer {
	private int id;
	private String customerNumber;
	private String phone;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
