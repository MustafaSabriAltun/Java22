package oop1;

//**extends** genişletmek demektir.-- türkçesi bireysel müşteri bir müşteridir.
// içi boş olmasına rağmen artık bu IndividualCustomer da bir Customer olduğu için onun field kısmındaki değişlkenleride tanımlayabildi.
// şimdi sıra bunu Individual yapan özellik olanları atamaya.
public class IndividualCustomer extends Customer{
	private String firstName;
	private String lastName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
