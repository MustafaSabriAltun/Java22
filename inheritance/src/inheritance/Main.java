package inheritance;

//Java dersleri 36 Engin Demiroğ İNHERİTANCE-- MİRAS önemli
public class Main {
//inheritance mantığını derste extends olarak görmüştük. aynı sekılde C# ta da çokça kullanmıştık.
//nesne yönelimli dillerin olmazsa olmazı ve işleri çok kolaylaştırıyor
	// daha dinamik kodlar yazabilir hale geliyorsun
	public static void main(String[] args) {
		Customer customer = new Customer();
		Employee employee = new Employee();

		EmployeeManager employeeManager = new EmployeeManager();
		CustomerManager customerManager = new CustomerManager();
	}

}
