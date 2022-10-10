//polimorfizm--
public class Main {
//plug and play --- tak çalıştır.
	public static void main(String[] args) {
//		EmailLogger logger = new EmailLogger();
//		logger.log("loglandın geçmiş olsun.");
		 
		CustomerManager customerManager = new CustomerManager(new FileLogger());
	        customerManager.add();

	}

}
